
package AA_LibraryManagement;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class DeleteLibrarian extends JFrame implements ActionListener{

    private JLabel l; 
    private JTextField idtf;
    private JButton del, back; 
    
    public DeleteLibrarian(){
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(new Color(59,89,152));

        
        l = new JLabel("Enter ID: ");
        l.setBounds(40,40,80,25);
        l.setForeground(Color.white);
        add(l); 
        
        idtf = new JTextField(); 
        idtf.setBounds(130, 40, 220, 25);
        add(idtf);
   
        
        del = new JButton("Delete");
        del.setBounds(130,120,80,30);
        add(del);
        del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sid = idtf.getText();
                if(sid == null || sid.trim().equals("")){
                    JOptionPane.showMessageDialog(DeleteLibrarian.this,"ID can't be blank");
		}else{
                    int id=Integer.parseInt(sid);
                    int i = AddLibrarian.delete(id);
                    if(i>0){
                        JOptionPane.showMessageDialog(DeleteLibrarian.this,"Record deleted successfully!");
                        idtf.setText("");
                      
                    }else{
                        JOptionPane.showMessageDialog(DeleteLibrarian.this,"Unable to delete given id!");
                        idtf.setText("");
                    }
                }
            }
        });
        
        back = new JButton("Back");
        back.setBounds(270,120,80,30);
        add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
                AdminSection.main(new String[]{});
            }
	});
   
        
        
    }
    
    
    public static void main(String[] args) {
        DeleteLibrarian f = new DeleteLibrarian(); 
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(400,225, 400, 300);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}
