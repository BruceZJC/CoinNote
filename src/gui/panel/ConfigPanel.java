package gui.panel;

import gui.listener.ConfigListener;
import gui.utility.ColorUtil;
import gui.utility.GUIUtil;
import service.ConfigService;

import javax.swing.*;
import java.awt.*;

public class ConfigPanel extends WorkingPanel {

    public static ConfigPanel instance = new ConfigPanel();

    JLabel lBudget = new JLabel("Budget($)");
    public JTextField tfBudget = new JTextField("0");

    JLabel lMysql = new JLabel("Mysql Path");
    public JTextField tfMysqlPath = new JTextField("");

    JButton bSubmit = new JButton("Update");

    public ConfigPanel() {
        GUIUtil.setColor(ColorUtil.grayColor, lBudget, lMysql);
        GUIUtil.setColor(ColorUtil.blueColor, bSubmit);

        JPanel pInput = new JPanel();
        JPanel pSubmit = new JPanel();
        int gap = 40;
        pInput.setLayout(new GridLayout(4, 1, gap, gap));

        pInput.add(lBudget);
        pInput.add(tfBudget);
        pInput.add(lMysql);
        pInput.add(tfMysqlPath);

        pSubmit.add(bSubmit);

        this.setLayout(new BorderLayout());
        this.add(pInput, BorderLayout.NORTH);
        this.add(pSubmit, BorderLayout.CENTER);

        addListener();
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(ConfigPanel.instance);
    }

    @Override
    public void updateData() {
        String budget = new ConfigService().get(ConfigService.budget);
        String mysqlPath = new ConfigService().get(ConfigService.mysqlPath);
        tfBudget.setText(budget);
        tfMysqlPath.setText(mysqlPath);
        tfBudget.grabFocus();
    }

    public void addListener() {
        ConfigListener l =new ConfigListener();
        bSubmit.addActionListener(l);
    }

}