//메뉴화면 

package Americano;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.Console;

import javax.swing.table.DefaultTableModel;
import java.util.*;

public class MenuScreen extends JFrame{
	private JButton[] menubtn=new JButton[9];
	private String[] menuname = {"에스프레소","아메리카노","카푸치노","카페 라떼","헤이즐넛 라떼","카페모카","녹차 라떼","초코 라떼","그린티"};
	private ImageIcon[] menuimage = {new ImageIcon("images/espresso.png"), new ImageIcon("images/americano.png"),new ImageIcon("images/cappuccino.png"),
			new ImageIcon("images/coffelatte.png"),new ImageIcon("images/hazelnuts.png"),new ImageIcon("images/caffemoca.png"),new ImageIcon("images/greentealatte.png"),
			new ImageIcon("images/choco.png"),new ImageIcon("images/greentea.png")};
	private int menuprice[] = {2000, 2000, 2500, 2500, 3000, 3000, 3000, 2500, 2000}; 
	public JLabel price;
	public int sum=0;
	public JPanel basket;
		//재고 별 메뉴들
	public String [] milkAdded= {"카푸치노","카페 라떼","헤이즐넛 라떼","카페모카","녹차 라떼"};
	public	String [] syrupAdded ={"헤이즐넛 라떼"};
	public	String [] greenteaAdded ={"녹차 라떼","그린티"};
	public	String [] chocolateAdded ={"초코 라떼","카페모카"};
	
	ArrayList<String> orderedNames = new ArrayList<>();
	MenuDialog dialog; //다이얼로그의 레퍼런스
	
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
	    
		//장바구니
		JPanel bottom = new JPanel();
		BoxLayout box1 = new BoxLayout(bottom,BoxLayout.X_AXIS);
		bottom.setLayout(box1);
		bottom.setBounds(10,650,490,120);
		bottom.setBackground(Color.white);
		
		
		String[] tableHeaderTitles = {"품명","옵션", "수량", "가격"};
		DefaultTableModel model = new DefaultTableModel(tableHeaderTitles, 0);
		JTable table = new JTable(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(10,665,350,90);
		c.add(tablePanel);
		tablePanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		tablePanel.add(scrollPane);
		tablePanel.add(table.getTableHeader(), BorderLayout.WEST);
		scrollPane.setViewportView(table);
		// 품목 박스
//		JPanel basket = new JPanel();
//		BoxLayout box2 = new BoxLayout(basket,BoxLayout.X_AXIS);
//		basket.setLayout(box2);
//		basket.setBackground(Color.white);
//		basket.setPreferredSize(new Dimension(350,110));
//		JScrollPane scroll = new JScrollPane(basket);
//		bottom.add(scroll);
		
		
		JPanel pricetap = new JPanel(new GridLayout(2,1,0,0));
		pricetap.setBackground(Color.white);
		JLabel fixlabel = new JLabel("총 결제금액");
		fixlabel.setHorizontalAlignment(JLabel.RIGHT);
		fixlabel.setFont(new Font("맑은 고딕",Font.PLAIN ,15));
		fixlabel.setForeground(Color.lightGray);
		price = new JLabel("0 won");
		price.setHorizontalAlignment(JLabel.RIGHT);
		price.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		price.setForeground(Color.red);
		pricetap.add(fixlabel);
		pricetap.add(price);
		bottom.add(pricetap);
		for(int i=0; i<menubtn.length; i++) {
			
			menubtn[i] = new JButton("<HTML>"+i+"<br>"+menuname[i]+"<br>"+"₩"+Integer.toString(menuprice[i])+"</HTML>", menuimage[i]);
			menubtn[i].setVerticalTextPosition(JButton.BOTTOM);
			menubtn[i].setHorizontalTextPosition(JButton.CENTER);
			menubtn[i].setOpaque(true);
			menubtn[i].setBackground(Color.white);
			menubtn[i].addActionListener(new MenuActionListener(price, model, this,milkAdded, greenteaAdded,syrupAdded,chocolateAdded));
			menupanel.add(menubtn[i]);
		}
		menupanel.setBounds(6, 60, 570, 600);
		
		//결제버튼 
		JButton pay = new JButton("결제");
		pay.setBounds(505,660,85,110);
		pay.setOpaque(true);
		pay.setBackground(Color.LIGHT_GRAY);
		pay.setFont(new Font("맑은 고딕",Font.BOLD ,18));
		pay.setFocusPainted(false);

		//재고 줄여주기
		pay.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(!((price.getText().toString()).equals("0 won"))) {
			setVisible(false);
			new PayScreen();}
			else {
				JOptionPane.showConfirmDialog(null,"메뉴를 골라주세요.","알림" ,JOptionPane.DEFAULT_OPTION);
			}
				
			}
		});
		
		c.add(pay);
		c.add(top);
		c.add(menupanel);
		c.add(bottom);
		setVisible(true);
		
		
	}
	class MenuActionListener implements ActionListener{
		
		private JLabel price;
		private JPanel basket;
		private JFrame c;
		private DefaultTableModel model;
		MenuActionListener(JLabel price, DefaultTableModel model, JFrame c,String[] milkAdded, String[] greenteaAdded,String[] syrupAdded,String[] chocolateAdded){
			this.price = price;
//			this.basket = basket;
			this.model = model;
			this.c = c;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
//			JButton b = (JButton)e.getSource();
			String inputstr[] = new String[4]; //테이블에 들어갈 배열선언
			Boolean isOpen = true;
			for(int i=0;i<milkAdded.length;i++){
				if(cmd.contains(milkAdded[i])){
					if(ManageMode.getMilkStorage()==0){
						int result = JOptionPane.showConfirmDialog(null,"재고가 없습니다.","알림" ,JOptionPane.DEFAULT_OPTION);
						isOpen = false;
						break;

					}
				}
			}
			for(int i=0;i<greenteaAdded.length;i++){
				if(isOpen&&cmd.contains(greenteaAdded[i])){
					System.out.println(ManageMode.getGreenteaStorage());
					if(ManageMode.getGreenteaStorage()==0){
						int result = JOptionPane.showConfirmDialog(null,"재고가 없습니다.","알림" ,JOptionPane.DEFAULT_OPTION);
						isOpen = false;
						break;
					}
				}
			}
			for(int i=0;i<syrupAdded.length;i++){
				if(isOpen&&cmd.contains(syrupAdded[i])){
					if(ManageMode.getSyrupStorage()==0){
						int result = JOptionPane.showConfirmDialog(null,"재고가 없습니다.","알림" ,JOptionPane.DEFAULT_OPTION);
						isOpen = false;
						break;
					}
				}
			}
			for(int i=0;i<chocolateAdded.length;i++){
				if(isOpen&&cmd.contains(chocolateAdded[i])){
					System.out.println(ManageMode.getChocolateStorage());
					if(ManageMode.getChocolateStorage()==0){
						int result = JOptionPane.showConfirmDialog(null,"재고가 없습니다.","알림" ,JOptionPane.DEFAULT_OPTION);
						isOpen = false;
						break;
					}
				}
			}
			if(isOpen){
			if(cmd.contains("아메리카노") || cmd.contains("카페 라떼") || cmd.contains("헤이즐넛 라떼") || cmd.contains("모카 라떼")) {
				
				int index = Integer.parseInt(cmd.replaceAll("[^\\d]", ""))/10000; // 인덱스 추출
				dialog = new MenuDialog(c , menuname[index], menuimage[index], menuprice[index], true);
				dialog.setVisible(true);
				if (dialog.getcancle()==false) {
					sum+=dialog.getorder();
					price.setText(sum+" won");
					inputstr[0] = menuname[index];
					inputstr[1] = (dialog.getoption()) ? "핫" : "아이스";
					orderedNames.add(menuname[index]);	
					inputstr[2] = Integer.toString(dialog.getcount());
					inputstr[3] = Integer.toString(dialog.getorder());
					model.addRow(inputstr);
				}
				
			}
			else if(cmd.contains("에스프레소") || cmd.contains("카푸치노")) {
				if(cmd.contains("카푸치노")){ManageMode.setMilkStorage();
					System.out.println("우유 줄어듬");}
				int index = Integer.parseInt(cmd.replaceAll("[^\\d]", ""))/10000; // 인덱스 추출
				sum+=menuprice[index];
				price.setText(sum+"won");
				inputstr[0] = menuname[index];
				orderedNames.add(menuname[index]);	
				inputstr[2] = "1";
				inputstr[3] = Integer.toString(menuprice[index]);
				model.addRow(inputstr);
		
			}
			else {
				int index = Integer.parseInt(cmd.replaceAll("[^\\d]", ""))/10000; //인덱스 추출
				dialog = new MenuDialog(c, menuname[index], menuimage[index], menuprice[index], false);
				dialog.setVisible(true);
				if(dialog.getcancle()==false) {
					sum+=dialog.getorder();
					price.setText(sum+" won");
					inputstr[0] = menuname[index];
					orderedNames.add(menuname[index]);	
					inputstr[1] = (dialog.getoption()) ? "핫" : "아이스";
					inputstr[2] = Integer.toString(dialog.getcount());
					inputstr[3] = Integer.toString(dialog.getorder());
					model.addRow(inputstr);
				}
			}}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuScreen();
	}

}
