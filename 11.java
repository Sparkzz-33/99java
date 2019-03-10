import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.lang.Math;
public class matrix
{
    public static void multiply(int [][]a, int [][]b, int m1, int n1, int m2, int n2)
    {
        int [][]c = new int [m1][n2];
        int i,j,k,l;
        int sum = 0;
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n2;j++)
            {
                k = 0;
                l = 0;
                sum = 0;
               // System.out.println(a[0][1]);
               // System.out.println(b[1][0]);
                while(k<n1&&l<m2)
                {
                    sum = sum + a[i][k]*b[l][j];
                    k++;
                    l++;
                }
                //System.out.println(sum);
                c[i][j] = sum;
            }
        }
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n2;j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the number of rows and columns in Matrix 1: ");
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.println("Enter the number of rows and columns in Matrix 2: ");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int [][]a = new int[m1][n1];
        int [][]b = new int[m2][n2];
        int i = 0, j = 0;
        int []input1 = new int[m1*n1];
        int []input2 = new int[m2*n2];
        for(i=0;i<m1;i++)
            {
                for(j=0;j<n1;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            for(i=0;i<m2;i++)
            {
                for(j=0;j<n2;j++)
                {
                    b[i][j] = sc.nextInt();
                }
            }
        multiply(a,b,m1,n1,m2,n2);
    }
}