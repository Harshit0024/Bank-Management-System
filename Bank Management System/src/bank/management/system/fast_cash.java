package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fast_cash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    fast_cash(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1400,680);
        add(l1);

        JLabel l2=new JLabel("SELECT WITHDRAWL AMOUNT");
        l2.setBounds(385,100,700,35);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,22));
        l1.add(l2);

        b1=new JButton("Rs.100");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(330,198,150,30);
        b1.addActionListener(this);
        l1.add(b1);
        b2=new JButton("Rs.500");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(330,243,150,30);
        b2.addActionListener(this);
        l1.add(b2);
        b3=new JButton("Rs.1000");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(630,198,150,30);
        b3.addActionListener(this);
        l1.add(b3);
        b4=new JButton("Rs.2000");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(630,243,150,30);
        b4.addActionListener(this);
        l1.add(b4);
        b5=new JButton("Rs.5000");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(330,290,150,30);
        b5.addActionListener(this);
        l1.add(b5);
        b6=new JButton("Rs.10,000");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(630,290,150,30);
        b6.addActionListener(this);
        l1.add(b6);
        b7=new JButton("Back");
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
        if(e.getSource()==b7){
            setVisible(false);
            new main_class(pin);
        }else {
            String amount=((JButton)e.getSource()).getText().substring(3);
            conn con1=new conn();
            Date date=new Date();
            try{
                ResultSet resultSet = con1.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if(e.getSource()!=b7 && balance <Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficicent Balance");
                    return;
                }
                con1.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfully");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_class(pin);
        }

    }

    public static void main(String[] args) {
        new fast_cash("");
    }
}
