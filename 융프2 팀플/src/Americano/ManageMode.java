package Americano;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ManageMode extends JFrame{

	private static int milk_storage;
	private static int greentea_storage;
	private static int chocolate_storage;
	private static int syrup_storage;
	private int milk_max=100;
	private int greentea_max=50;
	private int chocolate_max=50;
	private int syrup_max=50;
	public static void setinit(int milk, int greentea, int chocolate, int syrup) {
		milk_storage = milk; greentea_storage=greentea; chocolate_storage=chocolate; syrup_storage=syrup;
	}
	public static void setMilkStorage(){
		milk_storage--;
	}
	public static int getMilkStorage(){
		return milk_storage;
	}

	public static void setGreenteaStorage(){
		greentea_storage--;
	}
	public static int getGreenteaStorage(){
		return greentea_storage;
	}

	public static void setChocolateStorage(){
		chocolate_storage--;
	}
	public static int getChocolateStorage(){
		return chocolate_storage;
	}

	public static void setSyrupStorage(){
		syrup_storage--;
	}
	public static int getSyrupStorage(){
		return syrup_storage;
	}
	public String [] milkAdded= {"카푸치노","카페 라떼","헤이즐넛 라떼","카페모카","녹차 라떼"};
	public	String [] syrupAdded ={"헤이즐넛 라떼"};
	public	String [] greenteaAdded ={"녹차 라떼","그린티"};
	public	String [] chocolateAdded ={"초코 라떼","카페모카"};
	
	public ManageMode() {
		
		setTitle("재고관리 페이지");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		Font f1 = new Font("맑은 고딕", Font.BOLD, 20);
		Font f2 = new Font("맑은 고딕", Font.BOLD, 15);
		
		//재고관리 타이틀
		JPanel storage_panel = new JPanel();
		storage_panel.setLayout(new GridLayout(1,1));
		JLabel storage = new JLabel("재고관리",JLabel.CENTER);
		storage.setFont(f1);
		storage_panel.add(storage);
		storage_panel.setBounds(40,120,510,50);
		//메뉴 이름
		JPanel menu_panel = new JPanel();
		menu_panel.setLayout(new GridLayout(4,1));	
		//menu_panel.setBackground(Color.DARGRAY);
		JLabel milk = new JLabel("우유",JLabel.CENTER);	
		JLabel greentea = new JLabel("녹차가루",JLabel.CENTER);
		JLabel chocolate = new JLabel("초코가루",JLabel.CENTER);
		JLabel syrup = new JLabel("헤이즐넛 시럽",JLabel.CENTER);
		milk.setFont(f2);
		greentea.setFont(f2);
		chocolate.setFont(f2);
		syrup.setFont(f2);
		menu_panel.add(milk);
		menu_panel.add(greentea);
		menu_panel.add(chocolate);
		menu_panel.add(syrup);
		menu_panel.setBounds(40,190,100,430);
		//우유 재고 관리 
		JPanel milk_panel = new JPanel();
		//milk_panel.setLayout(new BorderLayout(0,0));
		JLabel milk_str = new JLabel("현재수량:  "+milk_storage+"  최대수량:  "+milk_max);	
		JButton milk_plus = new JButton("+");
		JButton milk_minus = new JButton("-");	
		milk_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(milk_storage<milk_max)
					milk_storage++;
				milk_str.setText("현재수량:  "+milk_storage+"  최대수량:  "+milk_max);
			}
		});
		milk_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(milk_storage>0)milk_storage--;
				milk_str.setText("현재수량:  "+milk_storage+"  최대수량:  "+milk_max);
			}
		});
		
		milk_str.setFont(f2);
		milk_panel.add(milk_str,BorderLayout.CENTER);
		milk_panel.add(milk_plus);
		milk_panel.add(milk_minus);
		milk_panel.setOpaque(true);
		milk_panel.setBackground(Color.LIGHT_GRAY);
		milk_plus.setOpaque(true);
		milk_plus.setBackground(Color.white);
		milk_minus.setOpaque(true);
		milk_minus.setBackground(Color.white);
		milk_panel.setBounds(150,190,400,100);
		
		//�끃李④�猷� �옱怨� 愿�由�
		JPanel greentea_panel = new JPanel();
		//greentea_panel.setLayout(new GridLayout(1,1));
		JLabel greentea_str = new JLabel("현재수량:  "+greentea_storage+"  최대수량:  "+greentea_max);			
		JButton greentea_plus = new JButton("+");
		JButton greentea_minus = new JButton("-");
		greentea_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(greentea_storage<greentea_max)
					greentea_storage++;
				greentea_str.setText("현재수량:  "+greentea_storage+"  최대수량:  "+greentea_max);
			}
		});
		greentea_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(greentea_storage>0)
					greentea_storage--;
				greentea_str.setText("현재수량:  "+greentea_storage+"  최대수량:  "+greentea_max);
			}
		});

		greentea_str.setFont(f2);
		greentea_panel.add(greentea_str);
		greentea_panel.add(greentea_plus);
		greentea_panel.add(greentea_minus);
		greentea_panel.setOpaque(true);
		greentea_panel.setBackground(Color.LIGHT_GRAY);
		greentea_plus.setOpaque(true);
		greentea_plus.setBackground(Color.white);
		greentea_minus.setOpaque(true);
		greentea_minus.setBackground(Color.white);
		greentea_panel.setBounds(150,300,400,100);

		
		//초코가루 재고관리
		JPanel chocolate_panel = new JPanel();
		//chocolate_panel.setLayout(new GridLayout(1,1));
		JLabel chocolate_str = new JLabel("현재수량:  "+chocolate_storage+"  최대수량:  "+chocolate_max);			
		JButton chocolate_plus = new JButton("+");
		JButton chocolate_minus = new JButton("-");	
		chocolate_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(chocolate_storage<chocolate_max)
					chocolate_storage++;
				chocolate_str.setText("현재수량:  "+chocolate_storage+"  최대수량:  "+chocolate_max);
			}
		});
		chocolate_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(chocolate_storage>0)
					chocolate_storage--;
				chocolate_str.setText("현재수량:  "+chocolate_storage+"  최대수량:  "+chocolate_max);
			}
		});

		chocolate_str.setFont(f2);
		chocolate_panel.add(chocolate_str);
		chocolate_panel.add(chocolate_plus);
		chocolate_panel.add(chocolate_minus);
		chocolate_panel.setOpaque(true);
		chocolate_panel.setBackground(Color.LIGHT_GRAY);
		chocolate_plus.setOpaque(true);
		chocolate_plus.setBackground(Color.white);
		chocolate_minus.setOpaque(true);
		chocolate_minus.setBackground(Color.white);
		chocolate_panel.setBounds(150,410,400,100);
		
		
		//시럽재고관리
		JPanel syrup_panel = new JPanel();
		//syrup_panel.setLayout(new GridLayout(1,1));
		JLabel syrup_str = new JLabel("현재수량:  "+syrup_storage+"  최대수량:  "+syrup_max);		
		JButton syrup_plus = new JButton("+");
		JButton syrup_minus = new JButton("-");	
		syrup_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(syrup_storage<syrup_max)
					syrup_storage++;
				syrup_str.setText("현재수량:  "+syrup_storage+"  최대수량:  "+syrup_max);
			}
		});
		syrup_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(syrup_storage>0)
					syrup_storage--;
				syrup_str.setText("현재수량:  "+syrup_storage+"  최대수량:  "+syrup_max);
			}
		});
		syrup_str.setFont(f2);
		syrup_panel.add(syrup_str);
		syrup_panel.add(syrup_plus);
		syrup_panel.add(syrup_minus);
		syrup_panel.setOpaque(true);
		syrup_panel.setBackground(Color.LIGHT_GRAY);
		syrup_plus.setOpaque(true);
		syrup_plus.setBackground(Color.white);
		syrup_minus.setOpaque(true);
		syrup_minus.setBackground(Color.white);
		syrup_panel.setBounds(150,520,400,100);
		
		//재고관리 창 나가기
		JButton exit = new JButton("나가기");
		exit.setFont(f2);
		exit.setOpaque(true);
		exit.setBackground(Color.LIGHT_GRAY);		
		exit.setBounds(450,650,100,40);
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				dispose(); 
				new StartScreen();
			}
		});
		
		c.add(storage_panel);
		c.add(menu_panel);	
		c.add(milk_panel);
		c.add(greentea_panel);
		c.add(chocolate_panel);
		c.add(syrup_panel);
		c.add(exit);
		
		setSize(600,800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ManageMode();
		
	}
}