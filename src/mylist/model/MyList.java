/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist.model;

/**
 *
 * @author Volushkova.VL
 */
public class MyList<T> {

    public int getSize() {
        int n=0;
        for(Node<T>i = head; i!=null ;  i=i.next )n++;
        return n;
    }
    class Node<T>{
        private T info;
        private Node<T> next;

        public Node(T info, Node<T> next) {
            this.info = info;
            this.next = next;
        }

        public Node() {
        }

        public Node(T info) {
            this.info = info;
        }

        public void setInfo(T info) {
            this.info = info;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
        
        
    }
    Node<T> head;
    Node<T> tail;

    

    public MyList() {
        head = null;
        tail = null;
    }
    public void addToEnd(T info){
        if(head ==null){
            head = new Node(info,null);
            tail= head;
        }
        else{
            Node<T> current = new Node<>(info,null);
            tail.next = current;
            tail = current;
                }
    }
    public void addToBegin(T info){
        if(head ==null){
            head = new Node(info,null);
            tail= head;
        }
        else{
            Node<T> current = new Node<>(info,head);
            head = current;
        }
    }
    public T pop(){
        Node<T> current = head;
        head = head.next;
        return current.info;
    }
    public T getIndex(int ind){
        int j=0;
        Node<T> i= head;
        for(; i.next!=null &&j<ind; j++, i=i.next );
        return i.info;
    }

    @Override
    public String toString() {
        String str = "";
        for(Node<T>i = head; i!=null ;  i=i.next )
        str+=i.info +" ";
        return str;
    }
    
}
