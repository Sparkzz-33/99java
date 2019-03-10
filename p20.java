import java.io.*;
import java.util.*;
public class p20
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>(9);
		int i = 0;
	
		while(i<9)
		{
			a.add(i);
			i++;
		}
		int n = a.size();
		System.out.println(a.size());
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		a.remove(r-1);
		i = 0;
		while(i<a.size())
		{
		    System.out.print(a.get(i));
		    i++;
		}
		System.out.println();
	}
}