package Americano;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

class MenuDialog extends JDialog{ //옵션 선택 팝업창(에스프레소와 카푸치노는 없음) 
	private int orderprice;
	
	public MenuDialog(JFrame frame) {
		super(frame,"해당 제품의 옵션을 선택해 주세요.");
		this.setLayout(null);
		this.setSize(400,600);
		this.setResizable(false);
		this.setBackground(Color.white);
		
		//취소버튼, 담기버튼 
		JButton cancle = new JButton("취소");
		cancle.setBounds(5,500,195,70);
		JButton hold = new JButton("메뉴 담기");
		hold.setBounds(200,500,195,70);
		
		this.add(cancle);
		this.add(hold);
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
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		plus.setBounds(265, 77, 26, 26);
		minus.setBounds(199,77,26,26);
		
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
		
		JLabel sizelabel = new JLabel("SIZE");
		ButtonGroup size = new ButtonGroup();
		JRadioButton regular = new JRadioButton("레귤러");
		JRadioButton large = new JRadioButton("라지(+1000)");
		sizelabel.setBounds(5,290,150,50);
		sizelabel.setFont(new Font("맑은 고딕",Font.BOLD,20));
		regular.setBounds(30,350,80,30);
		large.setBounds(180, 350, 130, 30);
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
		this.add(large);
		this.add(large);
	}
	public void coffee() { //아메리카노, 카페라떼, 헤이즐넛라떼, 모카라떼 해당 
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
		
		this.add(shotlabel);
		this.add(light);
		this.add(original);
		this.add(strong);
	}
}

