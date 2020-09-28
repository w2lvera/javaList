/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import mylist.model.MyList;
import mylist.model.MyQueue;
import mylist.model.MyStack;

/**
 *
 * @author Netbeans
 */
public class MyPanel extends JPanel{
    
    MyList list;
    
    JTextField field;
    JButton button;
    JButton button1;
    JButton button2;
    JList jList;
    ListModel listModel;
    public MyPanel() {
        list=new MyStack();
        listModel = new ListModel();
        listModel.setList(list);
        field = new JTextField("                 ");
        button = new JButton("push");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.push(field.getText().trim());
                listModel.fireIntervalAdded();
            }
        });
        button1 = new JButton("stack model");
        JButton button2 = new JButton("Queue model");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list=new MyStack();
                listModel.setList(list);
                listModel.fireIntervalAdded();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list=new MyQueue();
                listModel.setList(list);
                listModel.fireIntervalAdded();
            }
        });
        jList = new JList();
        jList.setModel(listModel);
        jList.setPrototypeCellValue("много букв");
        add(field);
        add(button);
        add(button1);
        add(button2);
        add(new JScrollPane(jList));
        
    }

    public void setList(MyList list) {
        this.list = list;
    }
    
}
