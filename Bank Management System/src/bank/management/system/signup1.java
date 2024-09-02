package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup1 extends JFrame implements ActionListener {
    String formno;
    JTextField textField,textField1;
    JButton next;
    JRadioButton r1,r2,t1,t2;
    JComboBox comboBox, comboBox1,comboBox2,comboBox3,comboBox4;
    signup1(String f){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 =i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=f;

        JLabel l=new JLabel("Form No :");
        l.setFont(new Font("Raleway",Font.BOLD,18));
        l.setBounds(600,10,100,30);
        add(l);
        JLabel ll=new JLabel(formno);
        ll.setFont(new Font("Raleway",Font.BOLD,18));
        ll.setBounds(700,10,100,30);
        add(ll);
        JLabel l1=new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,18));
        l1.setBounds(350,50,200,40);
        add(l1);
        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(350,70,600,40);
        add(l2);
        JLabel l3=new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(150,125,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(0xFCF11C));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,125,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(150,170,100,30);
        add(l4);
        String category[] = {"General","Obc","Sc","St","Other"};
        comboBox1=new JComboBox(category);
        comboBox1.setBackground(new Color(0xFCF11C));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(350,170,320,30);
        add(comboBox1);

        JLabel l5=new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(150,215,100,30);
        add(l5);
        String Income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox2=new JComboBox(Income);
        comboBox2.setBackground(new Color(0xFCF11C));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,215,320,30);
        add(comboBox2);

        JLabel l6=new JLabel("Educational :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(150,260,120,30);
        add(l6);
        String educational[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        comboBox3=new JComboBox(educational);
        comboBox3.setBackground(new Color(0xFCF11C));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,260,320,30);
        add(comboBox3);

        JLabel l7=new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(150,305,120,30);
        add(l7);
        String occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        comboBox4=new JComboBox(occupation);
        comboBox4.setBackground(new Color(0xFCF11C));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,305,320,30);
        add(comboBox4);

        JLabel l8=new JLabel("PAN NUMBER :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(150,350,140,30);
        add(l8);
        textField =new JTextField();
        textField.setFont(new Font("Raleway",Font.BOLD,18));
        textField.setBounds(350,350,320,30);
        add(textField);

        JLabel l9=new JLabel("Aadhar NUMBER :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(150,395,160,30);
        add(l9);
        textField1 =new JTextField();
        textField1.setFont(new Font("Raleway",Font.BOLD,18));
        textField1.setBounds(350,395,320,30);
        add(textField1);

        JLabel l10=new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(150,440,160,30);
        add(l10);
        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,18));
        r1.setBackground(new Color(0xFCF11C));
        r1.setBounds(350,440,100,30);
        add(r1);
        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,18));
        r2.setBackground(new Color(0xFCF11C));
        r2.setBounds(460,440,100,30);
        add(r2);

        JLabel l11=new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(150,495,160,30);
        add(l11);
        t1=new JRadioButton("Yes");
        t1.setFont(new Font("Raleway",Font.BOLD,18));
        t1.setBackground(new Color(0xFCF11C));
        t1.setBounds(350,495,100,30);
        add(t1);
        t2=new JRadioButton("No");
        t2.setFont(new Font("Raleway",Font.BOLD,18));
        t2.setBackground(new Color(0xFCF11C));
        t2.setBounds(460,495,100,30);
        add(t2);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setForeground(Color.BLACK);
        next.setBackground(Color.white);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(800,750);
        setLocation(250,0);
        getContentPane().setBackground(new Color(0xFCF11C));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel=(String)comboBox.getSelectedItem();
        String cat=(String)comboBox1.getSelectedItem();
        String inc=(String)comboBox2.getSelectedItem();
        String edu=(String)comboBox3.getSelectedItem();
        String occ=(String)comboBox4.getSelectedItem();
        String pan=textField.getText();
        String aadhar=textField1.getText();

        String sc=" ";
        if((r1.isSelected()))
        {
            sc="Yes";
        } else if ((r2.isSelected())) {
            sc="N0";
        }
        String ea=" ";
        if(t1.isSelected())
        {
            ea = "Yes";
        } else if ((t2.isSelected())) {
            ea="N0";
        }

        try{
            if(textField.getText().equals("")|| textField1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else{
                conn con2=new conn();
                String q1="Insert into signup1 values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+sc+"','"+ea+"')";
                con2.statement.executeUpdate(q1);
                new signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new signup1("");
    }
}