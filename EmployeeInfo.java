
package ssipmt;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;
public class EmployeeInfo extends JFrame implements ActionListener{
    
    JTable t1;
    JButton b1,b2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    EmployeeInfo(){
        t1 = new JTable();
        t1.setBounds(0,40,1000,500);
        add(t1);
        
      JLabel l1 = new JLabel("Name");
      l1.setBounds(40,10,70,20);
      add(l1);
      
        
      JLabel l2 = new JLabel("Age");
      l2.setBounds(170,10,70,20);
      add(l2);
        
          
      JLabel l3 = new JLabel("Gender");
      l3.setBounds(280,10,70,20);
      add(l3);
        
      JLabel l4 = new JLabel("Department");
      l4.setBounds(400,10,70,20);
      add(l4);
        
      JLabel l5 = new JLabel("Salary");
      l5.setBounds(540,10,70,20);
      add(l5);
        
      JLabel l6 = new JLabel("Phone");
      l6.setBounds(670,10,70,20);
      add(l6);
        
      JLabel l7 = new JLabel("Aadhar");
      l7.setBounds(780,10,70,20);
      add(l7);
        
      JLabel l8 = new JLabel("Email");
      l8.setBounds(900,10,70,20);
      add(l8);
        
      
        b1 =  new JButton("Load Data");
        b1.setBounds(350,560,120,30);
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
        
          b2 =  new JButton("Back");
        b2.setBounds(500,560,120,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        getContentPane().setBackground(Color.WHITE);
        
       setLayout(null);
       setBounds(450,200,1000,650);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                Conn c = new Conn();  
                String str = "select * from employee";
                ResultSet rs =c.s.executeQuery(str);
                   t1.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
                System.out.print(e);
            }
        }else if(ae.getSource() == b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
public static void main(String[] args){
    
        new EmployeeInfo().setVisible(true);
    
    
}
}