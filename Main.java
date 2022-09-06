
package AA_LibraryManagement;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{

	private JPanel panel;
        private JButton admnlogin, liblogin, about;
  
        public Main() {
	
            
            panel = new JPanel();
            setContentPane(panel);
            panel.setLayout(null);

            
            JLabel l1 = new JLabel("Library Management System");
            l1.setForeground(new Color(0,0,255));
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l1.setBounds(240, 30, 701, 80);
            panel.add(l1);
            
            JLabel l5 = new JLabel("Leading University, Sylhet");
            l5.setForeground(new Color(0,0,255));
            l5.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l5.setBounds(240, 415, 701, 80);
            panel.add(l5);
            
            JLabel l6 = new JLabel("estd. 2001");
            l6.setForeground(new Color(0,0,255));
            l6.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
            l6.setBounds(385, 470, 701, 80);
            panel.add(l6);

            JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("AA_LibraryManagement/icons/admin1.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i3);
            l2.setBounds(100, 140, 159, 152);
            panel.add(l2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("AA_LibraryManagement/icons/student.png"));
            Image i5 = i4.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(360, 140, 159, 152);
            panel.add(l3);


            admnlogin = new JButton("Admin Login");
            admnlogin.addActionListener(this);
            admnlogin.setBackground(Color.BLACK);
            admnlogin.setForeground(Color.WHITE);
            admnlogin.setBounds(100, 320, 159, 44);
            panel.add(admnlogin);

            liblogin = new JButton("Librarian Login");
            liblogin.addActionListener(this);
            liblogin.setBackground(Color.BLACK);
            liblogin.setForeground(Color.WHITE);
            liblogin.setBounds(360, 320, 139, 44);
            panel.add(liblogin);
  

            about = new JButton("About Us");
            about.addActionListener(this);
            about.setBackground(Color.BLACK);
            about.setForeground(Color.WHITE);
            about.setBounds(600, 320, 139, 44);
            panel.add(about);
            
            JLabel l4 = new JLabel("");
            ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("AA_LibraryManagement/icons/about.png"));
            Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i18 = new ImageIcon(i17);
            l4 = new JLabel(i18);
            l4.setBounds(600, 140, 157, 152);
            panel.add(l4);


            JPanel panel2 = new JPanel();
            panel2.setBorder(new TitledBorder(new LineBorder(new Color(0,0,255), 2), "Operations", TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.TOP, null, new Color(255,0,0)));
            panel2.setBounds(20, 120, 800, 270);
            panel2.setBackground(Color.WHITE);
            panel.add(panel2);
            
            getContentPane().setBackground(Color.WHITE);
            panel.setBackground(Color.WHITE);
	}
        
        public static void main(String[] args) {
            Main f = new Main(); 
            f.setVisible(true); 
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setBounds(350, 100, 852, 600);
            
	}
        
        public void actionPerformed(ActionEvent ae){          
            if(ae.getSource() == admnlogin){
                //dispose(); 
                AdminLogin.main(new String[]{});
            }
            if(ae.getSource() == liblogin){
                  //dispose(); 
                  LibrarianLogin.main(new String[]{});
            }
            if(ae.getSource() == about){
                  //dispose(); 
                  AboutUs.main(new String[]{});
            }
            
            
        }
}
