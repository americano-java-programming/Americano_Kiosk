package Americano;

import javax.swing.*;
import java.awt.*;

public class ManageMode extends JFrame{
	private int milk_storage;
	private int greentea_storage;
	private int chocolate_storage;
	private int syrup_storage;
	private int milk_max;
	private int greentea_max;
	private int chocolate_max;
	private int syrup_max;
	
	public ManageMode() {
		setTitle("������ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		Font f1 = new Font("���� ���", Font.BOLD, 20);
		Font f2 = new Font("���� ���", Font.BOLD, 15);
		
		//������ Ÿ��Ʋ
		JPanel storage_panel = new JPanel();
		storage_panel.setLayout(new GridLayout(1,1));
		JLabel storage = new JLabel("������",JLabel.CENTER);
		storage.setFont(f1);
		storage_panel.add(storage);
		storage_panel.setBounds(40,120,510,50);
		
		//�޴� �̸�
		JPanel menu_panel = new JPanel();
		menu_panel.setLayout(new GridLayout(4,1));	
		//menu_panel.setBackground(Color.DARGRAY);
		JLabel milk = new JLabel("����",JLabel.CENTER);	
		JLabel greentea = new JLabel("��������",JLabel.CENTER);
		JLabel chocolate = new JLabel("���ڰ���",JLabel.CENTER);
		JLabel syrup = new JLabel("������� �÷�",JLabel.CENTER);
		milk.setFont(f2);
		greentea.setFont(f2);
		chocolate.setFont(f2);
		syrup.setFont(f2);
		menu_panel.add(milk);
		menu_panel.add(greentea);
		menu_panel.add(chocolate);
		menu_panel.add(syrup);
		menu_panel.setBounds(40,190,100,430);
		
		//���� ��� ����
		JPanel milk_panel = new JPanel();
		//milk_panel.setLayout(new BorderLayout(0,0));
		JLabel milk_str = new JLabel("�������:  "+milk_storage+"  �ִ����:  "+milk_max);	
		JButton milk_plus = new JButton("+");
		JButton milk_minus = new JButton("-");		
		milk_str.setFont(f2);
		milk_panel.add(milk_str,BorderLayout.CENTER);
		milk_panel.add(milk_plus);
		//milk_panel.add(milk_minus);
		milk_panel.setOpaque(true);
		milk_panel.setBackground(Color.LIGHT_GRAY);
		milk_plus.setOpaque(true);
		milk_plus.setBackground(Color.white);
		milk_minus.setOpaque(true);
		milk_minus.setBackground(Color.white);
		milk_panel.setBounds(150,190,400,100);
		
		//�������� ��� ����
		JPanel greentea_panel = new JPanel();
		//greentea_panel.setLayout(new GridLayout(1,1));
		JLabel greentea_str = new JLabel("�������:  "+greentea_storage+"  �ִ����:  "+greentea_max);			
		JButton greentea_plus = new JButton("+");
		JButton greentea_minus = new JButton("-");
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
		
		//���ڰ��� ��� ����
		JPanel chocolate_panel = new JPanel();
		//chocolate_panel.setLayout(new GridLayout(1,1));
		JLabel chocolate_str = new JLabel("�������:  "+chocolate_storage+"  �ִ����:  "+chocolate_max);			
		JButton chocolate_plus = new JButton("+");
		JButton chocolate_minus = new JButton("-");	
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
		
		//�÷� ��� ����
		JPanel syrup_panel = new JPanel();
		//syrup_panel.setLayout(new GridLayout(1,1));
		JLabel syrup_str = new JLabel("�������:  "+syrup_storage+"  �ִ����:  "+syrup_max);		
		JButton syrup_plus = new JButton("+");
		JButton syrup_minus = new JButton("-");	
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
		
		//������ â ������
		JButton exit = new JButton("������");
		exit.setFont(f2);
		exit.setOpaque(true);
		exit.setBackground(Color.LIGHT_GRAY);		
		exit.setBounds(450,650,100,40);
		
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
