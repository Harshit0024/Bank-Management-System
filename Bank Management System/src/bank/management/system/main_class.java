package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_class(String pin){

        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1400,680);
        add(l1);

        JLabel l2=new JLabel("Please Select Your Transaction");
        l2.setBounds(345,100,700,35);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,28));
        l1.add(l2);

        b1=new JButton("DEPOSIT");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(330,198,150,30);
        b1.addActionListener(this);
        l1.add(b1);
        b2=new JButton("FAST CASH");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(330,243,150,30);
        b2.addActionListener(this);
        l1.add(b2);
        b3=new JButton("CASH WITHDRWAL");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(630,198,150,30);
        b3.addActionListener(this);
        l1.add(b3);
        b4=new JButton("MINI STATEMENT");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(630,243,150,30);
        b4.addActionListener(this);
        l1.add(b4);
        b5=new JButton("PIN CHANGE");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(330,290,150,30);
        b5.addActionListener(this);
        l1.add(b5);
        b6=new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(630,290,150,30);
        b6.addActionListener(this);
        l1.add(b6);
        b7=new JButton("EXIT");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(630,336,150,30);
        b7.addActionListener(this);
        l1.add(b7);

        setLayout(null);
        setSize(1550,1200);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{if(e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==b7) {
            System.exit(0);
        }else if (e.getSource()==b3){
            new withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new balance(pin);
            setVisible(false);
        } else if (e.getSource()==b2) {
            new fast_cash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new change_pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini_statement(pin);
            setVisible(false);
        }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new main_class("");
    }
}
