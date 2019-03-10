import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class Linkedlist
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static Linkedlist insert(Linkedlist list, int value)
    {
        Node temp = new Node(value);
        temp.next = null;
        if(list.head==null)
        {
            list.head = temp;
        }
        else
        {
            Node current = list.head;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next = temp;
        }
        return list;
    }
    public static Linkedlist reverse(Linkedlist a)
    {
        Node current = a.head;
        Stack <Integer> s1 = new Stack<Integer>();
        while(current!=null)
        {
            s1.push(current.data);
            current = current.next;
        }
        current = a.head;
       // System.out.println(s1.peek());
       // System.out.println(s1.empty());
        while(s1.empty()==false&&current!=null)
        {
            current.data = s1.peek();
           // System.out.println("Data is : " + current.data);
            s1.pop();
            current = current.next;
        }
       // System.out.println(a.head.data + "-----");
        return a;
    }
    public static void print(Linkedlist a)
    {
        Node current = a.head;
        while(current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args)
    {
        Linkedlist a = new Linkedlist();
        int i = 1;
        while(i<=10)
        {
            a = insert(a, i);
            i++;
        }
        print(a);
        System.out.println();
        System.out.println("The reversed linked list is: ");
        a = reverse(a);
        print(a);
    }
}