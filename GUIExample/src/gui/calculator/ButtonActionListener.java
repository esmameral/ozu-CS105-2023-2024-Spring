package gui.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonActionListener implements ActionListener {
	SimpleCalculatorGUI gui;

	public ButtonActionListener(SimpleCalculatorGUI gui) {
		super();
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String number1Str = gui.number1TextField.getText();
		String number2Str = gui.number2TextField.getText();
		double number1 = 0;
		double number2 = 0;
		if (number1Str.length() == 0 || number2Str.length() == 0) {
			JOptionPane.showMessageDialog(null, "Please enter 2 numbers", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			number1 = Double.valueOf(number1Str);
			number2 = Double.valueOf(number2Str);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Please enter only integer or double values", "Error",
					JOptionPane.WARNING_MESSAGE);
		}
		double calculationResult = 0;

		if (e.getSource() == gui.addButton) {
			calculationResult = number1 + number2;

		} else if (e.getSource() == gui.subButton) {
			calculationResult = number1 - number2;
		} else if (e.getSource() == gui.mulButton) {
			calculationResult = number1 * number2;
		} else if (e.getSource() == gui.divButton) {
			calculationResult = number1 / number2;
		}

		gui.result.setText(calculationResult + "");

	}

}
