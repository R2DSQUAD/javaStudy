package org.java.gui;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEventEx1 extends JFrame implements MouseListener{

	private int a;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e);
		System.out.println("mouseClick!");	//마우스를 눌렀다가 땜
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e);
		System.out.println("mousePresse!");	//마우스 땠을 때
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println(e);
		System.out.println("mouseRelease!");  //마우스 범위에 벗어남
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println(e);
		System.out.println("mouseEntered!"); //마우스 범위에 올려짐
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println(e);
		System.out.println("mouseExited!"); //마우스 범위에 제거
	}
	
	public MouseEventEx1() {
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("BUTTON");
		
		this.add(btn1);
		
		btn1.addMouseListener(this);
		
		this.setSize(500, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("MouseEvnet");
		MouseListener mouseListner = new MouseEventEx1();
	}

}
