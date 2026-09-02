import javax.swing.*;
public class Cviews extends JFrame{
    JLabel a, b, result;
    JTextField num1, num2;
    JButton add, sub, divide, multiply;
    Cviews(){
        setSize(500, 500);
        setLayout(null);
        setTitle("CALCULATOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a = new JLabel("Enter A");
        a.setBounds(30, 30, 100, 30);
        add(a);
        b = new JLabel("Enter B");
        b.setBounds(30, 60, 100, 30);
        add(b);

        num1 = new JTextField("");
        num1.setBounds(80, 30, 100, 30);
        add(num1);
        num2 = new JTextField("");
        num2.setBounds(80, 60, 100, 30);
        add(num2);
        setVisible(true);

    }
}