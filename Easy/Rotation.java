import java.util.*;
import java.lang.*;

class Rotation {

    /* Program for array rotation(left) */
    
    public static int GCD(int a, int b){
        if(b == 0)  return a;

        return GCD(b, a%b);
    }

    public static int[] function(int[] ar, int rotate) {
        int n = ar.length;
        rotate %= n;
        int sets = GCD(n, rotate);
        System.out.println("This is GCD: "+sets);

        for (int i = 0; i < sets; i++) {
            int temp = ar[i];
            int j = i;

            while (true) {
                int d = (j + rotate) % n;
                if (d == i){
                    break;
                }
                ar[j] = ar[d];
                j = d;
            }
            ar[j] = temp;
        }
        return ar;

    }

    public static void print(int[] ar){
        for(int i: ar){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) ar[i] = sc.nextInt();

        int rotation = sc.nextInt();

        print(function(ar, rotation));

    }
}