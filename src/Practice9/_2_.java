package Practice9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class _2_ {
	static JFrame frame=new JFrame("電子字典");
	static Container container=frame.getContentPane();
	static JTextField spell = new JTextField(18);
	static JButton btn1 = new JButton("查詢");
	static JLabel chinese=new JLabel();
	static JLabel sentence=new JLabel();
	
	public static void main(String[] args) {
		frame.setBounds(200, 200, 620, 235);;
		
		container.setLayout(new GridLayout(4,1));
		
		JPanel l1=new JPanel(new FlowLayout(FlowLayout.CENTER));
		container.add(l1);
		l1.add(new JLabel("電子字典"));
		
		
		JPanel l2=new JPanel(new FlowLayout(FlowLayout.LEFT));
		container.add(l2);
		l2.add(new JLabel("英文單字:"));
		l2.add(spell);
		l2.add(btn1);
		
		JPanel l3=new JPanel(new FlowLayout(FlowLayout.LEFT));
		container.add(l3);
		l3.add(new JLabel("中　　文:"));
		chinese.setForeground(Color.BLUE);
		l3.add(chinese);
		
		JPanel l4=new JPanel(new FlowLayout(FlowLayout.LEFT));
		container.add(l4);
		l4.add(new JLabel("例　　句:"));
		sentence.setForeground(Color.BLUE);
		l4.add(sentence);
		
		btn1.addActionListener(new btnEvent());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	static class btnEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try
			{ 
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); // Load the JDBC driver
				Connection con = DriverManager.getConnection("jdbc:ucanaccess://dictionary.mdb");//Connect to the database
				System.out.println("資料庫連線測試成功！");

				Statement stmt=con.createStatement(); 
				String sql="select * from dictionary where id='"+spell.getText()+"'";
				ResultSet rs=stmt.executeQuery(sql);  
				rs.next();
				chinese.setText(rs.getString("pwd"));
				sentence.setText(rs.getString("name"));
				
				
				con.close(); 
			} 
			catch(ClassNotFoundException e1) 
			{ 
				System.out.println("找不到驅動程式類別"); 
			} 
			catch(SQLException e1) 
			{ 
				chinese.setForeground(Color.RED);
				chinese.setText("查無此單字");
				sentence.setText("");
			}
		}
	}
}
