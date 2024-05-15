package gui.event;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;


public class SayHelloGUI extends JFrame{
	private JTextField nameField=new JTextField();
    private JButton helloButton=new JButton("Say Hello");
    private JButton selamButton=new JButton("Selamla");
    private JLabel text=new JLabel();
	
    
	
	public SayHelloGUI() throws HeadlessException {
		getContentPane().setLayout(null);
		nameField.setBounds(22, 100, 100, 40);
		helloButton.setBounds(164, 100, 100, 40);
		helloButton.addActionListener(new ButtonActionListener());
		selamButton.setBounds(274, 100, 100, 40);
		selamButton.addActionListener(new ButtonActionListener());
		
	
		text.setBounds(137, 163, 100, 40);
		
		getContentPane().add(nameField);
		getContentPane().add(helloButton);
		getContentPane().add(selamButton);
		getContentPane().add(text);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	class ButtonActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String name=nameField.getText();
			if(e.getSource()==selamButton) {
			
				System.out.println("Merhaba");
				text.setText("Merhaba "+name);
			}else {
				System.out.println("Say Hello ");
				text.setText("Hello " +name);
			}
			
			
		}
		
	}



	public static void main(String[] args) {
		new SayHelloGUI();

	}

}
