//결제화면 

package Americano;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.*;

public class PayScreen extends JFrame{
	
	public PayScreen() {
		setTitle("JAVA CAFE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(600,800);
		setResizable(false);
		c.setLayout(null);
		c.setBackground(Color.white);
		
		Font big = new Font("맑은 고딕",Font.BOLD,40);
		//카페이름 창
		JLabel top = new JLabel("JAVA CAFE");
		top.setOpaque(true);
		top.setBackground(Color.LIGHT_GRAY);
		top.setForeground(Color.WHITE);
		top.setFont(big);
		top.setBounds(0, 0, 600, 50);
		top.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel guidemessage = new JLabel("<HTML><body><center>결제수단을<br>선택해 주세요</center><body></HTML>");
		guidemessage.setFont(big);
		guidemessage.setHorizontalAlignment(JLabel.CENTER);
		guidemessage.setBounds(0, 50, 600, 100);
		
		JPanel paymethod = new JPanel(new GridLayout(1,2,0,0));
		paymethod.setBounds(10, 160, 580, 280);
		
		JButton card = new JButton("신용카드", new ImageIcon("images/card.png"));
		card.setVerticalTextPosition(JButton.BOTTOM);
		card.setHorizontalTextPosition(JButton.CENTER);
		card.setFont(new Font("맑은 고딕",Font.BOLD,20));
		card.setOpaque(true);
		card.setBackground(Color.white);
		
		JButton cash = new JButton("현금", new ImageIcon("images/cash.png"));
		cash.setVerticalTextPosition(JButton.BOTTOM);
		cash.setHorizontalTextPosition(JButton.CENTER);
		cash.setFont(new Font("맑은 고딕",Font.BOLD,20));
		cash.setOpaque(true);
		cash.setBackground(Color.white);
		
		paymethod.add(card);
		paymethod.add(cash);
		
		
		JButton cancle = new JButton("취소");
		cancle.setBounds(250, 480, 100, 30);
		cancle.setFont(new Font("맑은 고딕",Font.PLAIN,15));
		cancle.setOpaque(true);
		cancle.setBackground(Color.white);
		cancle.setForeground(Color.red);
		
		
		c.add(top);
		c.add(guidemessage);
		c.add(paymethod);
		c.add(cancle);
		setVisible(true);
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				new StartScreen();
//				new Login();
				new MenuScreen();
				setVisible(false);
			}
		});
		card.addActionListener(new ActionListener() { //결제 수단 선택시 결제완료 화면으로 이동하도록 구현
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,"카드를 카드인식기에 꽂아주세요.","알림" ,JOptionPane.DEFAULT_OPTION);
				if(result == 0) {
					new OrderComplete();
					setVisible(false);
				}
		}
				
	});
		
		cash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,"현금을 넣어주세요.","알림" ,JOptionPane.DEFAULT_OPTION);
				if(result == 0) {
					new OrderComplete();
					setVisible(false);
				}
			}
			
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PayScreen();
	}

}