package gui.panel;

import gui.utility.ColorUtil;
import gui.utility.GUIUtil;

import javax.swing.*;

public class RecoverPanel extends JPanel {
    public static RecoverPanel instance = new RecoverPanel();

    JButton bRecover =new JButton("Recover Now");

    public RecoverPanel() {

        GUIUtil.setColor(ColorUtil.blueColor, bRecover);
        this.add(bRecover);

    }

    public static void main(String[] args) {
        GUIUtil.showPanel(RecoverPanel.instance);
    }

}
