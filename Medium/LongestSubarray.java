import java.util.*;
import java.lang.*;

class LongestSubarray{
/*
    Given an array of integers nums and an integer limit, return the size of the 
    longest non-empty subarray such that the absolute difference between 
    any two elements of this subarray is less than or equal to limit.
*/

    public static int function(int n, int[] ar, int limit) {
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();

        int i = 0, j;
        int res = 1;

        for (j = 0; j < n; j++) {
            while (!max.isEmpty() && ar[j] > max.peekLast()) max.pollLast();
            while (!min.isEmpty() && ar[j] < min.peekLast()) min.pollLast();

            max.add(ar[j]);
            min.add(ar[j]);

            if (!max.isEmpty() && !min.isEmpty() && max.peekFirst() - min.peekFirst() > limit) {
                if (max.peekFirst() == ar[i]) max.poll();
                if (min.peekFirst() == ar[i]) min.poll();
                ++i;
            }
        }

        return j-i;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) ar[i] = sc.nextInt();

        int limit = sc.nextInt();

        System.out.println(function(n, ar, limit));
    }
}