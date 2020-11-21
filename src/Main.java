import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import java.sql.*;

 

public class Main implements ActionListener
{
    
   
    JFrame frame;
   
    JButton ADMIN_LOGIN=new JButton("ADMIN LOGIN");
    JButton USER_LOGIN=new JButton("USER LOGIN");
 
 
    Main()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
        
        
        
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().add(ADMIN_LOGIN);
                
                 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().add(USER_LOGIN);

		
		ADMIN_LOGIN.addActionListener(new ActionListener() 
                {
			public void actionPerformed(ActionEvent ae) 
                        {
				frame.dispose();
				new AdminLogin2();
			}
		});
                
                                frame.getContentPane().add(USER_LOGIN);
                USER_LOGIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
				new UserLogin();
			}
		});
		
		frame.setVisible(true);
        
    }

    
    public void createWindow()
    {
        
        frame=new JFrame();
        frame.setTitle("Main Page");
        frame.setBounds(100,70,800,600);
        frame.getContentPane().setBackground(Color.yellow);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    public void setLocationAndSize()
    {
        
        ADMIN_LOGIN.setBounds(225,250,125,35);
        USER_LOGIN.setBounds(400,250,125,35);
    }
    public void addComponentsToFrame()
    {
        
        frame.add(ADMIN_LOGIN);
        frame.add(USER_LOGIN);
    }
    public void actionEvent()
    {
        ADMIN_LOGIN.addActionListener(this);
        USER_LOGIN.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
 
    public static void main(String[] args)
    {
        new Main();
    }


}
    



