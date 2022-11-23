package Americano;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Login extends JFrame{
	public Login(){
		
		setTitle("�α���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		Font f1 = new Font("���� ���", Font.BOLD, 15);
		
		//���̵� �Է�
		JLabel Id_label = new JLabel("���̵�");
		JTextField Id_tf = new JTextField("");
		Id_label.setFont(f1);
		Id_label.setBounds(20,20,60,30);
		Id_tf.setBounds(120,20,150,30);
		
		//�н����� �Է�
		JLabel password_label = new JLabel("�н�����");
		JTextField password_tf = new JTextField("");
		password_label.setFont(f1);
		password_label.setBounds(20,60,60,30);
		password_tf.setBounds(120,60,150,30);
		
		//�α��� ��ư
		JButton login_btn = new JButton("�α���");
		login_btn.setFont(f1);
		login_btn.setOpaque(true);
		login_btn.setBackground(Color.LIGHT_GRAY);
		login_btn.setBounds(50,110,80,40);
		
		//��� ��ư
		JButton exit_btn = new JButton("���");
		exit_btn.setFont(f1);
		exit_btn.setOpaque(true);
		exit_btn.setBackground(Color.LIGHT_GRAY);
		exit_btn.setBounds(150,110,80,40);
			
		c.add(Id_label);
		c.add(Id_tf);
		c.add(password_label);
		c.add(password_tf);
		c.add(login_btn);
		c.add(exit_btn);
		
		setSize(300,200);
		setVisible(true);
	}
}