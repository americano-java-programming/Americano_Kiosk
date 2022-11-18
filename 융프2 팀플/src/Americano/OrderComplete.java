package Americano;

import java.awt.*;
import javax.swing.*;

public class OrderComplete extends JFrame{
	public OrderComplete() {
		setTitle("주문완료 페이지");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		Font f1 = new Font("맑은 고딕", Font.BOLD, 30);
		Font f2 = new Font("맑은 고딕", Font.BOLD, 15);
		
		JPanel background_panel = new JPanel();
		background_panel.setBounds(40,40,505,770);
		
		//결제완료멘트
		JLabel paycomplete = new JLabel("결제가 완료되었습니다", JLabel.CENTER);
		paycomplete.setFont(f1);
		paycomplete.setBounds(100,300,400,100);
		
		//첫화면으로 돌아가는 버튼
		JButton back = new JButton("처음화면으로 돌아가기");
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