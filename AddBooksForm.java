
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

public class AddBooksForm extends JFrame implements ActionListener {

    private JLabel l1,l2,l3,l4,l5,l6,l7;
    private JTextField cntf, bntf, atf, ptf, qtf, istf; 
    private JButton abkbtn, backbtn; 
   
    public AddBooksForm(){
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(new Color(59,89,152));

        
        l1 = new JLabel("Add Books");
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
        
        l3 = new JLabel("Book Name: ");
        l3.setBounds(20,120,100,25);
        l3.setForeground(Color.white);
        add(l3);
        
        bntf = new JTextField(); 
        bntf.setBounds(130,120,280,25); 
        add(bntf); 
        
        l4 = new JLabel("Author Name: ");
        l4.setBounds(20,160,100,25);
        l4.setForeground(Color.white);
        add(l4);
        
        atf = new JTextField(); 
        atf.setBounds(130,160,280,25); 
        add(atf);
        
        l5 = new JLabel("Publisher Name: ");
        l5.setBounds(20,200,100,25);
        l5.setForeground(Color.white);
        add(l5);
        
        ptf = new JTextField(); 
        ptf.setBounds(130,200,280,25); 
        add(ptf);
        
        l6 = new JLabel("No. of Quantity: ");
        l6.setBounds(20,280,100,25);
        l6.setForeground(Color.white);
        add(l6);
        
        qtf = new JTextField(); 
        qtf.setBounds(130,280,280,25); 
        add(qtf);
        
        l7 = new JLabel("Issue: ");
        l7.setBounds(20,240,100,25);
        l7.setForeground(Color.white);
        add(l7);
        
        istf = new JTextField(); 
        istf.setBounds(130,240,280,25); 
        add(istf);
        
        abkbtn = new JButton("Add"); 
        abkbtn.setBounds(130,335,90,30);
        add(abkbtn); 
        abkbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int issued = 0;
		String callno = cntf.getText();
                String name = bntf.getText();
		String author = atf.getText();
		String publisher = ptf.getText();
                String squantity = qtf.getText();
		int quantity = Integer.parseInt(squantity);
		int i = AddBooks.save(callno, name, author, publisher, quantity);
                if(i>0){
        		JOptionPane.showMessageDialog(null,"Books added successfully!");
			dispose();
                        LibrarianSection.main(new String[]{});
                        
				
		}else{
                       	JOptionPane.showMessageDialog(null,"Sorry, unable to save!");
		}
            }
	});
        
        
        backbtn = new JButton("Back"); 
        backbtn.setBounds(317,335,90,30);
        add(backbtn);
        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
		dispose(); 
                LibrarianSection.main(new String[]{});
            }
	});
        
        
        
    }
    
    public static void main(String[] args) {
        AddBooksForm f = new AddBooksForm(); 
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(400, 225, 450, 440);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
