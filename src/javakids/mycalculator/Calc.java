package javakids.mycalculator;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
//import java.awt.GridBagLayout;

public class Calc {
	// обьявляю все компоненты
	JPanel windowContent;
	JTextField displayField;
	JButton button0 = new JButton("0");
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");

	JButton buttonPoint = new JButton(".");
	JButton buttonEqual = new JButton("=");
	JButton buttonPlus = new JButton("+");
	JButton buttonSubtract = new JButton("-");
	JButton buttonMultiply = new JButton("*");
	JButton buttonDivide = new JButton("/");
	
	JButton[] button = new JButton[10];
	JPanel p1;
	JPanel p2;
	

	// BorderLayout & GridLayout добавляем все элементы на фрейм
	// в конструкторе
	Calc() {
		windowContent = new JPanel();
		// схема для панели 1
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		// create and visible Field
		displayField = new JTextField(30);
		windowContent.add("North", displayField);

		// схема для панели 2

		// JButton - input text Button as option
		button[0] = button1;
		button[1] = button2;
		button[2] = button3;
		button[3] = button4;
		button[4] = button5;
		button[5] = button6;
		button[6] = button7;
		button[7] = button8;
		button[8] = button9;
		button[9] = button0;


		// create panel with GridLayout 12 buttons, - 10 num
		// and "." and "="
		p1 = new JPanel();
		GridLayout gl = new GridLayout(4, 3);
		p1.setLayout(gl);
		// add buttons to panel
		int i = 0;
		while (i < 10) {
			p1.add(button[i]);
			i++;
		}
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		windowContent.add("Center", p1);
		
		p2 = new JPanel();
		GridLayout gl2 = new GridLayout(4, 1);
		p2.setLayout(gl2);
		// add buttons to panel
		p2.add(buttonPlus);
		p2.add(buttonSubtract);
		p2.add(buttonMultiply);
		p2.add(buttonDivide);
		windowContent.add("East", p2);

		// create frame and indicate basis panel
		JFrame frame = new JFrame("Calc");
		frame.setContentPane(windowContent);

		// window size
		frame.pack();

		// visible window
		frame.setVisible(true);
		
		CalculatorEngine calcEngine = new CalculatorEngine(this);
		button0.addActionListener(calcEngine);
		button1.addActionListener(calcEngine);
		button2.addActionListener(calcEngine);
		button3.addActionListener(calcEngine);
		button4.addActionListener(calcEngine);
		button5.addActionListener(calcEngine);
		button6.addActionListener(calcEngine);
		button7.addActionListener(calcEngine);
		button8.addActionListener(calcEngine);
		button9.addActionListener(calcEngine);
		buttonPoint.addActionListener(calcEngine);
		buttonEqual.addActionListener(calcEngine);
		buttonPlus.addActionListener(calcEngine);
		buttonSubtract.addActionListener(calcEngine);
		buttonMultiply.addActionListener(calcEngine);
		buttonDivide.addActionListener(calcEngine);
	}

	public static void main(String[] args) {
		Calc calc = new Calc();
	}
}
