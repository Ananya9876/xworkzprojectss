package com.xworkz.practiceprogram;


class node{
    int value;
    node next;
}


public class Linked {
    public static void main(String[] args) {
        node node2=new node();
        node2.value=5;
        node2.next=null;

        node node1=new node();
        node1.value=13;
        node1.next=node2;

        while (node1!=null){
            System.out.println(node1.value);
            node1=node1.next;
        }
    }
}
