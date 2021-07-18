/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlconnect;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author coco
 */
public class dbcon {
    private Connection con;
    private Statement stat;
    private ResultSet rs;
    public dbcon(){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/vetclinic","root","7112");
          stat=con.createStatement();
        
        }
        catch(HeadlessException | ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public Statement getStat() {
        return stat; //To change body of generated methods, choose Tools | Templates.
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
