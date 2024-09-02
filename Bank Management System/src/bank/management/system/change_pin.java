package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class change_pin extends JFrame implements ActionListener {
    JButton b,b1;
    String pin;
    JPasswordField p1,p2;
    change_pin(String pin){

        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1400,680);
        add(l1);

        JLabel l2=new JLabel("CHANGE YOUR PIN");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(400,100,400,35);
        l1.add(l2);

        JLabel l3=new JLabel("NEW PIN");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("System",Font.BOLD,16));
        l3.setBounds(400,140,400,35);
        l1.add(l3);

        p1=new JPasswordField();
        p1.setForeground(Color.WHITE);
        p1.setFont(new Font("System",Font.BOLD,22));
        p1.setBackground(new Color(65,125,128));
        p1.setBounds(400,180,200,35);
        l1.add(p1);

        JLabel l4=new JLabel("Re- Enter NEW PIN");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("System",Font.BOLD,16));
        l4.setBounds(400,220,400,35);
        l1.add(l4);

        p2=new JPasswordField();
        p2.setForeground(Color.WHITE);
        p2.setFont(new Font("System",Font.BOLD,22));
        p2.setBackground(new Color(65,125,128));
        p2.setBounds(400,260,200,35);
        l1.add(p2);

        b=new JButton("CHANGE");
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
        try{
            String pin1=p1.getText();
            String pin2=p2.getText();
            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            if(e.getSource()==b){
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Entered New PIN ");
                    return;
                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Entered PIN does not match");
                    return;
                }
                conn con1=new conn();
                String q="update bank set pin='"+pin1+"' where pin='"+pin+"'";
                String q1="update login set pin='"+pin1+"' where pin='"+pin+"'";
                String q2="update signup2 set pin='"+pin1+"' where pin='"+pin+"'";

                con1.statement.executeUpdate(q);
                con1.statement.executeUpdate(q1);
                con1.statement.executeUpdate(q2);

                JOptionPane.showMessageDialog(null,"PIN changed Successfully");
                setVisible(false);
                new main_class(pin);

            } else if (e.getSource()==b1) {
                new main_class(pin);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new change_pin("");
    }
}
