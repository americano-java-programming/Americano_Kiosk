package Americano;

import java.awt.*;
import javax.swing.*;

public class OrderComplete extends JFrame{
	public OrderComplete() {
		setTitle("�ֹ��Ϸ� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		Font f1 = new Font("���� ���", Font.BOLD, 30);
		Font f2 = new Font("���� ���", Font.BOLD, 15);
		
		JPanel background_panel = new JPanel();
		background_panel.setBounds(40,40,505,770);
		
		//�����Ϸ��Ʈ
		JLabel paycomplete = new JLabel("������ �Ϸ�Ǿ����ϴ�", JLabel.CENTER);
		paycomplete.setFont(f1);
		paycomplete.setBounds(100,300,400,100);
		
		//ùȭ������ ���ư��� ��ư
		JButton back = new JButton("ó��ȭ������ ���ư���");
		back.setFont(f2);
		back.setOpaque(true);
		back.setBackground(Color.LIGHT_GRAY);
		back.setBounds(175,600,250,100);
		
		
		c.add(paycomplete);
		c.add(back);	
		c.add(background_panel);
		setSize(600,900);
		setVisible(true);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OrderComplete();
	}
}