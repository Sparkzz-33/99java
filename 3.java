/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class GFG {
    public static int calculate(int a, int b, int c)
    {
        switch(c)
        {
            case 1:
                return a + b;
                //break;
            case 2:
                return a - b;
                //break;
            case 3:
                return a * b;
                //break;
            case 4:
                return a / b;
                //break;
        }
        return -1;
    }
	public static void main (String[] args) {
    System.out.println("1 for add, 2 for subtract, 3 for multiplication, 4 for division, 5 for modulus");
    System.out.println("First enter the two numbers: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Enter your choice: ");
    int c = sc.nextInt();
    System.out.println(calculate(a,b,c));
	}
}