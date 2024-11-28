package org.java.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ActionListerSub implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		System.out.println(e.getSource());
		System.out.println(e.getID());
	}
	
	
}

public class ActionEventEx1 extends JFrame{
	public ActionEventEx1() {
		this.setTitle("ActionListner");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("button");
	}
}
