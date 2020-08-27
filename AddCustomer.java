
package ssipmt;
import javax.swing.*;
import java.awt.Font;
import java.awt.*;
public class AddCustomer extends JFrame{
    
    
    AddCustomer(){
        
        JLabel l1 = new JLabel("New Customer Form");
        l1.setBounds(100,20,300,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN ,20));
        l1.setForeground(Color.BLUE);
        add(l1);
        
        JLabel l2 = new JLabel("ID");
        l2.setBounds(35,80,100,30);
        add(l2);
        
          
        JLabel l3 = new JLabel("Number");
        l3.setBounds(35,120,100,30);
        add(l3);
        
          
        JLabel l4 = new JLabel("Name");
        l4.setBounds(40,160,100,30);
        add(l4);
        
          
        JLabel l5 = new JLabel("Gender");
        l5.setBounds(40,200,100,30);
        add(l5);
        
          
        JLabel l6 = new JLabel("Country");
        l6.setBounds(40,240,100,30);
        add(l6);
        
          
        JLabel l7 = new JLabel("Allocated Room Number");
        l7.setBounds(40,280,150,30);
        add(l7);
        
          
        JLabel l8 = new JLabel("Checked In");
        l8.setBounds(40,320,100,30);
        add(l8);
        
          
        JLabel l9 = new JLabel("Deposit");
        l9.setBounds(40,360,100,30);
        add(l9);
        
        getContentPane().setBackground(Color.WHITE  );
        
        setLayout(null);
        setBounds(500,200,900,500);
        setVisible(true);
        
    }
    public static void main(String[] args){
        new AddCustomer().setVisible(true);
    }
}
