package com.mani.all;
import org.w3c.dom.Node;

import java.util.*;

/*public class all {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the no' of Elements u want....! : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the Elements u want : ");
        for(int i=0;i<n;i++){
            System.out.print("Enter Element " + (i+1) + ": ");
            arr[i]= sc.nextInt();
        }

        System.out.print("\nEnter the Elements : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}*/
public class all {
    public void display(){}
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        llist list=new llist();
        System.out.print("Enter the size of linked list... : ");
        int n=sc.nextInt();
        System.out.println("Enter the elements as u want...!");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            list.add(data);
        }
        System.out.print("Here is the display of the Linked list: ");
        list.display();
    }
}