package gui.panel;

import gui.utility.ColorUtil;
import gui.utility.GUIUtil;
import gui.listener.RecoverListener;

import javax.swing.*;

public class RecoverPanel extends WorkingPanel {
    public static RecoverPanel instance = new RecoverPanel();

    JButton bRecover =new JButton("Recover Now");

    public RecoverPanel() {

        GUIUtil.setColor(ColorUtil.blueColor, bRecover);
        this.add(bRecover);
        addListener();
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(RecoverPanel.instance);
    }


    @Override
    public void updateData() {
        // TODO Auto-generated method stub

    }

    @Override
    public void addListener() {
        RecoverListener listener = new RecoverListener();
        bRecover.addActionListener(listener);
    }

}
