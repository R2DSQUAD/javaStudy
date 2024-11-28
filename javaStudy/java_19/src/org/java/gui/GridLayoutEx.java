package org.java.gui;

import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	
	public GridLayoutEx() {
		this.setTitle("GridLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// GridLayout grid1 = new GridLayout(5, 5, 100, 20);    
		
		//	GridLayout grid1 = new GridLayout(5, 5, 100, 20);    
		//	this.setLayout(grid1);
		
		GridLayout grid2 = new GridLayout();
		
		grid2.setRows(4);		
		grid2.setColumns(2);
		grid2.setHgap(5);		//격자 사이 수평 간격
		grid2.setVgap(5);		//격자 사이 수직 간격
		
		this.setLayout(grid2);
		
		this.add(new Label("USERID"));
		this.add(new JTextField("id"));
		this.add(new Label("USERPW"));
		this.add(new JTextField("pw"));
		this.add(new Label("USERNAME"));
		this.add(new JTextField("name"));
		this.add(new Label("ADDRESS"));
		this.add(new JTextField("address"));
		
		this.setSize(500,300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("GridLayout");
		
		new GridLayoutEx();
	}
}
