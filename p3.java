import java.io.*;
import java.util.*;
public class p1
{
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
		int k = sc.nextInt();
        System.out.println(a.get(k-1));
    }
}

