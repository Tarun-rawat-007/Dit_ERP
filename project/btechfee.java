package project;


import java.awt.*;
import javax.swing.*;

public class btechfee extends JFrame{
    btechfee(){

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("project\\img\\f2.jpg")); // ADD IMG
        Image i2 =i.getImage().getScaledInstance(700, 300, Image.SCALE_DEFAULT);    //image scalle
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); // set image in jalbel
        image.setBounds(100,50,700,300);
        add(image);


        setSize(1000,500);
        setLocation(200,100);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);               //bacground white
        setTitle("Btech fee Structure");
        setVisible(true);
    }
    public static void main(String[] args) {
        new btechfee();
        
    }
    
}
