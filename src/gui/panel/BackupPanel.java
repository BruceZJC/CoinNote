package gui.panel;

import gui.utility.ColorUtil;
import gui.utility.GUIUtil;

import javax.swing.*;

public class BackupPanel extends JPanel {
    public static BackupPanel instance = new BackupPanel();
    JButton bBackup =new JButton("Backup now");

    public BackupPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bBackup);
        this.add(bBackup);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(BackupPanel.instance);
    }

}