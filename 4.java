import java.io.*;
import java.util.Scanner;
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
    }
}