import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.sql.*; import java.util.*; 
import javax.swing.table.*;
class Display implements ActionListener 

{ 
    JLabel label1;
    JPanel panel; 
    JButton button1;
    JButton button2; 
    JButton button3;
        JFrame jf;
    
   JButton button6;

    Display ()
    { 
       
        
        
        jf=new javax.swing.JFrame("View Details");
        panel=new javax.swing.JPanel(); 
        jf.add(panel); 
        panel.setLayout(null);
        jf.setBounds(100, 70, 800, 600);
       
        jf.show(); 
        jf.setResizable(false);
        
        
        button6 = new JButton("LOGOUT");
         button6.setBounds(400,80,150,30); 
        panel.add(button6);
        button6.addActionListener(this); 
        
        
        button1 = new JButton("View Details"); 
        button1.setBounds(200,80,150,30); 
        panel.add(button1);
        button1.addActionListener(this); 
    } 
    
    
    
    
    public void actionPerformed(ActionEvent ae) 
    { 
        if(ae.getSource() == button1)
    { 
        displayTable("student",130);
    }
            
        if(ae.getSource() == button6)
    { 
         jf.dispose();
       new Main();
    
                                
    }
      
        
    } 
    void displayTable(String table,int y)
    { 
        Vector columnNames2 = new Vector();
        Vector data2 = new Vector(); 
        String nam2 = table; 
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root",""); 
            String sql2 = "Select * from "+nam2+""; 
            Statement stmt2 = con2.createStatement();
            ResultSet rs2 = stmt2.executeQuery( sql2 );
            ResultSetMetaData md2 = rs2.getMetaData(); 
            int columns2 = md2.getColumnCount();
            for (int i = 1; i <= columns2; i++) 
            { 
                columnNames2.addElement( md2.getColumnName(i) ); 
            } while (rs2.next()) { Vector row2 = new Vector(columns2);
            for (int i = 1; i <= columns2; i++) 
            { 
                row2.addElement( rs2.getObject(i) );
            } data2.addElement( row2 ); 
            } 
            rs2.close(); 
            stmt2.close();
            final JTable table2 = new JTable(data2, columnNames2);
            JTableHeader header = table2.getTableHeader(); 
            header.setBackground(Color.yellow); 
            JScrollPane scrollPane = new JScrollPane( table2 ); 
            panel.add( scrollPane ); 
            scrollPane.setBounds(60,y,650,300);
            table2.setFont(new Font("Dialog", Font.BOLD, 12)); 
        } 
        catch(Exception e)
        { 
            System.out.println(e); 
        } }
    public static void main(String args[]) 
    { 
      
        Display tabletest = new Display();
       
    } }



