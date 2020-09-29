/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
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
    JButton button3;
    JList jList;
    ListModel listModel;
    public MyPanel() {
        list=new MyStack();
        listModel = new ListModel();
        listModel.setList(list);
        field = new JTextField("                 ");
        field.requestFocus(true);
        button = new JButton("push");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.push(field.getText().trim());
                listModel.fireIntervalAdded();
                field.setText("");
                field.requestFocus(true);
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
                field.setText("");
                field.requestFocus(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list=new MyQueue();
                listModel.setList(list);
                listModel.fireIntervalAdded();
                field.setText("");
                field.requestFocus(true);
            }
        });
        button3 = new JButton("pop");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s =(String)list.pop();
                listModel.fireIntervalAdded();
                field.setText(s);
                field.requestFocus(true);
            }
        });
        jList = new JList();
        jList.setModel(listModel);
        jList.setPrototypeCellValue("много букв             ");
        JComponent [][] component = new JComponent[3][2];
        component[0][0] = field;
        component[0][1] = button;
        component[1][0] = new JScrollPane(jList);
        component[1][1] = button3;
        component[2][0] = button1;
        component[2][1]= button2;
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints(); 
        constraints.fill = GridBagConstraints.HORIZONTAL; 
        for(int i=0;i<3;i++)
        {
            constraints.gridy   = i  ; 
            for(int j=0;j<2;j++)
            {
                 constraints.gridx = j;
                 add(component[i][j],constraints);
            }
                
        }
        /////////////
        //constraints.ipady     = 5;    // установить первоначальный размер кнопки 
        //constraints.weighty   = 2.0;  // установить отступ
        /////////////////
       // constraints.weighty = 1.5;

        
    }

    public void setList(MyList list) {
        this.list = list;
    }
    
}
