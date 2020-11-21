import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


import java.awt.Container;

import java.awt.event.*;

public class AdminLogin1 extends JFrame implements ActionListener
{
    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
     JButton loginButton = new JButton("LOGIN");
     JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");


    AdminLogin1()
    {
         
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        


    }

    public void setLayoutManager()
    {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(275, 150, 100, 30);
        passwordLabel.setBounds(275, 220, 100, 30);
        userTextField.setBounds(375, 150, 150, 30);
        passwordField.setBounds(375, 220, 150, 30);
        showPassword.setBounds(375, 250, 150, 30);
        loginButton.setBounds(290, 300, 100, 30);
        resetButton.setBounds(415, 300, 100, 30);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
private JFrame frames = new JFrame("Login");

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton)
        {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("riya") && pwdText.equalsIgnoreCase("12345"))
            {
           
		
		loginButton.addActionListener(new ActionListener() 
                {
			public void actionPerformed(ActionEvent ae)
                        {
				
				new Details();
                                dispose();
			}
		});
             
	    
            
                }
            
	
                }
            
            else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        

        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }
}



