import java.util.*;
import java.lang.*;
import java.io.*;

class Maximum_Product_Pair {
	static int function(int[] ar, int n){
		if(n<2)	return 0;
		
		Arrays.sort(ar);
		return Math.max(ar[0]*ar[1], ar[n-1]*ar[n-2]);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i=0;i<n;i++)	ar[i] = sc.nextInt();
		
		System.out.println(function(ar, n));
	}
}

Link: https://ideone.com/k3mga8
