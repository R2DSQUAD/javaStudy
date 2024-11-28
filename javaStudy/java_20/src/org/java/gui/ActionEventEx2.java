package org.java.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventEx2 extends JFrame {
	
	public ActionEventEx2() {
//		this.setLayout(new FlowLayout());
		this.setTitle("ActionEventEx2");
		
		Container container = this.getContentPane();
		this.setLayout(new FlowLayout());
		container.setSize(100,50);
		
		JButton jButton = new JButton("BUTTON");
		jButton.setSize(80,40);
		
		container.add(jButton);
		
		this.setLocation (300,200);
		this.setSize (400,200);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		System.out.println("ActionEvent");
	}
}
