package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TodoApplication {

	public static void main(String[] args) {
		JFrame f=new JFrame("Todo Application");
		
		JButton b1 = new JButton("A");
		JButton b2 = new JButton("B");
		JButton b3 = new JButton("C");
		JButton b4 = new JButton("D");
		JButton b5 = new JButton("E");
		JButton b6 = new JButton("H");
		f.setLayout(new GridLayout(2, 3));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		
		f.setSize(200, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
