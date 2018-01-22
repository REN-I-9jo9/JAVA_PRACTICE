package Practice8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class _1_ extends JFrame {
	private JPanel cp;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_1_ frame = new _1_();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static JTextField name = new JTextField(10);
	static ButtonGroup bgroup1 = new ButtonGroup();
	static JRadioButton male= new JRadioButton("�k��");
	static JRadioButton female= new JRadioButton("�k��");
	static JCheckBox b1 = new JCheckBox("���x�y");
	static JCheckBox b2 = new JCheckBox("��a");
	static JCheckBox b3 = new JCheckBox("�C�]");
	static String[] s = {"��T�u�{�t","���~�޲z�t","��T�޲z�t","�^�y�t","���t"};
	static JComboBox major = new JComboBox(s);
	static JTextArea c6 = new JTextArea(1,20);
	public _1_() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 370, 420);
		cp = new JPanel();
		cp.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cp);
		
		cp.setLayout(new GridLayout(7,1));
		
		JPanel line1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		cp.add(line1);
		JLabel label_line1 = new JLabel("�ǥͭӤH�򥻸��",JLabel.CENTER);
		line1.add(label_line1);
		
		JPanel line2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		cp.add(line2);
		JLabel label_name = new JLabel("�m�W:");
		line2.add(label_name);
		line2.add(name);
		
		JPanel line3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		cp.add(line3);
		JLabel label_sex = new JLabel("�m�O:");
		line3.add(label_sex);
		line3.add(male);
		line3.add(female);
		bgroup1.add(male);
		bgroup1.add(female);
		
		
		JPanel line4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		cp.add(line4);
		JLabel label_major=new JLabel("�t��:");
		line4.add(label_major);
		line4.add(major);
		
		JPanel line5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		cp.add(line5);
		JLabel label_5 = new JLabel("����:");
		line5.add(label_5);
		line5.add(b1);
		line5.add(b2);
		line5.add(b3);
		
		JPanel line6 = new JPanel();
		cp.add(line6);
		line6.setBorder(BorderFactory.createTitledBorder("�ۧڤ���:"));
		JScrollPane scrollPane = new JScrollPane(c6);
		line6.add(scrollPane);
		
		JPanel line7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		cp.add(line7);
		JButton save = new JButton("�s��");
		line7.add(save);
		
		AnswerEvent answerevent=new AnswerEvent();
		save.addActionListener(answerevent);
	}
	static class AnswerEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String data="";
			data+=name.getText()+",";
			data+=((male.isSelected())?"�k��":(female.isSelected())?"�k��":"")+",";
			data+=major.getSelectedItem()+",";
			data+=(b1.isSelected())?("���x�y"+","):"";
			data+=(b2.isSelected())?("��a"+","):"";
			data+=(b3.isSelected())?("�C�]"+","):"";
			data+=c6.getText();
			try {
				FileWriter fw=new FileWriter("C:\\out.txt");
				fw.write(data);
				fw.close();
			} catch (IOException e1) {}
		}
	}
}
