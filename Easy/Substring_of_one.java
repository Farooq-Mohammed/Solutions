import java.util.*;
import java.lang.*;
import java.io.*;

class Substring_of_one {

/* Given a binary string, count number of substrings that start and end with 1. */

	static int function(String str){
		int one = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='1')	one++;
		}
		return one*(one-1)/2;
		
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(function(str));
		
	}
}

Link: https://ideone.com/D9PFZR