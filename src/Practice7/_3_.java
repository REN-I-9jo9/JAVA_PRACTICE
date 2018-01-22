package Practice7;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class _3_ {
	static JFrame frame=new JFrame("­pºâ¾÷");
	static Container container=frame.getContentPane();
	static JButton[] numberbutton=new JButton[10];
	static JButton[] operationbutton=new JButton[2];
	static JTextField resultfield=new JTextField();
	static int buffer=0,answer=0;
	public static void main(String[] args) {
		frame.setSize(210, 250);
		frame.setLocation(200, 200);
		
		container.setLayout(null);
		
		
		resultfield.setBounds(20,20,150, 20);
		resultfield.setHorizontalAlignment(JTextField.RIGHT);
		container.add(resultfield);
		
		Container btncontainer=new Container();
		btncontainer.setLayout(new GridLayout(4,3));
		btncontainer.setBounds(20,40,150, 150);
		container.add(btncontainer);
		
		NumberEvent numberevent=new NumberEvent();
		for(int i=1;i<=10;i++)
		{
			numberbutton[i%10]=new JButton(Integer.toString(i%10));
			numberbutton[i%10].addActionListener(numberevent);
			btncontainer.add(numberbutton[i%10]);
		}
		
		OperationEvent cperationevent=new OperationEvent();
		operationbutton[0]=new JButton("+");
		operationbutton[0].addActionListener(cperationevent);
		btncontainer.add(operationbutton[0]);
		operationbutton[1]=new JButton("=");
		operationbutton[1].addActionListener(cperationevent);
		btncontainer.add(operationbutton[1]);
		
		frame.addWindowListener(new WindowsOperationEvent());
		frame.setVisible(true);
	}
	static class NumberEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int num=Integer.parseInt(((JButton)e.getSource()).getText());
			if(buffer*10+num>0)
			{
				buffer=buffer*10+num;
				resultfield.setText(Integer.toString(buffer));
			}
		}
	}
	static class OperationEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(((JButton)e.getSource()).getText().equals("+"))
			{
				answer=answer+buffer;
				buffer=0;
				resultfield.setText("+");
			}
			else if(((JButton)e.getSource()).getText().equals("="))
			{
				answer=answer+buffer;
				buffer=answer;
				answer=0;
				resultfield.setText(Integer.toString(buffer));
			}
		}
	}
	static class WindowsOperationEvent extends WindowAdapter
	{
		@Override
		public void windowClosing(WindowEvent arg0) {
			System.exit(0);
		}
	}
}