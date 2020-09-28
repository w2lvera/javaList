/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist.view;

import javax.swing.AbstractListModel;
import mylist.model.MyList;

/**
 *
 * @author Netbeans
 */
public class ListModel extends AbstractListModel<String>{

    public void setList(MyList<String> list) {
        this.list = list;
    }
    MyList<String> list;
    
    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public String getElementAt(int index) {
        return list.getIndex(index);
    }
    // Оповещение видов о добавлении, если они есть
     //           fireIntervalAdded(this, 0, data.size());
    
}
