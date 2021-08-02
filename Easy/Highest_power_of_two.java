import java.util.*;
import java.lang.*;
import java.io.*;

class Highest_power_of_two {

/* Highest power of 2 less than or equal to given number */

	static int function(int N){
		
		int po = (int)(Math.log(N)/Math.log(2));
		return 1<<po;

	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(function(n));
	}
}

Link: https://ideone.com/mRPZtM