package Americano;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartScreen extends JFrame{
	public StartScreen(){	
		
		setTitle("�ֹ�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		Font f1 = new Font("Calisto MT", Font.BOLD, 60);
		Font f2 = new Font("���� ���", Font.BOLD, 20);
		
		//Ÿ��Ʋ
		JLabel name_label = new JLabel("JAVA CAFE");	
		name_label.setFont(f1);
		name_label.setBounds(125,120,350,90);
		
		//������
		ImageIcon StartScreen_background = new ImageIcon("images/cafepic.png");
		JLabel background_label = new JLabel(StartScreen_background);		
		background_label.setBounds(0,0,590, 800);
		
		//�ֹ���Ʈ
		JLabel order_label = new JLabel("�ֹ��Ͻ÷��� ȭ���� �����ּ��� CLICK HERE");
		order_label.setFont(f2);
		order_label.setForeground(Color.WHITE);
		order_label.setBounds(80,620,450,60);
		
		//�����ڼ��� ��ư
		ImageIcon opt = new ImageIcon("images/optionicon.png");
		JButton option_btn = new JButton(opt);	
		option_btn.setBorderPainted(false);
		option_btn.setContentAreaFilled(false);
		option_btn.setFocusPainted(false);
		option_btn.setBounds(520,40,40,40);
	
		c.add(name_label);
		c.add(order_label);
		c.add(option_btn);
		c.add(background_label);
		
		setSize(600,800);
		setVisible(true);
	}
	public static void main(String [] args) {
		new StartScreen();
		new Login();
	}
}