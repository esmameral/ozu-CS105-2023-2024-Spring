package gui;

import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyTodoApp extends JFrame {

	public MyTodoApp() throws HeadlessException {
		JButton b1 = new JButton("First");// creating instance of JButton
		
		b1.setBounds(130, 100, 100, 40);// x axis, y axis, width, height
		
		JButton b2 = new JButton("Second");// creating instance of JButton
		b2.setBounds(130, 150, 100, 40);// x axis, y axis, width, height
		
		add(b1);// adding button in JFrame
		add(b2);// adding button in JFrame
		
		setTitle("First Swing Example");
		setSize(400, 300);// 400 width and 300 height
		setLayout(null);// using no layout managers
		setVisible(true);// making the frame visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	public static void main(String[] args) {
		new MyTodoApp();
	}
	
	

}
