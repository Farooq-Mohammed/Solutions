import java.util.*;
import java.lang.*;
import java.io.*;

class Replace_With_Greatest_On_Right {
	static void function(int[] ar, int n){
		
		ArrayList<Integer> res = new ArrayList<>();
		
		res.add(-1);
		int max = ar[n-1];
		
		for(int i=n-1;i>0;i--){
			max = Math.max(max, ar[i]);
			res.add(0, max);
		}
		System.out.println(res.toString());
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i=0;i<n;i++){
			ar[i] = sc.nextInt();
		}
		
		function(ar, n);
		
	}
}

Link: https://ideone.com/YUGcvt