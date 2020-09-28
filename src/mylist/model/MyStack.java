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
public class MyStack<T> extends MyList<T>{

    public MyStack() {
        super();
    }
    public void push(T info){
        super.addToBegin(info);
    }
    
}
