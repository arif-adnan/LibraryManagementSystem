
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
import javax.swing.JTextField;

public class IssueBookForm extends JFrame implements ActionListener {

    private JLabel l1,l2,l3,l4,l5;
    private JTextField cntf, stdidtf, stdntf, stdctf; 
    private JButton issuebtn, backbtn; 
   
    public IssueBookForm(){
        this.getContentPane().setLayout(null); 
        this.getContentPane().setBackground(new Color(59,89,152));

        
        l1 = new JLabel("Issue Book");
        l1.setBounds(160,15,400,80);
	l1.setFont(new Font("Tahoma", Font.BOLD, 18));
	l1.setForeground(Color.white);
        add(l1);
        
        l2 = new JLabel("Call Number: ");
        l2.setBounds(20,80,100,25);
        l2.setForeground(Color.white);
        add(l2);
        
        cntf = new JTextField(); 
        cntf.setBounds(130,80,280,25);
        add(cntf); 
        
        l3 = new JLabel("Student ID: ");
        l3.setBounds(20,120,100,25);
        l3.setForeground(Color.white);
        add(l3);
        
        stdidtf = new JTextField(); 
        stdidtf.setBounds(130,120,280,25); 
        add(stdidtf); 
        
        l4 = new JLabel("Student Name: ");
        l4.setBounds(20,160,100,25);
        l4.setForeground(Color.white);
        add(l4);
        
        stdntf = new JTextField(); 
        stdntf.setBounds(130,160,280,25); 
        add(stdntf);
        
        l5 = new JLabel("Student Contact: ");
        l5.setBounds(20,200,100,25);
        l5.setForeground(Color.white);
        add(l5);
        
        stdctf = new JTextField(); 
        stdctf.setBounds(130,200,280,25); 
        add(stdctf);

      
        issuebtn = new JButton("Issue Book"); 
        issuebtn.setBounds(130,280,100,30);
        add(issuebtn);
        issuebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             
                String bookcallno = cntf.getText();
                int studentid = Integer.parseInt(stdidtf.getText());
                String studentname = stdntf.getText();
                String studentcontact = stdctf.getText();
                
                //Regex
                String studentnameR = "[a-zA-Z]+";
                String studentcontactR = "(\\+88)?-?01[3-9]\\d{8}";
           
                    
                //Validation 
                if(!Pattern.matches(studentnameR, studentname)){
                    JOptionPane.showMessageDialog(null, "Invalid userName!");
                }
                    
                else if(!Pattern.matches(studentcontactR, studentcontact)){
                    JOptionPane.showMessageDialog(null, "Invalid! Only valid PHONE no. is accepted.");
                }
                
                else if(IssueBook.checkBook(bookcallno)){
			
			int i=IssueBook.save(bookcallno, studentid, studentname, studentcontact);
			if(i>0){
				JOptionPane.showMessageDialog(IssueBookForm.this,"Book issued successfully!");
				LibrarianSection.main(new String[]{});
				dispose();
				
			}else{
				JOptionPane.showMessageDialog(IssueBookForm.this,"Sorry, unable to issue!");
			}
			
		}
                else{
				JOptionPane.showMessageDialog(IssueBookForm.this,"Sorry, Callno doesn't exist!");
			}
			
			}
		});
        
        backbtn = new JButton("Back"); 
        backbtn.setBounds(310,280,100,30);
        add(backbtn); 
        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                LibrarianSection.main(new String[]{});
            }
	});
        
        
        
        
    }
    
    public static void main(String[] args) {
        IssueBookForm f = new IssueBookForm(); 
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(400, 225, 450, 440);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

