package org.java.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFrameEx {
	public static void main(String[] args) {
		System.out.println("JFrame");
		//1. container 2. component 3. container.add() 4. .view
		
		//1. JFrame 생성
		JFrame jFrame = new JFrame();
		
		//title 생성
		jFrame.setTitle("JFrame test");
		
		//기본적으로 X 클릭 후 JFrame 제거
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		//기본 레이아웃 -> 컴포넌트의 배치 설정
//		jFrame.setLayout(new FlowLayout());

		//2. Container 생성, 선택
		Container container = jFrame.getContentPane(); //생략 가능
		container.setLayout(new FlowLayout(FlowLayout.CENTER));	//컴포넌트 기본 배치
		
		//3. Menu bar
		JMenuBar jMenuBar = new JMenuBar();
		jMenuBar.setSize(500,50);
		
		container.add(jMenuBar);
		
		//4. Menu -> 
		JMenu pl = new JMenu("PL");
		JMenu rdbms = new JMenu("RDBMS");
		JMenu web = new JMenu("WEB");
		jMenuBar.add(pl);
		jMenuBar.add(rdbms);
		jMenuBar.add(web);
		
		//5. Menu Item
		JMenuItem java = new JMenuItem("JAVA");
		JMenuItem spring = new JMenuItem("SPRING");
		JMenuItem react = new JMenuItem("REACT");
		pl.add(java);
		pl.add(spring);
		pl.add(react);
		
		JMenuItem oracle = new JMenuItem("ORACLE");
		JMenuItem mysql = new JMenuItem("MYSQL");
		JMenuItem mariadb = new JMenuItem("MARIADB");
		
		rdbms.add(oracle);
		rdbms.add(mysql);
		rdbms.add(mariadb);
		
		JMenuItem html = new JMenuItem("HTML");
		JMenuItem css = new JMenuItem("CSS");
		JMenuItem js = new JMenuItem("JS");
		
		rdbms.add(html);
		rdbms.add(css);
		rdbms.add(js);
		
		//6. JButton 생성
		JButton jButton1 = new JButton();
		jButton1.setText("BUTTON1");
		jButton1.setSize(50, 50);
		
		JButton jButton2 = new JButton();
		jButton2.setText("BUTTON2");
		jButton2.setSize(50, 50);
		
		JButton jButton3 = new JButton();
		jButton3.setText("BUTTON3");
		jButton3.setSize(50, 50);
		
		container.add(jButton1);
		container.add(jButton2);
		container.add(jButton3);
		
		//7. label
		Label label1= new Label("Label1");
		Label label2= new Label("Label2");
		
		container.add(label1);
		container.add(label2);
		
		//JFrame 크기
		jFrame.setSize(500,300);
		//보이게
		jFrame.setVisible(true);
	}
}
