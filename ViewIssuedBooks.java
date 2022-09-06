
package AA_LibraryManagement;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

public class ViewIssuedBooks extends JFrame implements ActionListener {

	private JPanel panel;
	private JTable table;
        private JButton backbtn; 

	public ViewIssuedBooks() {
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(25, 25, 25, 25));
		panel.setLayout(new BorderLayout(0, 0));
		setContentPane(panel);
		
		String data[][]=null;
		String column[]=null;
		try{
			Connection con = DbC.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from issuebooks",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			column=new String[cols];
			for(int i=1;i<=cols;i++){
				column[i-1]=rsmd.getColumnName(i);
			}
			
			rs.last();
			int rows=rs.getRow();
			rs.beforeFirst();

			data=new String[rows][cols];
			int count=0;
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		table = new JTable(data,column);
		JScrollPane sp=new JScrollPane(table);
		
		panel.add(sp, BorderLayout.CENTER);
                
                backbtn = new JButton("Back"); 
                panel.add(backbtn, BorderLayout.PAGE_END);
                backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            LibrarianSection.main(new String[]{});
			}
		});
	}
        
        public static void main(String[] args) {
                ViewIssuedBooks f = new ViewIssuedBooks();
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f.setBounds(0, 0, 1535, 820);
		
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


