package Americano;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

class Login extends JFrame{
	public Login(){
		
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		Font f1 = new Font("맑은 고딕", Font.BOLD, 15);
		
		//아이디 입력
		JLabel Id_label = new JLabel("아이디");
		JTextField Id_tf = new JTextField("");
		Id_label.setFont(f1);
		Id_label.setBounds(20,20,60,30);
		Id_tf.setBounds(120,20,150,30);
		
		//패스워드 입력
		JLabel password_label = new JLabel("패스워드");
		JTextField password_tf = new JTextField("");
		password_label.setFont(f1);
		password_label.setBounds(20,60,60,30);
		password_tf.setBounds(120,60,150,30);
		
		//로그인 버튼
		JButton login_btn = new JButton("로그인");
		login_btn.setFont(f1);
		login_btn.setOpaque(true);
		login_btn.setBackground(Color.LIGHT_GRAY);
		login_btn.setBounds(50,110,80,40);
		
		//로그인 버튼 클릭 시 아이디와 비밀번호 맞으면 manage mode 들어가기
		login_btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String password = password_tf.getText(); //사용자가 입력한 비밀번호 받아옴
				String id = Id_tf.getText(); //사용자가 입력한 아이디 받아옴
				if(password.equals("1234")&&id.equals("americano")){
					new ManageMode(); //매니지 모드로 들어감
					dispose(); //현재 로그인 창 없애기
				}
			}
		});

		//취소 버튼
		JButton exit_btn = new JButton("취소");
		exit_btn.setFont(f1);
		exit_btn.setOpaque(true);
		exit_btn.setBackground(Color.LIGHT_GRAY);
		exit_btn.setBounds(150,110,80,40);

		//취소 버튼 클릭 시 로그인 창 나감
		exit_btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});
			
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