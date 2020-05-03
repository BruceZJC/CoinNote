package gui.model;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.List;

public class CategoryComboBoxModel implements ComboBoxModel<String>{
    public List<String> cs = new ArrayList<>();

    String c;
    public CategoryComboBoxModel(){
        cs.add("Dining");
        cs.add("Traffic");
        cs.add("Households");
        cs.add("Grocery");
        c = cs.get(0);
    }

    @Override
    public int getSize() {
        return cs.size();
    }

    @Override
    public String getElementAt(int index) {
        return cs.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setSelectedItem(Object anItem) {
        c = (String) anItem;

    }

    @Override
    public Object getSelectedItem() {
        // TODO Auto-generated method stub
        return c;
    }

}