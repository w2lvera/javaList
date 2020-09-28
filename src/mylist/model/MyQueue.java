/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist.model;

/**
 *
 * @author Netbeans
 */
public class MyQueue<T> extends MyList<T>{

    public MyQueue() {
        super();
    }
    public void push(T info){
        super.addToEnd(info);
    }
}
