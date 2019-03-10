import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int palindrome(String a, int low, int high)
    {
        if(low>=high)
                return 0;
        else if(a.charAt(low)!=a.charAt(high))
        {
             return 1;
        }
        else
            return palindrome(a,low+1,high-1);
        
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
        String temp = sc.nextLine();
        while(n>0)
        {
            String a = sc.nextLine();
            int len = a.length();
            int flag = 0;
            flag = palindrome(a,0,len-1);
            if(flag==0)
                System.out.println(a + " is a palindrome");
            else
                System.out.println(a + " is not a palindrome");
            n = n-1;
        }
    }
}