
package AA_LibraryManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ReturnBookForm extends JFrame implements ActionListener{
    private JLabel l1, l2, l3; 
    private JTextField bcntf, stdidtf; 
    private JButton rtnbtn, backbtn; 
    
    public ReturnBookForm(){
        this.getContentPane().setLayout(null); 
        this.getContentPane().setBackground(new Color(59,89,152));
        
        l1 = new JLabel("Return Book");
        l1.setBounds(160,15,400,80);
	l1.setFont(new Font("Tahoma", Font.BOLD, 18));
	l1.setForeground(Color.white);
        add(l1);
        
        l2 = new JLabel("Book Call No.: ");
        l2.setBounds(20,80,100,25);
        l2.setForeground(Color.white);

        add(l2);
        
        bcntf = new JTextField(); 
        bcntf.setBounds(140,80,225,25);
        add(bcntf); 
        
        
        l3 = new JLabel("Student ID: ");
        l3.setBounds(20,150,100,25);
        l3.setForeground(Color.white);
        add(l3); 
        
        stdidtf = new JTextField(); 
        stdidtf.setBounds(140,150,225,25);
        add(stdidtf);
        
        
        rtnbtn = new JButton("Return Book"); 
        rtnbtn.setBounds(140,250,130,30);
        add(rtnbtn);
        rtnbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bookcallno = bcntf.getText();
                int studentid = Integer.parseInt(stdidtf.getText());
                int i = ReturnBook.delete(bookcallno, studentid);
                if(i>0){
                    JOptionPane.showMessageDialog(ReturnBookForm.this,"Book returned successfully!");
                    LibrarianSection.main(new String[]{});
                    dispose();
                    
                }else{
                    JOptionPane.showMessageDialog(ReturnBookForm.this,"Sorry, unable to return book!");
                }
            }
        });
        

        
        backbtn = new JButton("Back"); 
        backbtn.setBounds(315,300,100,25);
        add(backbtn); 
        backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
                                LibrarianSection.main(new String[]{});
			}
		});
        
    }
    
    public static void main(String[] args) {
        ReturnBookForm f = new ReturnBookForm(); 
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(400,225,450,400);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
