
package AA_LibraryManagement;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel panel;

        public AboutUs() {
            
            super("About Us - Leading University Library");
                        
            panel = new JPanel();
            panel.setBackground(new Color(59,89,152));
            setContentPane(panel);
            panel.setLayout(null);

            JLabel l1 = new JLabel("Library");
            l1.setForeground(Color.white);
            l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l1.setBounds(298, 40, 150, 55);
            panel.add(l1);

            JLabel l2 = new JLabel("Management System");
            l2.setForeground(Color.white);
            l2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l2.setBounds(180, 90, 405, 40);
            panel.add(l2);

            JLabel l3 = new JLabel("Developed By : Mahadi Hasan Ripon");
            l3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l3.setBounds(193, 140, 600, 35);
            l3.setForeground(Color.white);
            panel.add(l3);

            JLabel l4 = new JLabel("Contact Us : mahadi@gmail.com");
            l4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l4.setBounds(220, 220, 600, 34);
            l4.setForeground(Color.white);
            panel.add(l4);


            JLabel l10 = new JLabel("**Knowledge is Power**");
            l10.setForeground(Color.white);
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(242, 350, 400, 34);
            panel.add(l10);
                
                
            
	}
        public static void main(String[] args) {
            AboutUs f = new AboutUs();
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            f.setBounds(400, 225, 700, 450);
            
        }
        

}

