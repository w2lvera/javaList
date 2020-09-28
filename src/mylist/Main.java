/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist;

import mylist.model.MyList;
import mylist.view.MyFrame;
import mylist.view.MyPanel;

/**
 *
 * @author Netbeans
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.addToBegin("one");
        list.addToBegin("two");
        list.addToEnd("-one");
        list.addToEnd("-two");
        System.out.println(list);
        MyPanel panel = new MyPanel();
        MyFrame frame = new MyFrame(panel);
    }
    
}
