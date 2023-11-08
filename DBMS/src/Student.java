import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class Student extends JFrame implements ActionListener {
    JFrame f;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4, b5;
    Connection c;
    Statement s;
    ResultSet r;

    Student() {
        try {
            f = new JFrame("Student Form");
            f.setLayout(null);
            f.setVisible(true);
            f.setSize(700, 500);
            l4 = new JLabel("Student Management System");
            l4.setBounds(100, 30, 400, 30);
            f.add(l4);
            l4.setForeground(Color.blue);
            l4.setFont(new Font("Serif", Font.BOLD, 30));
            l1 = new JLabel("Stud_RollNo");
            l1.setBounds(50, 70, 100, 50);
            f.add(l1);
            l2 = new JLabel("Stud_Name");
            l2.setBounds(50, 120, 100, 50);
            f.add(l2);
            l3 = new JLabel("Stud_Dept");
            l3.setBounds(50, 170, 100, 50);
            f.add(l3);
            t1 = new JTextField();
            t1.setBounds(150, 90, 100, 30);
            f.add(t1);
            t2 = new JTextField();
            t2.setBounds(150, 140, 100, 30);
            f.add(t2);
            t3 = new JTextField();
            t3.setBounds(150, 190, 100, 30);
            f.add(t3);
            b1 = new JButton("ADD");
            b1.setBounds(200, 300, 75, 50);
            f.add(b1);
            b1.addActionListener(this);
            b2 = new JButton("EDIT");
            b2.setBounds(300, 300, 75, 50);
            f.add(b2);
            b2.addActionListener(this);
            b3 = new JButton("DELETE");
            b3.setBounds(400, 300, 75, 50);
            f.add(b3);
            b3.addActionListener(this);
            b5 = new JButton("EXIT");
            b5.setBounds(500, 300, 75, 50);
            f.add(b5);
            b5.addActionListener(this);
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "root");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                String s1 = "INSERT INTO result(stud_RollNo, stud_Name, stud_Dept) VALUES (?, ?, ?)";
                PreparedStatement pstmt = c.prepareStatement(s1);
                pstmt.setInt(1, Integer.parseInt(t1.getText()));
                pstmt.setString(2, t2.getText());
                pstmt.setString(3, t3.getText());
                pstmt.executeUpdate();
                r = s.executeQuery("SELECT * FROM result");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                pstmt.close();
            } else if (ae.getSource() == b2) {
                String s2 = "UPDATE result SET stud_Name = ? WHERE stud_RollNo = ?";
                PreparedStatement pstmt = c.prepareStatement(s2);
                pstmt.setString(1, t2.getText());
                pstmt.setInt(2, Integer.parseInt(t1.getText()));
                pstmt.executeUpdate();
                r = s.executeQuery("SELECT * FROM result");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                pstmt.close();
            } else if (ae.getSource() == b3) {
                String s3 = "DELETE FROM result WHERE stud_RollNo = ?";
                PreparedStatement pstmt = c.prepareStatement(s3);
                pstmt.setInt(1, Integer.parseInt(t1.getText()));
                pstmt.executeUpdate();
                r = s.executeQuery("SELECT * FROM result");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                pstmt.close();
            } else if (ae.getSource() == b5) {
                System.exit(0);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new Student();
    }
}
