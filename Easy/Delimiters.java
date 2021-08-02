import java.io.*;
import java.util.*;

public class Delimiters{

/* Given a string, , matching the regular expression [A-Za-z !,?._'@]+, 
   split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. 
   Then, print the number of tokens, followed by each token on a new line. */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        if(s.equals(""))    System.out.println(0);
        else{
            String delims = "[ !,?.@'_]+";
            String[] tokens = s.split(delims);
            System.out.println(tokens.length);
            for(String str: tokens){
                System.out.println(str);
            }
        }
        scan.close();
    }
}

Input: 
He is a very very good boy, isn't he?

Output:
10
He
is
a
very
very
good
boy
isn
t
he