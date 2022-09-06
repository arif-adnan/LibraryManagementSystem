
package AA_LibraryManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LibrarianSection extends JFrame implements ActionListener {

    private JLabel l; 
    private JButton adbook,vbook, issuebook, vissuebook, rbook, logout; 
    
    public LibrarianSection(){
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(new Color(59,89,152));
        
        l = new JLabel("Librarian Section"); 
        l.setBounds(120,25,250,25);
        l.setFont(new Font("Tahoma", Font.BOLD, 18));
        l.setForeground(Color.white);
        add(l); 
        
        adbook = new JButton("Add Book"); 
        adbook.setBounds(30,70,140,40);
        add(adbook);
        adbook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddBooksForm.main(new String[]{});
                dispose();
            }
        });
        
        vbook = new JButton("View Book"); 
        vbook.setBounds(220,70,140,40);
        add(vbook);
        vbook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose();
                ViewBooks.main(new String[]{});
            }
        });
        
        issuebook = new JButton("Issue Book"); 
        issuebook.setBounds(30,150,140,40);
        add(issuebook);
        issuebook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                IssueBookForm.main(new String[]{});
                dispose();
            }
        });
        
        vissuebook = new JButton("View Issue Book"); 
        vissuebook.setBounds(220,150,140,40);
        add(vissuebook);
        vissuebook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewIssuedBooks.main(new String[]{});
            }
        });
        
        rbook = new JButton("Return Book"); 
        rbook.setBounds(30,230,140,40);
        add(rbook);
        rbook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ReturnBookForm.main(new String[]{});
            }
        });
        
        logout = new JButton("Logout"); 
        logout.setBounds(220,230,140,40);
        add(logout);
        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                LibrarianLogin.main(new String[]{});
            }
        });
        
        JButton backbtn = new JButton("Back"); 
                backbtn.setBounds(285,305,90,20);
                add(backbtn);
                backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
			}
		});
        
        
    
        
    }
    
    public static void main(String[] args) {
        LibrarianSection f = new LibrarianSection(); 
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setBounds(400, 225,400,400);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
