
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;



public class AdminLogin2 
{


 AdminLogin2()
{
    
	 AdminLogin1 frame = new AdminLogin1();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(40, 40, 800, 600);
		frame.setVisible(true);
                frame.setResizable(false);

}
    public static void main(String[] a) 
    {
        AdminLogin1 frames = new AdminLogin1();
        frames.setTitle("Admin Login Form");
        frames.setVisible(true);
        frames.setBounds(100, 70, 800, 600);
        frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        frames.setResizable(false);
        
   	
	}
}

