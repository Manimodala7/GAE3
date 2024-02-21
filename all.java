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
    int data;
    all next;
    all(int data){
        this.data=data;
        this.next=null;
    }
    public static class llist {
        private all head;

        public void llist() {
            this.head = null;
        }

        public void add(int data) {
            all newNode = new all(data);
            if (head == null) {
                head=newNode;
            }else{
                all current=head;
                while(current.next!=null){
                    current=current.next;
                }
                current.next=newNode;
            }
        }

        public void display() {
            if(head==null){
                System.out.print("There are no elements in the list...!");
            }
            else{
                all current=head;
                System.out.print("Elements of th linked list are:  ");
                while(current!=null){
                    System.out.print(current.data + " ");
                    current=current.next;
                }
            }
        }
    }
    public static void main(String[] args){
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