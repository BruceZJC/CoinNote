package gui.utility;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GUIUtil {
    public static void setImageIcon(JButton b, String fileName, String tip) {
        ImageIcon i = new ImageIcon(new File("C:\\Software S\\Github\\coinnote\\src\\img", fileName).getAbsolutePath());
        b.setIcon(i);
        b.setPreferredSize(new Dimension(61, 81));
        b.setToolTipText(tip);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setText(tip);
    }

    public static void setColor(Color color, JComponent... cs) {
        for (JComponent c : cs) {
            c.setForeground(color);
        }
    }

    /**
     *
     * @param p
     * @param strechRate 拉伸比例1表示满屏幕
     */
    public static void showPanel(JPanel p,double strechRate) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        CenterPanel cp = new CenterPanel(strechRate);
        f.setContentPane(cp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        cp.show(p);
    }

    public static void showPanel(JPanel p) {
        showPanel(p,0.85);
    }

    public static boolean checkNumber(JTextField tf, String input) {
        if (!checkEmpty(tf, input))
            return false;
        String text = tf.getText().trim();
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, input + "Integer needed");
            tf.grabFocus();
            return false;
        }
    }

    public static boolean checkZero(JTextField tf, String input) {
        if (!checkNumber(tf, input))
            return false;
        String text = tf.getText().trim();

        if (0 == Integer.parseInt(text)) {
            JOptionPane.showMessageDialog(null, input + " Cannot be 0");
            tf.grabFocus();
            return false;
        }
        return true;
    }

    public static boolean checkEmpty(JTextField tf, String input) {
        String text = tf.getText().trim();
        if (0 == text.length()) {
            JOptionPane.showMessageDialog(null, input + "Cannot be empty");
            tf.grabFocus();
            return false;
        }
        return true;

    }

    public static int getInt(JTextField tf) {
        return Integer.parseInt(tf.getText());
    }

    public static void useLNF() {
        try {
            javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
