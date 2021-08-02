import java.util.*;
import java.lang.*;
import java.io.*;

class Count_all_possible_paths{

/* Count all possible paths from top left to bottom right of a mXn matrix */

	static int fu(int m, int n) {
		
		if(m == 1 || n == 1 )	return 1;
		
		return fu(m,n-1) + fu(m-1,n);
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		
		System.out.println(fu(m,n));
	}
}

Link: https://ideone.com/PHdNuu