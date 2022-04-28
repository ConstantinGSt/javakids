package javakids.mycalculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {
	Calc parent;
	
	CalculatorEngine(Calc parent){
		this.parent = parent;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		
		// event source
		JButton clickedButton = (JButton) e.getSource();
		
		// get Button text
		String clickedButtonLabel = clickedButton.getText();
		
		JOptionPane.showConfirmDialog(null, "you pressed " + clickedButtonLabel, 
				"Just a test", JOptionPane.PLAIN_MESSAGE);
	}

}
