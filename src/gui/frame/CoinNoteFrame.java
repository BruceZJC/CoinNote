package gui.frame;

import gui.listener.SpendPanelListener;
import gui.panel.SpendPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
class CoinNoteFrame {
 
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(600, 450);
        f.setTitle("CoinNote");
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JToolBar tb = new JToolBar();
        JButton bSpend = new JButton("Spend");
        JButton bRecord = new JButton("Make a record");
        JButton bCategory = new JButton("Categories");
        JButton bReport = new JButton("Monthly review");
        JButton bConfig = new JButton("Setting");
        JButton bBackup = new JButton("Backup");
        JButton bRecover = new JButton("Recovery");
 
        tb.add(bSpend);
        tb.add(bRecord);
        tb.add(bCategory);
        tb.add(bReport);
        tb.add(bConfig);
        tb.add(bBackup);
        tb.add(bRecover);
        f.setLayout(new BorderLayout());
        f.add(tb, BorderLayout.NORTH);
        f.add(new JPanel(), BorderLayout.CENTER);
         
        f.setVisible(true);

        f.add(SpendPanel.instance, BorderLayout.CENTER);
         
        bSpend.addActionListener(new SpendPanelListener());

        bRecord.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
            }
        });
        bCategory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
            }
        });
        bConfig.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
            }
        });
        bBackup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
            }
        });
        bRecover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
            }
        });
 
    }
}