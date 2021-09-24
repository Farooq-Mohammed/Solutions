class SetBits {
	public static void main (String[] args) {
		int n = 59;
		//count set bits
		int cnt = 0;
		while (n != 0) {
		    n = n & (n - 1);
		    cnt += 1;
		}
		System.out.println(cnt);
	}
}
