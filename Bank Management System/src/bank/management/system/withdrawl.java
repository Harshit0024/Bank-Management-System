package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b,b1;
    withdrawl(String pin){

        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1400,680);
        add(l1);

        JLabel l2=new JLabel("MAXIMUM WITHDRAWL IS RS 10,000");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(400,100,400,35);
        l1.add(l2);

        JLabel l21=new JLabel("PLEASE ENTER YOUR AMOUNT");
        l21.setForeground(Color.WHITE);
        l21.setFont(new Font("System",Font.BOLD,16));
        l21.setBounds(400,130,400,35);
        l1.add(l21);

        textField=new TextField();
        textField.setBounds(400,170,320,25);
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l1.add(textField);

        b=new JButton("WITHDRAW");
        b.setBounds(630,290,150,30);
        b.setBackground(new Color(65,125,128));
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        l1.add(b);
        b1=new JButton("BACK");
        b1.setBounds(630,340,150,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l1.add(b1);

        setLayout(null);
        setSize(1550,1200);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,"PLease enter the amount you want to withdraw");
                } else {
                    conn con1 = new conn();
                    Resultset resultset = (Resultset) con1.statement.executeQuery("select * from bank where pin='" + pin + "'");
                    int balance = 0;
                    while (((ResultSet) resultset).next()) {
                        if (((ResultSet) resultset).getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(((ResultSet) resultset).getString("amount"));
                        } else {
                            balance -= Integer.parseInt(((ResultSet) resultset).getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null,"Insufficient Balance");
                        return;
                    }
                    con1.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','withdrawl','" + amount + "')");
                    JOptionPane.showMessageDialog(null,"Rs " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource()==b1) {
            setVisible(false);
            new main_class(pin);
        }

    }

    public static void main(String[] args) {
        new withdrawl("");
    }
}
