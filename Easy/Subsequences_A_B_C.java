import java.util.*;
import java.lang.*;
import java.io.*;

class Subsequences_A_B_C {
	
/*	Given a string, count number of subsequences of the form aibjck, 
	i.e., it consists of i ’a’ characters, followed by j ’b’ characters, followed by k ’c’ characters 
	where i >= 1, j >=1 and k >= 1. 
*/
	
	static int function(String str){
		
		int[] cnt = new int[3];
 
        	for (int i = 0; i < str.length(); i++) {
            		if (str.charAt(i) == 'a')
                		cnt[0] = (1 + 2 * cnt[0]);
 
            		else if (str.charAt(i) == 'b')
                		cnt[1] = (cnt[0] + 2 * cnt[1]);
 
            		else if (str.charAt(i) == 'c')
                		cnt[2] = (cnt[1] + 2 * cnt[2]);
        	}
 
        	return cnt[2];
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(function(str));
	}
}

Link: https://ideone.com/XTh3Hk
