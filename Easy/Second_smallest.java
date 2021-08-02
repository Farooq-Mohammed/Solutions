import java.util.*;
import java.lang.*;

class Second_smallest {

    /* Find the smallest and second smallest elements in an array */

    public static int[] function(int[] ar) {
        int n = ar.length;
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        int[] res = new int[2];
        res[0] = first;
        res[1] = second;

        if (n < 2) return res;

        for (int x : ar) {
            if (x < first){
                second = first;
                first = x;
            }
            else if(x < second && x > first){
                second = x;
            }
        }
        res[0] = first;
        res[1] = second;
        return res;
    }

    public static void print(int[] ar) {
        for(int n: ar)
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) ar[i] = sc.nextInt();

        print(function(ar));

    }
}