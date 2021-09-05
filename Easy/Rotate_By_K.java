import java.util.*;
import java.io.*;

class Rotate_By_K{
/*
Rotate the array by k times towards right

Input:
5 2
1 2 3 4 5

Output:
4 5 1 2 3

*/
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] inp = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inp[0]);
        int k = Integer.parseInt(inp[1]);

        int[] ar = new int[n];
        String[] inp1 = br.readLine().trim().split(" ");

        for (int i = 0; i < n; i++) ar[i] = Integer.parseInt(inp1[i]);
        k = k%n;

        for(int i=0;i<n;i++){
            if(i<k){
                bw.write(ar[(n+i-k)]+" ");
            }
            else {
                bw.write(ar[(i-k)]+" ");
            }
        }
        bw.write("\n");

        bw.flush();
    }
}