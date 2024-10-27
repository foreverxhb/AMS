import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;

public class FormResize extends JFrame
{

public FormResize ()
{
	setSize(600, 400);
	setTitle("W: " +this.getWidth() + "H :" +this.getHeight());
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	
	
	getContentPane().addComponentListener(new ComponentAdapter() {
		
		public void componentResized (ComponentEvent e) {
			Component c= (Component)e.getSource();
			setTitle("W: " +c.getWidth() + "H :" +c.getHeight());
			System.out.println("W: " +c.getWidth() + "H :" +c.getHeight());
			
		}
	});
	}
	
	
public static void main (String []args) {
	new FormResize();
}

}
