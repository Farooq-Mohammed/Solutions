import java.util.Scanner;

public class Anagrams{

    /* Strings */

    static boolean isAnagram(String a, String b) {
        
        int n = a.length();
        int m = b.length();
        if(n!=m)    return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int cnt1[] = new int[26];
        int cnt2[] = new int[26];
        
        for(int i=0;i<n;i++){
            cnt1[a.charAt(i)-'a']+=1;
        }
        for(int i=0;i<m;i++){
            cnt2[b.charAt(i)-'a']+=1;
        }
        
        for(int i=0;i<26;i++){
            if(cnt1[i] != cnt2[i]){
                return false;
            }
        }
        return true;        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
