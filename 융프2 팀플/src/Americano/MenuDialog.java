package Americano;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

class MenuDialog extends JDialog{ //옵션 선택 팝업창(에스프레소와 카푸치노는 없음) 
	private int orderprice;
	private int count=1;
	public String menuname;
	public ImageIcon menuimage;
	public int price;
	
	
	
	public MenuDialog(JFrame frame, String menuname, ImageIcon menuimage, int price, boolean coffee) {
		
		super(frame, "title", true);
		this.orderprice = price;
		this.setLayout(null);
		this.setSize(400,600);
		this.setResizable(false);
		this.setBackground(Color.white);
		
		//취소버튼, 담기버튼 
		JButton cancle = new JButton("취소");
		cancle.setBounds(5,500,195,70);
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		JButton hold = new JButton("메뉴 담기");
		hold.setBounds(200,500,195,70);
		hold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(orderprice);
				
				setVisible(false);
			}
		});
		
		common(menuname, menuimage, price);
		if (coffee==true) {
			coffee();
		}
		this.add(cancle);
		this.add(hold);
	}
	public void setMenu(String menuname, ImageIcon menuimage, int price) {
		System.out.println("메뉴설정 작동");
		this.menuname = menuname;
		this.menuimage = menuimage;
		this.price = price;
	}
	public int getorder() {
		return orderprice;
	}
	public String getmenuname() {
		return menuname;
	}
	public void common(String menuname, ImageIcon menuimage, int price) { //공통 
		JLabel image = new JLabel(menuimage);
		image.setBounds(5,5,170,170);
		image.setOpaque(true);
		
		JLabel name = new JLabel(menuname);
		name.setFont(new Font("맑은 고딕",Font.BOLD,25));
		name.setHorizontalTextPosition(JLabel.CENTER);
		name.setBounds(185, 5, 150, 50);
		
		JLabel quantity = new JLabel("1");
		quantity.setOpaque(true);
		quantity.setBackground(Color.white);
		quantity.setBounds(230,75,30,30);
		
		JLabel pricefix = new JLabel("주문금액");
		JLabel pricelabel = new JLabel(Integer.toString(price));
		pricelabel.setOpaque(true);
		pricelabel.setBackground(Color.white);
		pricefix.setBounds(185,115,60,40);
		pricelabel.setBounds(245, 115, 80, 40);
		JLabel templabel = new JLabel("HOT/ICE");
		ButtonGroup temp = new ButtonGroup();
		JRadioButton hot = new JRadioButton("HOT(핫)");
		JRadioButton ice = new JRadioButton("ICE(아이스)");
		templabel.setBounds(5,190,150,50);
		templabel.setFont(new Font("맑은 고딕",Font.BOLD,20));
		hot.setBounds(30,250,80,30);
		ice.setBounds(180, 250, 130, 30);
		temp.add(hot);
		temp.add(ice);
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		plus.setBounds(265, 77, 26, 26);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 1+(Integer.parseInt(quantity.getText())); // 수량 한 개 증가
				quantity.setText(Integer.toString(count));
				pricelabel.setText(Integer.toString(count*price));
				orderprice = count*price;
			}
		});
		minus.setBounds(199,77,26,26);
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(quantity.getText())!=1) {
					count = (Integer.parseInt(quantity.getText()))-1; // 수량 한 개 감소
					quantity.setText(Integer.toString(count));
					pricelabel.setText(Integer.toString(count*price));
				}
				
			}
		});
		
		
		JLabel sizelabel = new JLabel("SIZE");
		ButtonGroup size = new ButtonGroup();
		JRadioButton regular = new JRadioButton("레귤러");
		JRadioButton large = new JRadioButton("라지(+1000)");
		sizelabel.setBounds(5,290,150,50);
		sizelabel.setFont(new Font("맑은 고딕",Font.BOLD,20));
		regular.setBounds(30,350,80,30);
		large.setBounds(180, 350, 130, 30);
		large.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderprice += 1000*count;
				pricelabel.setText(Integer.toString(orderprice)); //가격 + 1000
			}
		});
		size.add(regular);
		size.add(large);
		
		
		this.add(image);
		this.add(name);
		this.add(quantity);
		this.add(minus);
		this.add(plus);
		this.add(pricefix);
		this.add(pricelabel);
		this.add(templabel);
		this.add(hot);
		this.add(ice);
		this.add(sizelabel);
		this.add(regular);
		this.add(large);
	}
	public void coffee(){ //아메리카노, 카페라떼, 헤이즐넛라떼, 모카라떼 해당 
		JLabel shotlabel = new JLabel("진하기");
		ButtonGroup shot = new ButtonGroup();
		JRadioButton light = new JRadioButton("연하게");
		JRadioButton original = new JRadioButton("보통");
		JRadioButton strong = new JRadioButton("샷 추가(+500)");
		shotlabel.setBounds(5,390,150,50);
		shotlabel.setFont(new Font("맑은 고딕",Font.BOLD,20));
		light.setBounds(30,450,80,30);
		original.setBounds(120, 450, 80, 30);
		strong.setBounds(190,450,130,30);
		shot.add(light);
		shot.add(original);
		shot.add(strong);
		JLabel pricelabel = new JLabel(Integer.toString(orderprice));
		pricelabel.setOpaque(true);
		pricelabel.setBackground(Color.white);
		pricelabel.setBounds(245, 115, 80, 40);
		
		strong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderprice += count*500;
				pricelabel.setText(Integer.toString(orderprice));
			}
		});
		this.add(pricelabel);
		this.add(shotlabel);
		this.add(light);
		this.add(original);
		this.add(strong);
	}
	
}

