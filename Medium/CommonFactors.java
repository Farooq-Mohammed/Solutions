import java.util.*;
/*
Print the number of common factors of a and b.

Constraints:
1<= a, b <= 10^12

Input: 10 15
Output: 2
*/
class CommonFactors{
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(div(Math.min(a,b), Math.max(a,b)));
    }

    public static long gcd(long a, long b) {
        if(a == 0)  return b;
        return gcd(b%a, a);
    }
    
    public static long div(long a, long b){
        long n = gcd(a,b);
        long res = 0;

        for(int i=1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                if(n/i == i){
                    res += 1;
                } else {
                    res += 2;
                }
            }
        }
        return res;
    }
}