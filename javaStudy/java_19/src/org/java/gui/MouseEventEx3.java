package org.java.gui;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEventEx3 extends JFrame {

	//내부클래스 생성
	class MouseListInnerClass implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseClick!");	//마우스를 눌렀다가 땜
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mousePresse!");	//마우스 누를 때
			int x= e.getX();
			int y= e.getY();
			
			
			
			System.out.println("좌표 -> x:"+x+", y:"+y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseRelease!");  //마우스 범위에 벗어남
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseEntered!"); //마우스 범위에 올려짐
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseExited!"); //마우스 범위에 제거
		}
	}
	
	public MouseEventEx3() {
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("BUTTON");
		
		this.add(btn1);
		
		int x=0;
		int y=0;
		
		btn1.addMouseListener(new MouseListInnerClass());
		
		this.setLocation(300,200);
		this.setSize(500, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("MouseEvent");
		new MouseEventEx3();
	}
}
