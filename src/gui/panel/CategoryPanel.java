package gui.panel;

import gui.model.CategoryTableModel;
import gui.utility.ColorUtil;
import gui.utility.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class CategoryPanel extends JPanel{
    public static CategoryPanel instance = new CategoryPanel();

    public JButton bAdd = new JButton("Add New");
    public JButton bEdit = new JButton("Edit");
    public JButton bDelete = new JButton("Remove");
    String columNames[] = new String[]{"Categories","Number of Consumption"};

    public CategoryTableModel ctm = new CategoryTableModel();
    public JTable t =new JTable(ctm);

    public CategoryPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bAdd,bEdit,bDelete);
        JScrollPane sp =new JScrollPane(t);
        JPanel pSubmit = new JPanel();
        pSubmit.add(bAdd);
        pSubmit.add(bEdit);
        pSubmit.add(bDelete);

        this.setLayout(new BorderLayout());
        this.add(sp,BorderLayout.CENTER);
        this.add(pSubmit,BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(CategoryPanel.instance);
    }

}