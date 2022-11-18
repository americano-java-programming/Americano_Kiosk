package Americano;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Login extends JFrame{
	public Login(){
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		Font f1 = new Font("Perpetua Titling MT", Font.BOLD, 40);
		Font f2 = new Font("맑은 고딕", Font.BOLD, 20);
		
		//아이디 입력
		JLabel Id_label = new JLabel("아이디");
		JTextField Id_tf = new JTextField("");
		Id_label.setBounds(20,20,60,30);
		Id_tf.setBounds(120,20,150,30);
		
		//패스워드 입력
		JLabel password_label = new JLabel("패스워드");
		JTextField password_tf = new JTextField("");
		password_label.setBounds(20,60,60,30);
		password_tf.setBounds(120,60,150,30);
		
		//로그인 버튼
		JButton login_btn = new JButton("로그인");
		login_btn.setBounds(50,110,80,40);
		
		//취소 버튼
		JButton exit_btn = new JButton("취소");
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