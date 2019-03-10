/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class GFG {
    public static void towerofhanoii(int n, char from, char to, char aux)
    {
        if(n==1)
        {
            System.out.println("Move disc 1 from rod " + from + " to rod " + to);
            return;
        }
        towerofhanoii(n-1, from, aux, to);
        System.out.println("Move disc "+ n +" from rod " + from +  " to rod " + to);
        towerofhanoii(n-1, aux, to, from);
    }
	public static void main (String[] args) {

	//	System.out.print("Enter the number of rods : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	  //  System.out.print("Enter the number of rods: ");
	    int b = sc.nextInt();
	    char A = 'A';
	    char B = 'B';
	    char C = 'C';
	    towerofhanoii(a,A,B,C);
	}
}