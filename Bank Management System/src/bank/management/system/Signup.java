package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JButton next;
    JRadioButton r1,r2,m1,m2,m3;
    JTextField name,fname ,temail,tm,tadd,tc,tpin,ts;
    JDateChooser dateChooser;
    Random ran=new Random();
    long f4=(ran.nextLong()% 900L)+100L;
    String f=" "+Math.abs(f4);

    Signup(){
        super("APPLICATION FORM ");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 =i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+f);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,38));
        add(label1);

        JLabel label2 =new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,18));
        label2.setBounds(400,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setBounds(350,95,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);

        JLabel label4=new JLabel("Name :");
        label4.setFont(new Font("Raleway",Font.BOLD,20));
        label4.setBounds(150,150,100,30);
        add(label4);

        name =new JTextField();
        name.setFont(new Font("Raleway",Font.BOLD,14));
        name.setBounds(320,155,300,28);
        add(name);

        JLabel label5=new JLabel("Fathers's Name :");
        label5.setFont(new Font("Raleway",Font.BOLD,20));
        label5.setBounds(150,200,200,30);
        add(label5);

        fname =new JTextField();
        fname.setFont(new Font("Raleway",Font.BOLD,14));
        fname.setBounds(320,205,300,28);
        add(fname);

        JLabel dob=new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(150,250,200,30);
        add(dob);

        dateChooser =new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(320,250,300,30);
        add(dateChooser);

        JLabel gender=new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(150,295,200,30);
        add(gender);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(350,295,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,295 ,100,30);
        add(r2);

        ButtonGroup btn=new ButtonGroup();
        btn.add(r1);
        btn.add(r2);

        JLabel email=new JLabel("Email address :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(150,340,200,30);
        add(email);

        temail=new JTextField();
        temail.setFont(new Font("Raleway",Font.BOLD,14));
        temail.setBounds(320,340,300,30);
        add(temail);

        JLabel married=new JLabel("Marital Status :");
        married.setFont(new Font("Raleway",Font.BOLD,20));
        married.setBounds(150,390,200,30);
        add(married);

        m1=new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(320,390,100,30);
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(420,390 ,100,30);
        add(m2);

        m3=new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(520,390 ,100,30);
        add(m3);

        ButtonGroup btn1=new ButtonGroup();
        btn1.add(m1);
        btn1.add(m2);
        btn1.add(m3);

        JLabel address=new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(150,450,200,30);
        add(address);

        tadd=new JTextField();
        tadd.setFont(new Font("Raleway",Font.BOLD,14));
        tadd.setBounds(320,450,300,30);
        add(tadd);

        JLabel city=new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(150,500,200,30);
        add(city);

        tc=new JTextField();
        tc.setFont(new Font("Raleway", Font.BOLD, 14));
        tc.setBounds(320,500,300,30);
        add(tc);

        JLabel pin=new JLabel("Pin Code :");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(150,550,200,30);
        add(pin);

        tpin=new JTextField();
        tpin.setFont(new Font("Raleway", Font.BOLD, 14));
        tpin.setBounds(320,550,300,30);
        add(tpin);

        JLabel state=new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(150,600,200,30);
        add(state);

        ts=new JTextField();
        ts.setFont(new Font("Raleway", Font.BOLD, 14));
        ts.setBounds(320,600,300,30);
        add(ts);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(680,655,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(800,750);
        setLocation(250,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=f;
        String name1=name.getText();
        String fn=fname.getText();
        String dobb=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        } else if (r2.isSelected()) {
            gender="Female";
        }
        String email=temail.getText();
        String marital=null;
        if(m1.isSelected())
        {
            marital="Married";
        } else if (m2.isSelected()) {
            marital="Unmarried";
        } else if (m3.isSelected()) {
            marital="Other";
        }
        String address=tadd.getText();
        String city=tc.getText();
        String pincode=tpin.getText();
        String state=ts.getText();

        try{
            if(name.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the field");
            }
            else{
                conn con1=new conn();
                String q="Insert into signup values('"+formno+"','"+name1+"','"+fn+"','"+dobb+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new signup1(f);
                setVisible(false);
            }
        }catch (Exception E){

        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
