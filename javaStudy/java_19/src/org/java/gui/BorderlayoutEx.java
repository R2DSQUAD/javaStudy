package org.java.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderlayoutEx extends JFrame{
	
	public BorderlayoutEx() {
		this.setTitle("BorderLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.add(new JButton("NORTH"), BorderLayout.NORTH);
		this.add(new JButton("EAST"), BorderLayout.EAST);
		this.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		this.add(new JButton("WEST"), BorderLayout.WEST);
		this.add(new JButton("CENTER"), BorderLayout.CENTER);
		
		this.setSize(500,300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("BorderLayout");
		new BorderlayoutEx();
	}
}
