package javakids.mycalculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {
	Calc parent;
	char selectedAction =' ';
	double currentResult = 0;
	
	CalculatorEngine(Calc parent){
		this.parent = parent;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// event source
		JButton clickedButton = (JButton) e.getSource();
		String dispFieldText = parent.displayField.getText();
		double displayValue = 0;
		
		// get Button text
		if(!"".equals(dispFieldText)) {
			displayValue = Double.parseDouble(dispFieldText);
		}
		
		Object src = e.getSource();
		
		if(src == parent.buttonPlus) {
			selectedAction = '+';
			currentResult = displayValue;
			parent.displayField.setText("");
			
		} else if(src == parent.buttonSubtract) {
			selectedAction = '-';
			currentResult = displayValue;
			parent.displayField.setText("");
			
		} else if(src == parent.buttonDivide) {
			selectedAction = '/';
			currentResult = displayValue;
			parent.displayField.setText("");
		
		} else if(src == parent.buttonMultiply) {
			selectedAction = '*';
			currentResult = displayValue;
			parent.displayField.setText("");
		
		} else if(src == parent.buttonEqual) {
			
			if(selectedAction == '+') {
				currentResult += displayValue;
				parent.displayField.setText(""+currentResult);
				
			} else if(selectedAction == '-') {
				currentResult -= displayValue;
				parent.displayField.setText(""+currentResult);
			
			} else if(selectedAction == '/') {
				currentResult /= displayValue;
				parent.displayField.setText(""+currentResult);
			
			} else if(selectedAction == '*') {
				currentResult *= displayValue;
				parent.displayField.setText(""+currentResult);
			}
		
		} else {
			String clickedButtonLabel = clickedButton.getText();
			parent.displayField.setText(dispFieldText + clickedButtonLabel);
		}
	
//		String clickedButtonLabel1 = clickedButton.getText();
//		
//		parent.displayField.setText(displFieldText + clickedButtonLabel1);
		
//		JOptionPane.showConfirmDialog(null, "you pressed " + clickedButtonLabel, 
//				"Just a test", JOptionPane.PLAIN_MESSAGE);
	}

}
