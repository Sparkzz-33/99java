import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.lang.Math;
public class armstrong
{
    public static void arm(int n)
    {
        int len = 0;
        int temp = n;
        while(temp>0)
        {
            temp /= 10;
            len++;
        }
        temp = n;
        int sum = 0;
        while(temp > 0)
        {
            int c = temp % 10;
            sum = sum + (int)Math.pow(c,len); 
            temp /= 10;
        }
        if(sum==n)
            System.out.println(n + " is an armstrong number");
        else
            System.out.println(n + " is not an armstrong number");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arm(n);
    }
}