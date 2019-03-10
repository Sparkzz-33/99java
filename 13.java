import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.lang.Math;
public class binary_search
{
    public static int binary_search(int []a, int value, int lower, int higher)
    {
        if(higher>=lower)
        {
            int middle = lower + (higher - lower)/2;
            if(value > a[middle])
                return binary_search(a,value,middle+1,higher);
            else if(value == a[middle])
                return middle;
            else
                return binary_search(a,value, lower,middle-1);
        }
        if(a[lower]==value)
            return lower;
        return -1;
    }
    public static void main(String[] args)
    {
        int a[] = {0,4,18,23,45,78,96};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = binary_search(a,n,0,6) + 1;
        if(flag==0)
            System.out.println("Element not found...");
        else
        System.out.println("Element at "+flag+" position");
    }
}