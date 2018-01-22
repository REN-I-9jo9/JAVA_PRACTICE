package Practice8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Random;

public class _5_ {
	static JFrame frame=new JFrame("比　大　小");
	static Container container=frame.getContentPane();
	static JLabel history=new JLabel("戰績: 0 勝 0 敗");
	static JLabel number=new JLabel("");
	static JLabel result=new JLabel("");
	static JButton bigger=new JButton("比7大");
	static JButton smaller=new JButton("比7小");
	static int num=7,win=0,lose=0;
	
	public static void main(String[] args) {
		frame.setBounds(200, 200, 300, 240);;
		
		container.setLayout(new GridLayout(5,1));
		
		JPanel l1=new JPanel(new FlowLayout(FlowLayout.CENTER));
		container.add(l1);
		l1.add(new JLabel("比　大　小"));
		
		JPanel l2=new JPanel(new FlowLayout(FlowLayout.CENTER));
		container.add(l2);
		l2.add(history);
		
		JPanel l3=new JPanel(new FlowLayout(FlowLayout.CENTER));
		container.add(l3);
		l3.add(number);
		
		JPanel l4=new JPanel(new FlowLayout(FlowLayout.CENTER));
		container.add(l4);
		l4.add(result);
		
		JPanel l5=new JPanel(new FlowLayout(FlowLayout.CENTER));
		container.add(l5);
		l5.add(bigger);
		l5.add(smaller);
		
		number.setForeground(Color.BLUE);
		number.setFont(new Font("",1,30));
		
		btnEvent btn=new btnEvent();
		bigger.addActionListener(btn);
		smaller.addActionListener(btn);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	static class btnEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			num=(new Random().nextInt(13))+1;
			number.setText(Integer.toString(num));
			String r="";
			if(num>7)
			{
				if(e.getSource()==bigger)
				{
					r="You win!";
					result.setForeground(Color.BLUE);
					win++;
				}
				else
				{
					r="You lose!";
					result.setForeground(Color.RED);
					lose++;
				}
					
			}
			else if(num==7)
			{
				r="Try again!";
				result.setForeground(Color.BLACK);
			}
			else if(num<7)
			{
				if(e.getSource()==smaller)
				{
					r="You win!";
					result.setForeground(Color.BLUE);
					win++;
				}
				else
				{
					r="You lose!";
					result.setForeground(Color.RED);
					lose++;
				}
			}
			result.setText(r);
			history.setText("戰績: "+win+" 勝 "+lose+" 敗");
			
		}
	}
}
