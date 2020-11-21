import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
public class UserLogin extends JFrame
{
	
	JLabel l_name,l_pass;
	JTextField t_name;
	JPasswordField t_pass;     
	JButton button;
	Container c;
      
        


	handler handle;


	User db;

	 UserLogin()
	{
            
            		super("Login form");
        
       
            
         c=getContentPane();
		c.setLayout(new FlowLayout());


		db=new User();
	        handle =new handler();

              
		l_name=new JLabel("Username");
		l_pass=new JLabel("Password");
		t_name=new JTextField(10);
		t_pass=new JPasswordField(10);
		button=new JButton("Login");

		
		button.addActionListener(handle);

		
		c.add(l_name);
		c.add(t_name);
		c.add(l_pass);
		c.add(t_pass);
		c.add(button);
	
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
                 setBounds(100,70,800,600);
                setResizable(false);

	}
	public static void main(String args[])
	{
		UserLogin sample=new UserLogin();
	}


	class handler implements ActionListener
	{
		
	public void actionPerformed(ActionEvent ae)
	{
			
	if(ae.getSource()==button)
	{
	char[] temp_pwd=t_pass.getPassword();
	String pwd=null;
	pwd=String.copyValueOf(temp_pwd);
	System.out.println("Username,Password:"+t_name.getText()+","+pwd);


	if(db.checkLogin(t_name.getText(), pwd))
	{
	
            
          button.addActionListener(new ActionListener() 
          {
			public void actionPerformed(ActionEvent ae)
                        {
				dispose();
				new Display();
			}
		}
          );
             
                                        
                                        
                                        
				}
				else
				{
					
					JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
				}
			}
		}

	}
}

 


