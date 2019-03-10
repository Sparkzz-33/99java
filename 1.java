/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class GFG {
    public static boolean prime(int query)
    {
        int i = 2;
        int flag = 0;
        while(i <= Math.sqrt(query))
        {
            if(query%i==0)
            {
                flag = 1;
                break;
            }
            i++;
        }
        if(flag == 0)
            return true;
        return false;
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(prime(a));
	}
}