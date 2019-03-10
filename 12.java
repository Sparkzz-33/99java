import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.lang.Math;
public class bubble_sort
{
    public static void bubble(int []a)
    {
        int len = a.length;
        int i,j,k, flag = 0;
        while(flag==0)
        {   
            for(i=0;i<len-1;i++)
            {
                if(a[i]>a[i+1])
                {
                    flag = 1;
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            if(flag==0)
                break;
            flag = 0;
        }
    }
    public static void print(int []a)
    {
        int len = a.length;
        int i = 0;
        for(i=0;i<len;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int a[] = {12,4,56,34,89,123,0};
        print(a);
        bubble(a);
        System.out.println("The sorted array is : ");
        print(a);
    }
}