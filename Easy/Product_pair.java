//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

import java.io.*;
import java.util.*;
import java.lang.*;

class Product_pair {

    /* Pair with given product (Find if any pair exists) */

    public static String function(int[] ar, int target) {

        if (ar.length < 2) return "No";

        HashSet<Integer> set = new HashSet<>();
        for (int item : ar) {
            if (target % item == 0) {
                if (set.contains(target / item)) return "Yes";
                set.add(item);
            }
        }
        return "No";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) ar[i] = sc.nextInt();

        int x = sc.nextInt();

        System.out.println(function(ar, x));

    }
}