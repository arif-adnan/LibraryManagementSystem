
package AA_LibraryManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdminSection extends JFrame implements ActionListener{
    private JLabel label; 
    private JButton addlib, viewlib, dellib, logout;
    
    public AdminSection(){
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(new Color(59,89,152));
        
        
        label = new JLabel("Admin Section"); 
        label.setForeground(Color.white);
        label.setBounds(175,30,160,40);
        label.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(label); 
        
        addlib = new JButton("Add Librarian"); 
        addlib.setBounds(155,90,180,30);
        add(addlib);
        addlib.setFont(new Font("Tahoma", Font.PLAIN, 15));
		addlib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            LibrarianForm.main(new String[]{});
                        }
		});

        
        viewlib = new JButton("View Librarian"); 
        viewlib.setBounds(155,135,180,30);
        add(viewlib);
        viewlib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            dispose();
                            ViewLibrarians.main(new String[]{});
			}
		});
        
        dellib = new JButton("Delete Librarian"); 
        dellib.setBounds(155,180,180,30);
        add(dellib);
        dellib.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
                    dispose();
                    DeleteLibrarian.main(new String[]{});

			}
		});
        
        logout = new JButton("Logout"); 
        logout.setBounds(155,225,180,30);
        add(logout);
        logout.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {	
			dispose();
                        AdminLogin.main(new String[]{});       
		}
	});
        
        JButton backbtn = new JButton("Back"); 
                backbtn.setBounds(380,270,90,20);
                add(backbtn);
                backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            AdminLogin.main(new String[]{});
			}
		});
        
        
    }
    public static void main(String[] args) {
        AdminSection f = new AdminSection();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(400, 225, 500, 350);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}
