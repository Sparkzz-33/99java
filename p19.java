import java.io.*;
import java.util.*;
import java.lang.*;
public class p1
{
	public static void removed(ArrayList<Integer> a, int r)
	{
		int n = a.size();
		int i = 0;
		while(i<n)
		{
			System.out.print(a.get(i) + " ");
			i++;
		}
		System.out.println();
		i = 0;
		int k = 0;
		while(i<r)
		{
		    int l = 0,m;
			int temp = a.get(0);
			while(l<n-1)
			{
				a.set(l,a.get(l+1));
				l++;
			}
			a.set(l, temp);
		    
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
        Scanner sc = new Scanner(System.in);
		int r =  sc.nextInt();
        removed(a, r);
    }
}

