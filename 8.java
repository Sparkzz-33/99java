import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class sorting{
    public static void sort(int[] a)
    {
        int i,j, n = a.length;
        for(i=1;i<n;i++)
        {
            int k = a[i];
            j = i-1;
            while(a[j]>k&&j>0)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = k;
        }
    }
    public static void print(int[] a)
    {
        int i, n = a.length;
        for(i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int []a = new int[]{2,56,34,89,7,88,13,254,5,47};
        print(a);
        sort(a);
        System.out.println("The sorted array is : ");
        print(a);
    }
}