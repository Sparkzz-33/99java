import java.io.*;
import java.util.*;
public class p1
{
	public static void reverse(ArrayList<Integer> a)
	{
		int n = a.size();
		int i = 0, temp;
		while(i<n/2)
		{
			temp = a.get(i);
			a.set(i, a.get(n-i-1));
			a.set(n-i-1, temp);
			i++;
		}
		i = 0;
		while(i<n)
		{
			System.out.print(a.get(i) + " ");
			i++;
		}
		System.out.println();
	}
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer> (9);
        int i = 1;
        while(i<10)
        {
            a.add(i);
            i++;
        }
        reverse(a);
    }
}

