package com.startup;

public class LinkedListMain {


    public static void main(String[] args) {

       for (int i =1 ; i < 101 ;i++){
           insert_node(i,i+100);

       }
       print_ll();
       delete_node(100);
       print_ll();
        /*insert_node(1,101);
        insert_node(2,201);
        insert_node(3,301);
        insert_node(7,401);
        insert_node(5,501);
        print_ll();
        System.out.println();
        delete_node(3);
        delete_node(4);

        print_ll();*/


    }
    static class node {
        int data;
        node next;
        public node() {
            this.data = 0;
            this.next = null;
        }
    }
    static node root = null;
    static int size_of_ll = 0;
    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if (position >= 1 && position <= size_of_ll + 1) {
            node newNode = new node();
            newNode.data = value;
            if (position == 1) {
                newNode.next = root;
                root = newNode;
            } else {
                int count = 1;
                node prev = root;
                while (count < position - 1) {
                    prev = prev.next;
                    count++;
                }
                newNode.next = prev.next;
                prev.next = newNode;

            }
            size_of_ll++;
        }
    }

    public static void delete_node(int position) {
        // @params position, integer
        if (position >= 1 && position <= size_of_ll) {
            node temp = null;
            if (position == 1) {
                temp = root;
                root = root.next;
            } else {
                int count = 1;
                node prev = root;
                while (count < position - 1) {
                    prev = prev.next;
                    count++;
                }
                temp = prev.next;
                prev.next = prev.next.next;
            }
            size_of_ll--;
        }
    }

    public static void print_ll() {
        // Output each element followed by a space
        node temp = root;
        int flag = 0;
        while (temp != null) {
            if (flag == 0) {
                System.out.print(temp.data);
                flag = 1;
            } else
                System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }


}
