import java.util.*;
import java.lang.*;
import java.io.*;

class SetBits {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//count set bits
		int cnt = 0;
		while(n>0){
			cnt += (n%2==1 ? 1 : 0);
			n /= 2;
		}
		System.out.println(cnt);
	}
}

Link: https://ideone.com/dU24bz