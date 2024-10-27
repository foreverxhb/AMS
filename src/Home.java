import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
	
	Home(){
		JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER,50,11));
		p1.setBackground(new Color(32, 178, 170));
		
		JButton b1=new JButton("Home");
	
		
		
		
		p1.add(b1); 
		JButton b2=new JButton("Admin");
		
		
		p1.add(b2); 
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b2) {
					AdminLout ad=new AdminLout();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
    	JButton b3=new JButton("Faculty");
		p1.add(b3); 
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b3) {
					FacLout ad=new FacLout();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		JButton b4=new JButton("Student");
		p1.add(b4); 
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b4) {
					StudLout ad=new StudLout();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		
		
		JPanel p2=new JPanel();
		p2.setLayout(null);
	
		ImageIcon ic=new ImageIcon("D:\\Eclipse\\AMS\\src\\pjlce.jpeg");
		JLabel l1=new JLabel(ic);
		
		l1.setBounds(296,10,993,608);
		p2.add(l1);
		
		
		
		
		getContentPane().setLayout(null);
		
		//panel1 align
		p1.setBounds(0,0,1537,50);
		//panel2 align
		p2.setBounds(0,48,1257,616);
		getContentPane().add(p1);
		getContentPane().add(p2);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
    
	}
}