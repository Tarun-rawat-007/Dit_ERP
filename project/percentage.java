package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class percentage extends JFrame implements ActionListener{

    JLabel l1 =new JLabel("Subject 1:");
    JLabel l2 =new JLabel("Subject 2:");
    JLabel l3 =new JLabel("Subject 3:");
    JLabel l4 =new JLabel("Subject 4:");
    JLabel l5 =new JLabel("Subject 5:");
    JLabel l6 =new JLabel("Enter total marks:");


    JTextField t1 =new JTextField();
    JTextField t2 =new JTextField();
    JTextField t3 =new JTextField();
    JTextField t4 =new JTextField();
    JTextField t5 =new JTextField();
    JTextField t6 =new JTextField();
    JTextField t7 =new JTextField();

    JButton b=new JButton("Result:");

    percentage(){
        l1.setBounds(20,40,120,20);
        l2.setBounds(20,80,120,20);
        l3.setBounds(20,120,120,20);
        l4.setBounds(20,160,120,20);
        l5.setBounds(20,200,120,20);
        l6.setBounds(20,260,120,20);
        l6.setForeground(Color.blue);
        
        t1.setBounds(160,40,120,20);
        t2.setBounds(160,80,120,20);
        t3.setBounds(160,120,120,20);
        t4.setBounds(160,160,120,20);
        t5.setBounds(160,200,120,20);
        t6.setBounds(160,260,120,20);
        

        b.setBounds(20,320,120,40);
        t7.setBounds(160,320,120,40);
        

        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(l4);add(t4);
        add(l5);add(t5);
        add(l6);add(t6);
        add(t7);add(b); b.addActionListener(this);

        setSize(400, 500);
        setTitle("percentage calculator:");
        setLayout(null);
        setLocation(500, 100);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent e){
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int n3=Integer.parseInt(t3.getText());
        int n4=Integer.parseInt(t4.getText());
        int n5=Integer.parseInt(t5.getText());
        int n6=Integer.parseInt(t6.getText());
        if(e.getSource()==b){
            t7.setText(String.valueOf(((float)(n1+n2+n3+n4+n5)/n6)*100));
        }
    }
    public static void main(String[] args) {
        new percentage();
    }
    
}
