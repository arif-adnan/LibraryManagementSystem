
package AA_LibraryManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LibrarianForm extends JFrame implements ActionListener {

    private JLabel l1,l2,l3,l4,l5,l6,l7;
    private JTextField ntf, etf, atf, ctf, cntf; 
    private JPasswordField pf;
    private JButton adbtn, backbtn; 
   
    public LibrarianForm(){
        this.getContentPane().setLayout(null); 
        this.getContentPane().setBackground(new Color(59,89,152));
        
        l1 = new JLabel("Add Librarian");
        l1.setBounds(160,15,400,80);
	l1.setFont(new Font("Tahoma", Font.BOLD, 18));
	l1.setForeground(Color.white);
        add(l1);
        
        ///
        l2 = new JLabel("Name: ");
        l2.setBounds(20,80,100,25);
        l2.setForeground(Color.white);
        add(l2);
        
        ntf = new JTextField(); 
        ntf.setBounds(130,80,280,25);
        add(ntf); 
        
        l3 = new JLabel("Password: ");
        l3.setBounds(20,120,100,25);
        l3.setForeground(Color.white);
        add(l3);
        
        pf = new JPasswordField(); 
        pf.setBounds(130,120,280,25); 
        add(pf); 
        
        l4 = new JLabel("Email: ");
        l4.setBounds(20,160,100,25);
        l4.setForeground(Color.white);
        add(l4);
        
        etf = new JTextField(); 
        etf.setBounds(130,160,280,25); 
        add(etf);
        
        l5 = new JLabel("Address: ");
        l5.setBounds(20,200,100,25);
        l5.setForeground(Color.white);
        add(l5);
        
        atf = new JTextField(); 
        atf.setBounds(130,200,280,25); 
        add(atf);
        
        l6 = new JLabel("City: ");
        l6.setBounds(20,240,100,25);
        l6.setForeground(Color.white);
        add(l6);
        
        ctf = new JTextField(); 
        ctf.setBounds(130,240,280,25); 
        add(ctf);
        
        l7 = new JLabel("Contact No.: ");
        l7.setBounds(20,280,100,25);
        l7.setForeground(Color.white);
        add(l7);
        
        cntf = new JTextField(); 
        cntf.setBounds(130,280,280,25); 
        add(cntf);
        
        adbtn = new JButton("Add"); 
        adbtn.setBounds(130,330,90,30);
        add(adbtn);
        adbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = ntf.getText();
                String password = String.valueOf(pf.getPassword());
                String email = etf.getText();
                String address = atf.getText();
                String city = ctf.getText();
                String contact = cntf.getText();
                
                //Regex
                String nameR = "[a-zA-Z]+";
                String emailR = "[a-z0-9]+@(yahoo|gmail|outlook).com";
                String passwordR = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&_*!]).{6,20}";
                String contactR = "(\\+88)?-?01[3-9]\\d{8}";
           
              
                
                
                //Validation 
                if(!Pattern.matches(nameR, name)){
                    JOptionPane.showMessageDialog(null, "Invalid userName!");
                }
                    
                else if(!Pattern.matches(passwordR, password)){
                    JOptionPane.showMessageDialog(null, "Invalid Password! Enter correct password.");
                }
                
                else if(!Pattern.matches(emailR, email)){
                    JOptionPane.showMessageDialog(null, "Invalid Email!");
                }
                    
                else if(!Pattern.matches(contactR, contact)){
                    JOptionPane.showMessageDialog(null, "Invalid! Only valid PHONE no. is accepted.");
                }
                
                else{
                    int i = AddLibrarian.save(name, password, email, address, city, contact);
                    if(i>0){
                        JOptionPane.showMessageDialog(LibrarianForm.this,"Librarian added successfully!");
                      
                          ntf.setText("");
                          pf.setText("");
                          etf.setText("");
                          atf.setText("");
                          ctf.setText("");
                          cntf.setText("");
                    }
                }
            }
        });
        
        backbtn = new JButton("Back"); 
        backbtn.setBounds(320,330,90,30);
        add(backbtn);
        backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            AdminSection.main(new String[]{});
			
			}
		});
        
        
        
    }
    
    public static void main(String[] args) {
        LibrarianForm f = new LibrarianForm(); 
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(400, 225, 450, 440);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

