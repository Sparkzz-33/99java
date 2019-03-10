import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class yash
{   
    public static void sort(int []a)
    {
        int i, n = a.length;
        //System.out.println(n);
        int lower = 0;
        while(lower<n)
        {
            int j = 0;
            int min = a[lower];
        for(i=lower;i<n;i++)
        {
            if(a[i]<=min)
             {
                min = a[i];
                j = i;
             }
        }
       // System.out.println(j);
        int temp = a[j];
        a[j] = a[lower];
        a[lower] = temp;
        lower++;
        }
    }
    public static void print(int []a)
    {
        int i, n = a.length;
        for(i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static void main (String[] args) 
    {
        int []a =new int[]{2,46,12,45,27,89,1};
        print(a);
        sort(a);
        System.out.println("The sorted array is : ");
        print(a);
    }
}