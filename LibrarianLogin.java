
package AA_LibraryManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LibrarianLogin extends JFrame implements ActionListener{
	static Main frame;
	private JLabel l1,l2,l3;
        ImageIcon image;
        private JButton login, backbtn; 
        private JTextField usertf;
        private JPasswordField passf; 

	public LibrarianLogin() {
            
                //super("Library Management System");
                this.getContentPane().setLayout(null);
                this.getContentPane().setBackground(new Color(59,89,152));
                
   
		
		l1 = new JLabel("Login Form - Librarian");
                l1.setBounds(160,15,400,80);
		l1.setFont(new Font("Tahoma", Font.BOLD, 18));
		l1.setForeground(Color.white);
                add(l1);
                
                l2 = new JLabel("User Name: ");
                l2.setBounds(30,100,90,40);
                l2.setForeground(Color.white);
                add(l2);       
		
		usertf = new JTextField();
                usertf.setBounds(153,100,250,30);
                add(usertf); 
		
		l3 = new JLabel("Password: "); 
                l3.setBounds(30, 150, 90, 40);
                l3.setForeground(Color.white);
                add(l3);
                
		passf = new JPasswordField();
                passf.setBounds(153,150,250,30);
                add(passf); 
                
                login = new JButton("Login"); 
                login.setBounds(230,220,100,30);
                add(login);
                
                login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name = usertf.getText();
			String password = String.valueOf(passf.getPassword());
			if(AddLibrarian.validate(name, password)){
                                dispose();
				LibrarianSection.main(new String[]{});
				
			}else{
				JOptionPane.showMessageDialog(LibrarianLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				usertf.setText("");
				passf.setText("");
			}
			}
		});
                
                backbtn = new JButton("Back"); 
                backbtn.setBounds(380,270,90,20);
                add(backbtn);
                backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
			}
		});
                
                }
        
        public static void main(String[] args) {
            LibrarianLogin f  = new LibrarianLogin(); 
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setBounds(400,225,500, 350);
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        }
}


