//package org.java.gui;
//
//import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class ActionEventEx3 extends JFrame implements ActionListener {
//	
//	JButton = jButton1 =null;
//	JButton = jButton2 =null;
//	JButton = jButton3 =null;
//	JButton = jButton3 =null;
//	JLabel = jlabel = null;
//	
//	public ActionEventEx3() {
//		this.setTitle("ActionEvent3");
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		Container container = this.getContentPane();
//		container.setLayout(new FlowLayout(FlowLayout.CENTER));
//		
//		jButton1 = new JButton("BUTTON1");
//		jButton1.setSize(100,50);
//		
//		jButton2 = new JButton("BUTTON2");
//		jButton2.setSize(100,50);
//		
//		jButton3 = new JButton("BUTTON3");
//		jButton3.setSize(100,50);
//		
//		JPanel jPanel1 = new JPanel();
//		jPanel1.setSize(200, 50);
//		
//		jPanel1.add(jButton1);
//		jPanel1.add(jButton2);
//		jPanel1.add(jButton3);
//		
//		jButton1.addActionLister(this);
//		jButton2.addActionLister(this);
//		jButton3.addActionLister(this);
//		
//		
//		this.setLocation(300, 200);
//		this.setSize(400, 200);
//		this.setVisible(true);
//	}
//	
//	
//	 
//	
//	public static void main(String[] args) {
//		
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println(e.getSource());
//		JButton jButton = (JButton) e.getSource();
//		System.out.println(jButton.getText());
//		
//		
//		if(e.getSource()==jButton1) {
//			System.out.println("jButton1 ->");
//		}else if(e.getSource()==jButton2) {
//			System.out.printl);
//		}
//	}
//}
