package Americano;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartScreen extends JFrame{
	public StartScreen(){	
		
		setTitle("주문시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		Font f1 = new Font("Calisto MT", Font.BOLD, 60);
		Font f2 = new Font("맑은 고딕", Font.BOLD, 20);
		
		//타이틀
		JLabel name_label = new JLabel("JAVA CAFE");	
		name_label.setFont(f1);
		name_label.setBounds(125,120,350,90);
		
		//배경사진
		ImageIcon StartScreen_background = new ImageIcon("images/cafepic.png");
		JLabel background_label = new JLabel(StartScreen_background);		
		background_label.setBounds(0,0,590, 800);

		background_label.addMouseListener(new HandleMouseClick());

		//주문멘트
		JLabel order_label = new JLabel("주문하시려면 화면을 눌러주세요 CLICK HERE");
		order_label.setFont(f2);
		order_label.setForeground(Color.WHITE);
		order_label.setBounds(80,620,450,60);
		
		//관리자설정 버튼
		ImageIcon opt = new ImageIcon("images/optionicon.png");
		JButton option_btn = new JButton(opt);	
		option_btn.setBorderPainted(false);
		option_btn.setContentAreaFilled(false);
		option_btn.setFocusPainted(false);
		option_btn.setBounds(520,40,40,40);
	
		option_btn.addActionListener(new HandleClickButton());

		c.add(name_label);
		c.add(order_label);
		c.add(option_btn);
		c.add(background_label);
		
		setSize(600,800);
		setVisible(true);
	}
	private class HandleMouseClick implements MouseListener{
		public void mousePressed(MouseEvent e) {
			new MenuScreen();
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

	}
	private class HandleClickButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			new Login();
		}
	}
	public static void main(String [] args) {
		new StartScreen();
		ManageMode init = new ManageMode();
		init.setVisible(false);
		init.setinit(100,50,50,50);

	}
}

