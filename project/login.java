package project;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class login extends JFrame implements ActionListener{
    JButton login,cancel;
    JTextField tun,tpass;
    login() {

        getContentPane().setBackground(Color.WHITE); // WHITE COLOR INBCAKGROUND

        JLabel un = new JLabel("Username:");
        un.setBounds(40, 20, 100, 20);
        add(un);

         tun = new JTextField();
        tun.setBounds(160, 20, 100, 20);
        add(tun);

        JLabel pass = new JLabel("Password:");
        pass.setBounds(40, 80, 100, 20);
        add(pass);

         tpass = new JPasswordField();
        tpass.setBounds(160, 80, 100, 20);
        add(tpass);

        login = new JButton("login");
        login.setBounds(60, 120, 80, 30);
        login.setBackground(Color.GREEN);
        login.setForeground(Color.black);
        login.setFont(new Font("serif",Font.BOLD,15));
        login.addActionListener(this);
        add(login);

        cancel = new JButton("cancel");
        cancel.setBounds(160, 120, 80, 30);
        cancel.setBackground(Color.RED);                                        //backround color
        cancel.setForeground(Color.WHITE);                                          //font  color      
        cancel.setFont(new Font("serif",Font.BOLD,15));                  //font size
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("project\\u2.png")); // ADD IMG
        Image i2 = i.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); // image scalle
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); // set image in jalbel
        image.setBounds(350, 0, 200, 200);
        add(image);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(600, 300);
        setLocation(400, 200);
        setTitle("Login Form");
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== login){
            String  un= tun.getText();
            String  pass=tpass.getText();
            if(un.equals("abc") && pass.equals("123")){
                setVisible(false);
                new home();                            //intent to another screen
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid username or password");  //dialog boxi java
            }

        }
        else if(e.getSource() == cancel){
            setVisible(false);
        

        }

    }

    public static void main(String[] args) {
        new login();

    }

}
