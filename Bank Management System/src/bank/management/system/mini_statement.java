package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini_statement extends JFrame implements ActionListener {
    String pin;
    JButton b;
    mini_statement(String pin){

        this.pin=pin;
        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel l1=new JLabel();
        l1.setBounds(20,140,400,300);
        add(l1);

        JLabel l2=new JLabel("Harshit Kumar");
        l2.setFont(new Font("System",Font.BOLD,15));
        l2.setBounds(150,20,200,20);
        add(l2);

        JLabel l3=new JLabel();
        l3.setBounds(20,80,300,20);
        add(l3);

        JLabel l4=new JLabel();
        l4.setBounds(20,400,300,20);
        add(l4);

        try{
            conn con1=new conn();
            Resultset resultset= (Resultset) con1.statement.executeQuery("select * from login where pin='"+pin+"'");
            while (((ResultSet) resultset).next()){
                l3.setText("Card Number : "+((ResultSet) resultset).getString("card_number").substring(0,4)+"XXXXXXXX"+((ResultSet) resultset).getString("card_number").substring(12));
            }
        }catch (Exception E){
            E.printStackTrace();
        }
        try{
            conn con2=new conn();
            ResultSet resultSet = con2.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            int balance =0;
            while (resultSet.next()){

                l1.setText(l1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><br><html>");
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            l4.setText("Your Total Balance is Rs "+balance);

        }catch (Exception s){
            s.printStackTrace();
        }
        b=new JButton("Exit");
        b.setBounds(20,500,100,25);
        b.addActionListener(this);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        add(b);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new mini_statement("");
    }
}
