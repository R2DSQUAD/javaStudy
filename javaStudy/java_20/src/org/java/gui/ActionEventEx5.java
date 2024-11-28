package org.java.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventEx5 extends JFrame {
	public ActionEventEx5() {
		this.setTitle("ActionEvent5");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton jbutton1 = new JButton("Button1");
		jbutton1.setPreferredSize(new Dimension(100,50));
		
		JButton jbutton2 = new JButton("Button2");
		jbutton2.setPreferredSize(new Dimension(100,50));
		
		JButton jbutton3 = new JButton("Button3");
		jbutton3.setPreferredSize(new Dimension(100,50));
		
//		ActionEventSub5 a1 = ActionEventSub5();
//		jbutton1.addActionListener(a1);
		
		jbutton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("jButton2 -> 익명클래스 -> ActionListener");
				
			}
		});
		
		jbutton3.addActionListener((e)->System.out.println("jButton3 -> 람다식 -> ActionListener"));
		
		this.add(jbutton1);
		this.add(jbutton2);
		this.add(jbutton3);
		this.setSize(300,200);
		this.setLocation(300,200);
		this.setVisible(true);
	}

	
	public static void main(String[] args) {
		System.out.println("ActionEvent");
		
		new ActionEventEx5();
		//1. 구현객체 이용
	}
}
