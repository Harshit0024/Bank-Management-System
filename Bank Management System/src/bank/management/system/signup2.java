package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup2 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    String formno1;
    JButton s1,c;
    signup2(String formno){
        super("APPLICATION FORM");
        this.formno1=formno;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 =i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1=new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,18));
        l1.setBounds(350,50,600,40);
        add(l1);
        JLabel l2=new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(350,70,600,40);
        add(l2);
        JLabel l3=new JLabel("Account Type :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(150,125,140,30);
        add(l3);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(300,125,160,30);
        r1.setBackground(new Color(0xFCF11C));
        add(r1);
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(460,125,230,30);
        r2.setBackground(new Color(0xFCF11C));
        add(r2);
        r3=new JRadioButton("Current  Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(300,170,160,30);
        r3.setBackground(new Color(0xFCF11C));
        add(r3);
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(460,170,250,30);
        r4.setBackground(new Color(0xFCF11C));
        add(r4);
        ButtonGroup btn=new ButtonGroup();
        btn.add(r1);
        btn.add(r2);
        btn.add(r3);
        btn.add(r4);

        JLabel l4=new JLabel("Card Number :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(150,215,140,30);
        add(l4);
        JLabel l5=new JLabel("(Your 16-gigit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(150,230,300,30);
        add(l5);
        JLabel l6=new JLabel("XXXX-XXXX-XXXX-4531");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(340,215,300,30);
        add(l6);
        JLabel l7=new JLabel("(It would apper on atm card/cheque Book annd Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(340,230,500,30);
        add(l7);
        JLabel l8=new JLabel("PIN :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(150,275,140,30);
        add(l8);
        JLabel l9=new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(340,275,100,30);
        add(l9);
        JLabel l10=new JLabel("(4-didgit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(150,290,200,30);
        add(l10);
        JLabel l11=new JLabel("Services Required :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(150,335,200,30);
        add(l11);
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(0xFCF11C));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(340,335,200,30);
        add(c1);
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(0xFCF11C));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(540,335,200,30);
        add(c2);
        c3=new JCheckBox("Email Alerts");
        c3.setBackground(new Color(0xFCF11C));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(340,360,200,30);
        add(c3);
        c4=new JCheckBox("Mobile Banking");
        c4.setBackground(new Color(0xFCF11C));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(540,360,200,30);
        add(c4);
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(0xFCF11C));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(340,385,200,30);
        add(c5);
        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(0xFCF11C));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(540,385,200,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(new Color(0xFCF11C));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(150,450,600,20);
        add(c7);

        JLabel l12=new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(600,10,100,30);
        add(l12);
        JLabel l13=new JLabel(formno1);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(700,10,100,30);
        add(l13);
        s1=new JButton("Submit");
        s1.setFont(new Font("Raleway",Font.BOLD,14));
        s1.setForeground(Color.WHITE);
        s1.setBackground(Color.BLACK);
        s1.setBounds(300,500,100,30);
        s1.addActionListener(this);
        add(s1);
        c=new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setForeground(Color.WHITE);
        c.setBackground(Color.BLACK);
        c.setBounds(450,500,100,30);
        c.addActionListener(this);
        add(c);

        setLayout(null);
        setSize(800,750);
        setLocation(250,0);
        getContentPane().setBackground(new Color(0xFCF11C));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String at=null;
        if(r1.isSelected()){
            at="Saving Account";
        } else if (r2.isSelected()) {
            at="Fixed Deposit Account";
        } else if (r3.isSelected()) {
            at="Current  Account";
        } else if (r4.isSelected()) {
            at="Recurring Deposit Account";
        }
        Random ran=new Random();
        long f7=(ran.nextLong()%90000000L)+140996300000000L;
        String card=" "+Math.abs(f7);
        long f3=(ran.nextLong()%9000L)+1000L;
        String pin=" "+Math.abs(f3);

        String fc="";
        if(c1.isSelected()) {
            fc=fc+"ATM CARD";
        } else if (c2.isSelected()) {
            fc=fc+"Internet Banking";
        }else if (c3.isSelected()){
            fc=fc+"Email Alerts";
        } else if (c4.isSelected()) {
            fc=fc+"Mobile Banking";
        }else if (c5.isSelected()){
            fc=fc+"Cheque Book";
        } else if (c6.isSelected()) {
            fc=fc+"E-Statement";
        }
        try{
            if(e.getSource()==s1) {
                if (at.equals("")) {
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                } else if (e.getSource() == c) {
                    System.exit(0);
                }
                else {
                    conn con3 = new conn();
                    String q3 = "insert into signup2 values('" + formno1 + "','" + at + "','" + card + "','" + pin + "','" + fc + "')";
                    String q4 = "insert into login values('" + formno1 + "','" + card + "','" + pin + "')";
                    con3.statement.executeUpdate(q3);
                    con3.statement.executeUpdate(q4);
                    JOptionPane.showMessageDialog(null,"Card Number : " + card + "\n Pin : " + pin);
                    new Deposit(pin);
                    setVisible(false);
                }

            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new signup2("");
    }
}
