package project;

import java.awt.*;

import javax.swing.*;

public class spalsh  extends JFrame implements Runnable{
    spalsh(){

        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("project\\c1.jpg"));     //ADD IMG
        Image i2 =i.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);    //image scalle
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);                              //set image in jalbel
        add(image);

        setSize(1400,700);
        setVisible(true);
    }
    public void run(){

    }
    public static void main(String[] args) {
        new spalsh();
    }
    
}
