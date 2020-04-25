package gui.panel;

import javax.swing.*;

public class SpendPanel extends JPanel {
    public static SpendPanel instance = new SpendPanel();

    public JLabel lMonthSpend = new JLabel("Current Month");
    public JLabel lTodaySpend = new JLabel("Today");
    public JLabel lAvgSpendPerDay = new JLabel("Average Consumption");
    public JLabel lMonthLeft = new JLabel("Current Month Remaining");
    public JLabel lDayAvgAvailable = new JLabel("Average Remaining");
    public JLabel lMonthLeftDay = new JLabel("Days Left");

    public JLabel vMonthSpend = new JLabel("￥2300");
    public JLabel vTodaySpend = new JLabel("￥25");
    public JLabel vAvgSpendPerDay = new JLabel("￥120");
    public JLabel vMonthAvailable = new JLabel("￥2084");
    public JLabel vDayAvgAvailable = new JLabel("￥389");
    public JLabel vMonthLeftDay = new JLabel("15天");

    private SpendPanel(){

    }

}
