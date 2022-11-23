//메뉴화면 

package Americano;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class MenuScreen extends JFrame{
	private JButton[] menubtn=new JButton[9];
	private String[] menuname = {"에스프레소","아메리카노","카푸치노","카페 라떼","헤이즐넛 라떼","카페모카","녹차 라떼","초코 라떼","그린티"};
	private ImageIcon[] menuimage = {new ImageIcon("images/espresso.png"), new ImageIcon("images/americano.png"),new ImageIcon("images/cappuccino.png"),
			new ImageIcon("images/coffelatte.png"),new ImageIcon("images/hazelnuts.png"),new ImageIcon("images/caffemoca.png"),new ImageIcon("images/greentealatte.png"),
			new ImageIcon("images/choco.png"),new ImageIcon("images/greentea.png")};
	private int menuprice[] = {2000, 2000, 2500, 2500, 3000, 3000, 3000, 2500, 2000}; 
	
	public MenuScreen() {
		setTitle("JAVA CAFE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(600,800);
		setResizable(false);
		c.setLayout(null);
		c.setBackground(Color.white);
		
		//카페이름 창
		JLabel top = new JLabel("JAVA CAFE");
		top.setOpaque(true);
		top.setBackground(Color.LIGHT_GRAY);
		top.setForeground(Color.WHITE);
		top.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		top.setBounds(0, 0, 600, 50);
		top.setHorizontalAlignment(JLabel.CENTER);
		
		//메뉴페널 
		JPanel menupanel = new JPanel(new GridLayout(3,3,30,15));
		
		for(int i=0; i<menubtn.length; i++) {
			menubtn[i] = new JButton("<HTML>"+menuname[i]+"<br>"+"₩"+Integer.toString(menuprice[i])+"</HTML>",menuimage[i]);
			menubtn[i].setVerticalTextPosition(JButton.BOTTOM);
			menubtn[i].setHorizontalTextPosition(JButton.CENTER);
			menubtn[i].setOpaque(true);
			menubtn[i].setBackground(Color.white);
			menupanel.add(menubtn[i]);
		}
		menupanel.setBounds(10, 60, 580, 600);
	
		//장바구니
		JPanel bottom = new JPanel();
		BoxLayout box1 = new BoxLayout(bottom,BoxLayout.X_AXIS);
		bottom.setLayout(box1);
		bottom.setBounds(10,660,490,120);
		bottom.setBackground(Color.white);
		
		JPanel basket = new JPanel();
		BoxLayout box2 = new BoxLayout(basket,BoxLayout.X_AXIS);
		basket.setLayout(box2);
		basket.setBackground(Color.white);
		basket.setPreferredSize(new Dimension(350,110));
		JScrollPane scroll = new JScrollPane(basket);
		bottom.add(scroll);
		
		JPanel pricetap = new JPanel(new GridLayout(2,1,0,0));
		pricetap.setBackground(Color.white);
		JLabel fixlabel = new JLabel("총 결제금액");
		fixlabel.setHorizontalAlignment(JLabel.RIGHT);
		fixlabel.setFont(new Font("맑은 고딕",Font.PLAIN ,15));
		fixlabel.setForeground(Color.lightGray);
		JLabel price = new JLabel("0 won");
		price.setHorizontalAlignment(JLabel.RIGHT);
		price.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		price.setForeground(Color.red);
		pricetap.add(fixlabel);
		pricetap.add(price);
		bottom.add(pricetap);
		
		//결제버튼 
		JButton pay = new JButton("결제하기");
		pay.setBounds(505,660,85,110);
		pay.setOpaque(true);
		pay.setBackground(Color.LIGHT_GRAY);
		pay.setFont(new Font("맑은 고딕",Font.BOLD ,18));
		pay.setFocusPainted(false);
		
		c.add(pay);
		c.add(top);
		c.add(menupanel);
		c.add(bottom);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuScreen();
	}

}


	
	
		
		
	
	