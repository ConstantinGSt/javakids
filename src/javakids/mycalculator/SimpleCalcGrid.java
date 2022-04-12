package javakids.mycalculator;

import javax.swing.*;
import java.awt.GridLayout;

public class SimpleCalcGrid {

	public static void main(String[] args) {

		// Panel
		JPanel windowContent = new JPanel();
		
		//position manager this panel
		GridLayout gl = new GridLayout(4, 2);
		windowContent.setLayout(gl);
		
		//content
		JLabel label1 = new JLabel("Number 1 :");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Sum:");
		JTextField field3 = new JTextField(10);
		JButton go = new JButton("Add");
		
		//content to panel
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(field3);
		windowContent.add(go);
		
		//frame
		JFrame frame = new JFrame("My Calc, i use grid");
		frame.setContentPane(windowContent);

		//size & visible
		frame.setSize(320, 120);
		frame.setVisible(true);
	}

}
