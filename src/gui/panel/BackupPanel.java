package gui.panel;

import gui.listener.BackupListener;
import gui.utility.ColorUtil;
import gui.utility.GUIUtil;

import javax.swing.*;

public class BackupPanel extends WorkingPanel {
    public static BackupPanel instance = new BackupPanel();
    JButton bBackup = new JButton("Backup Now");

    public BackupPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bBackup);
        this.add(bBackup);
        addListener();
    }

//    public static void main(String[] args) {
//        GUIUtil.showPanel(BackupPanel.instance);
//    }

    @Override
    public void updateData() {

    }

    @Override
    public void addListener() {
        BackupListener listener = new BackupListener();
        bBackup.addActionListener(listener);
    }

}