package Practice8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _2_ {
	static JFrame frame=new JFrame("BMI���ƭp��");
	static Container container=frame.getContentPane();
	static JTextField height=new JTextField(20);
	static JTextField weight=new JTextField(20);
	static JLabel bmi=new JLabel("");
	static JButton answerbutton=new JButton("�ݵ��G");
	static JPanel[] panel=new JPanel[5];
	public static void main(String[] args) {
		frame.setSize(400, 500);
		frame.setLocation(200, 200);
		
		container.setLayout(new GridLayout(5,1));
		
		panel[0]=new JPanel();
		container.add(panel[0]);
		JLabel line1=new JLabel("BMI���ƭp��");
		panel[0].add(line1);
		
		panel[1]=new JPanel(new FlowLayout(FlowLayout.CENTER));
		container.add(panel[1]);
		JLabel line2=new JLabel("����(cm):");
		panel[1].add(line2);
		panel[1].add(height);
		
		panel[2]=new JPanel(new FlowLayout(FlowLayout.CENTER));
		container.add(panel[2]);
		JLabel line3=new JLabel("�魫(kg):");
		panel[2].add(line3);
		panel[2].add(weight);
		
		panel[3]=new JPanel(new FlowLayout(FlowLayout.CENTER));
		container.add(panel[3]);
		JLabel line4=new JLabel("�E�_���G:");
		panel[3].add(line4);
		panel[3].add(bmi);
		
		panel[4]=new JPanel();
		container.add(panel[4]);
		panel[4].add(answerbutton);
		
		AnswerEvent answerevent=new AnswerEvent();
		answerbutton.addActionListener(answerevent);
		
		frame.addWindowListener(new WindowsOperationEvent());
		frame.setVisible(true);
	}
	static class AnswerEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			float WEIGHT=Float.parseFloat(weight.getText());
			float HEIGHT=Float.parseFloat(height.getText())/100;
			float BMI=(WEIGHT/HEIGHT)/HEIGHT;
			bmi.setForeground((BMI>=18.5&&BMI<24)?Color.BLUE:Color.RED);
			String result=
			(BMI<18.5)?"(�魫�L��)":
			(BMI>=18.5&&BMI<24)?"(���`�d��)":
			(BMI>=24&&BMI<27)?"(�L��)":
			(BMI>=27&&BMI<30)?"(���תέD)":
			(BMI>=30&&BMI<35)?"(���תέD)":
			(BMI>=35)?"(���תέD)":"";
			bmi.setText("BMI = "+Float.toString(BMI)+result);
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
