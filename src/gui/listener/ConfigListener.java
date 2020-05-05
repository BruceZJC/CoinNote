package gui.listener;
 
import gui.panel.ConfigPanel;
import gui.utility.GUIUtil;
import service.ConfigService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
 
public class ConfigListener implements ActionListener{
 
    @Override
    public void actionPerformed(ActionEvent e) {
        ConfigPanel p = ConfigPanel.instance;
        if(!GUIUtil.checkNumber(p.tfBudget, "Budget"))
            return;
        String mysqlPath =p.tfMysqlPath.getText();
        if(0!=mysqlPath.length()){
            File commandFile = new File(mysqlPath,"bin/mysql.exe");
            if(!commandFile.exists()){
                JOptionPane.showMessageDialog(p, "Mysql Path Incorrect");
                p.tfMysqlPath.grabFocus();
                return;
            }
        }
         
        ConfigService cs= new ConfigService();
        cs.update(ConfigService.budget,p.tfBudget.getText());
        cs.update(ConfigService.mysqlPath,mysqlPath);
         
        JOptionPane.showMessageDialog(p, "Setting Succeeded");
 
    }
 
}