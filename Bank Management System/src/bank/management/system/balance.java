package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class balance extends JFrame implements ActionListener {
    String pin;
    JLabel l3;
    JButton b;
    balance(String pin) {

        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1400,680);
        add(l1);

        JLabel l2=new JLabel("Your Current Balance is Rs ");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(400,100,400,35);
        l1.add(l2);

        l3=new JLabel();
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("System",Font.BOLD,16));
        l3.setBounds(400,130,400,35);
        l1.add(l3);

        b=new JButton("Back");
        b.setForeground(Color.WHITE);
        b.setFont(new Font("System",Font.BOLD,16));
        b.setBackground(new Color(65,125,128));
        b.setBounds(630,336,150,30);
        b.addActionListener(this);
        l1.add(b);

        int balance=0;
        try{
            conn con1=new conn();
            Resultset resultset= (Resultset) con1.statement.executeQuery("select * from bank where pin='"+pin+"'");
            while (((ResultSet) resultset).next()) {
                if (((ResultSet) resultset).getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(((ResultSet) resultset).getString("amount"));
                } else {
                    balance -= Integer.parseInt(((ResultSet) resultset).getString("amount"));
                }
            }
        }catch (Exception E){
            E.printStackTrace();
        }

        l3.setText(""+balance);

        setLayout(null);
        setSize(1550,1200);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);
    }

    public static void main(String[] args) {
        new balance("");
    }
}
