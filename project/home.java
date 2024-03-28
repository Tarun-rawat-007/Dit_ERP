package project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class home extends JFrame implements ActionListener {
    home() {

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("project\\img\\b6.JPG")); // ADD IMG
        Image i2 = i.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT); // image scalle
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); // set image in jalbel
        add(image);

        JMenuBar mb = new JMenuBar();
        mb.setBackground(Color.BLACK);

        setJMenuBar(mb);

        // MenuBar items

        JMenu home = new JMenu("Home");
        home.setForeground(Color.white);
        mb.add(home);

        JMenu info = new JMenu("Information");
        info.setForeground(Color.WHITE);
        info.addActionListener(this);
        mb.add(info);

        JMenu exam = new JMenu("exam ");
        exam.setForeground(Color.WHITE);
        exam.addActionListener(this);
        mb.add(exam);

        JMenu about = new JMenu("About");
        about.setForeground(Color.WHITE);
        mb.add(about);

        JMenu contactus = new JMenu("Contact");
        contactus.setForeground(Color.WHITE);
        mb.add(contactus);

        JMenu marks = new JMenu("marks");
        marks.setForeground(Color.WHITE);
        mb.add(marks);

        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.WHITE);
        mb.add(fee);

        // menu items of tabs

        JMenuItem faculty = new JMenuItem("faculty information");
        faculty.setBackground(Color.WHITE);
        info.add(faculty);

        JMenuItem student = new JMenuItem("student information");
        student.setBackground(Color.WHITE);
        info.add(student);

        // for examsninations
        JMenuItem datesheet = new JMenuItem("Datesheet");
        datesheet.setBackground(Color.WHITE);
        datesheet.addActionListener(this);
        exam.add(datesheet);

        // calculate marks
        JMenuItem percentage = new JMenuItem("Percentage");
        percentage.setBackground(Color.WHITE);
        percentage.addActionListener(this);
        marks.add(percentage);

        // fee details about different cources
        JMenuItem btech = new JMenuItem("Betch");
        btech.setBackground(Color.WHITE);
        btech.addActionListener(this);
        fee.add(btech);

        JMenuItem bca = new JMenuItem("Bca");
        bca.setBackground(Color.WHITE);
        bca.addActionListener(this);
        fee.add(bca);

        // About
        JMenuItem details = new JMenuItem("Details");
        details.setBackground(Color.WHITE);
        details.addActionListener(this);
        about.add(details);

        setSize(1400, 700);
        setTitle("Home page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand(); // message carreid by click event

        
        if (msg.equals("Bca")) {
            new bcafee();
        } else if (msg.equals("Betch")) {
            new btechfee();

        } else if (msg.equals("Datesheet")) {
            new examdatesheet(); // intent to another screen
        } else if (msg.equals("Details")) {
            new about();

        }
        else if (msg.equals("Percentage")) {
            new percentage();

        }

    }

    public static void main(String[] args) {
        new home();
    }

}
