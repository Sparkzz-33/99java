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
        int temp = current.data;
        while(current.next!=null)
        {
            temp = current.data;
            current.data = current.next.data;
            current.next.data = temp;
            if(current.next.next == null)
                break;
            
                current = current.next.next;
            
            
        }
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
        System.out.println("The pairwise reversed linked list is: ");
        a = reverse(a);
        print(a);
    }
}