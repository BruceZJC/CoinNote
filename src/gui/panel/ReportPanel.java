package gui.panel;

import entity.Record;
import gui.utility.ChartUtil;
import gui.utility.GUIUtil;
import service.ReportService;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ReportPanel extends WorkingPanel {
    public static ReportPanel instance = new ReportPanel();

    public JLabel l = new JLabel();

    public ReportPanel() {
        this.setLayout(new BorderLayout());
        Image i =ChartUtil.getImage(800, 400);
        ImageIcon icon= new ImageIcon(i);
        l.setIcon(icon);
        this.add(l);
    }


    public static void main(String[] args) {
        GUIUtil.showPanel(ReportPanel.instance);
    }

    @Override
    public void updateData() {
        List<Record> rs= new ReportService().listThisMonthRecords();
        Image i = ChartUtil.getImage(rs,350,250);
        ImageIcon icon = new ImageIcon(i);
        l.setIcon(icon);

    }


    @Override
    public void addListener() {

    }
}