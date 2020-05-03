package gui.panel;

import gui.utility.CircleProgressBar;
import gui.utility.ColorUtil;
import gui.utility.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class SpendPanel extends JPanel {
    public static SpendPanel instance = new SpendPanel();

    public JLabel lMonthSpend = new JLabel("This Month");
    public JLabel lTodaySpend = new JLabel("Today");
    public JLabel lAvgSpendPerDay = new JLabel("Average Consumption");
    public JLabel lMonthLeft = new JLabel("Current Month Remaining");
    public JLabel lDayAvgAvailable = new JLabel("Average Remaining");
    public JLabel lMonthLeftDay = new JLabel("Days Left");

    public JLabel vMonthSpend = new JLabel("$2300");
    public JLabel vTodaySpend = new JLabel("$25");
    public JLabel vAvgSpendPerDay = new JLabel("$120");
    public JLabel vMonthAvailable = new JLabel("$2084");
    public JLabel vDayAvgAvailable = new JLabel("$389");
    public JLabel vMonthLeftDay = new JLabel("15 Days");

    CircleProgressBar bar;

    public SpendPanel() {
        this.setLayout(new BorderLayout());
        bar = new CircleProgressBar();
        bar.setBackgroundColor(ColorUtil.blueColor);

        GUIUtil.setColor(ColorUtil.grayColor, lMonthSpend, lTodaySpend, lAvgSpendPerDay, lMonthLeft, lDayAvgAvailable,
                lMonthLeftDay, vAvgSpendPerDay, vMonthAvailable, vDayAvgAvailable, vMonthLeftDay);
        GUIUtil.setColor(ColorUtil.blueColor, vMonthSpend, vTodaySpend);

        vMonthSpend.setFont(new Font("Times New Roman", Font.BOLD, 23));
        vTodaySpend.setFont(new Font("Times New Roman", Font.BOLD, 23));

        this.add(center(), BorderLayout.CENTER);
        this.add(south(), BorderLayout.SOUTH);

    }

    private JPanel center() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(west(), BorderLayout.WEST);
        p.add(center2(),BorderLayout.CENTER);

        return p;
    }

    private Component center2() {
        return bar;
    }

    private Component west() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 1));
        p.add(lMonthSpend);
        p.add(vMonthSpend);
        p.add(lTodaySpend);
        p.add(vTodaySpend);
        return p;
    }

    private JPanel south() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 4));

        p.add(lAvgSpendPerDay);
        p.add(lMonthLeft);
        p.add(lDayAvgAvailable);
        p.add(lMonthLeftDay);
        p.add(vAvgSpendPerDay);
        p.add(vMonthAvailable);
        p.add(vDayAvgAvailable);
        p.add(vMonthLeftDay);

        return p;
    }

    public static void main(String[] args) {

        GUIUtil.showPanel(SpendPanel.instance);
    }

}