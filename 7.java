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
    public static Linkedlist remove (Linkedlist a, int value)
    {
        Node current = a.head;
        if(a.head.data == value)
        {
            a.head = a.head.next;
        }
        else
        {
             while(current.next.data!=value)
            {
                current = current.next;
            }
            current.next = current.next.next;
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
        System.out.println("Enter the value to be removed ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        a = remove(a, value);
        print(a);
    }
}