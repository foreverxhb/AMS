import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AddFaculty extends JFrame implements ActionListener{
	AddFaculty(){
		JPanel p1=new JPanel(new GridLayout(6,1));
		JLabel l1=new JLabel("Faculty Name : ");
		JTextField l2=new JTextField(10);
		JLabel l3=new JLabel("Faculty ID : ");
		JTextField l4=new JTextField(10);
		JLabel l5=new JLabel("Password : ");
		JPasswordField l6=new JPasswordField(10);
		JLabel l7=new JLabel("Department : ");
		String s[]= {"CSE","ECE","EEE","Mech"};
		JComboBox l8=new JComboBox(s);
		JLabel l9=new JLabel("E-mail : ");
		JTextField l10=new JTextField(10);
		JLabel l11=new JLabel("Check Details Again ");
		l11.setForeground(Color.RED.darker());
		
		JButton l12=new JButton("Submit");
		l12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==l12) {
					try {
						File f1=new File("D:\\Eclipse\\AMS\\src\\FacultyList.txt");
						FileWriter fw=new FileWriter(f1,true);
						String facname=l2.getText();
						String facid=l4.getText();
						String facpass=l6.getText();
						String facdept=(String)l8.getSelectedItem();
						String facmail=l10.getText();
						String total=facname+","+facid+","+facpass+","+facdept+","+facmail+"\n";
						fw.write(total);
						fw.close();
					}
					catch(Exception f) {
						JOptionPane.showMessageDialog(null,f);
					}
					JOptionPane.showMessageDialog(null,"Faculty Added !");
					AddFaculty ad=new AddFaculty();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		
		
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		p1.add(l6);
		p1.add(l7);
		p1.add(l8);
		p1.add(l9);
		p1.add(l10);
		p1.add(l11);
		p1.add(l12);
		
		JPanel p2=new JPanel(new GridLayout(8,1,10,5));
		JLabel n1=new JLabel();
		JButton n3=new JButton("Home");
		n3.setForeground(Color.BLUE.darker());
		n3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		n3.setHorizontalAlignment(JLabel.CENTER);
		n3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==n3) {
					Home ad=new Home();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		JButton m1=new JButton("Admin");
		m1.setForeground(Color.BLUE.darker());
		m1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m1.setHorizontalAlignment(JLabel.CENTER);
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==m1) {
					AdminLin ad=new AdminLin();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		JButton m2=new JButton("Add Faculty");
		m2.setForeground(Color.BLUE.darker());
		m2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m2.setHorizontalAlignment(JLabel.CENTER);
		JButton m3=new JButton("Add Student");
		m3.setForeground(Color.BLUE.darker());
		m3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m3.setHorizontalAlignment(JLabel.CENTER);
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==m3) {
					AddStud ad=new AddStud();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		JButton m4=new JButton("Add Subjects");
		m4.setForeground(Color.BLUE.darker());
		m4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m4.setHorizontalAlignment(JLabel.CENTER);
		m4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==m4) {
					AddSub ad=new AddSub();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});		
		JButton m5=new JButton("Logout");
		m5.setForeground(Color.BLUE.darker());
		m5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m5.setHorizontalAlignment(JLabel.CENTER);
		m5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==m5) {
					JOptionPane.showMessageDialog(null,"You have successfully been logged out !");
					Home ad=new Home();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		
		p2.add(n1);
		p2.add(n3);
		p2.add(m1);
		p2.add(m2);
		p2.add(m3);
		p2.add(m4);
		p2.add(m5);
		
		setLayout(new GridLayout(0,2));
		add(p1);
		add(p2);
	}
	
	public void actionPerformed(ActionEvent e){
		
	}

}