import java.io.*;
import java.util.*;
import java.lang.*;
public class p1
{
	public static void removed(ArrayList<Integer> a, int r)
	{
		int n = a.size();
		int i = 0, temp;
		while(i<n)
		{
			System.out.print(a.get(i) + " ");
			i++;
		}
		System.out.println();
		i = 0;
		int k = 0;
		while(i<n)
		{
		    
		    if((i+1-k)%r==0)
			{
			   // System.out.println(i);
				a.remove(i);
				k++;
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

