import java.util.*;
import java.lang.*;

class SortedSquaredArray {

/* 
    Input array elements will be sorted
    Output array must be sorted

    Linear time complexity
*/

    public static int[] function(int[] ar, int n) {
        int res[] = new int[n];

        int p1 = 0, p2 = ar.length - 1;
        int idx = p2;

        while (idx >= 0) {
            if (Math.abs(ar[p1]) > Math.abs(ar[p2])) {
                res[idx--] = ar[p1] * ar[p1];
                p1 += 1;
            } else {
                res[idx--] = ar[p2] * ar[p2];
                p2 -= 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) ar[i] = sc.nextInt();

        System.out.println(Arrays.toString(function(ar, n)));

    }
}


Input:
6
[-6, -4, -3, 1, 2, 5]

Output:

[1, 4, 9, 16, 25, 36]