import java.io.*;
import java.util.*;
public class p1
{
	public static void removed(ArrayList<Integer> a)
	{
		int n = a.size();
		int i = 0, temp;
		while(i<n)
		{
		    int k,j;
		    if(a.get(i)==a.get(i+1))
		    {    a.remove(i);
		        n--;
		    }
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
        while(i<6)
        {
            a.add(i);
            i++;
        }
        a.add(6);
        a.add(6);
        a.add(7);
        a.add(7);
        removed(a);
    }
}

