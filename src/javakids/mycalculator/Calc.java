package javakids.mycalculator;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;


public class Calc {
	//обьявляю все компоненты
	JPanel windowContent;
	JTextField displayField;
	JButton [] button = new JButton[10];
//	JButton button0;
//	JButton button1;
//	JButton button2;
//	JButton button3;
//	JButton button4;
//	JButton button5;
//	JButton button6;
//	JButton button7;
//	JButton button8;
//	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	JButton buttonPlas;
	JButton buttonSubtract;
	JButton buttonMultiply;
	JButton buttonDivide;
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
		
		// create button use construct
		// JButton - input text Button as option
//		int i = 0;
//		while(i<10) {
//			button[i] = new JButton("i");
//			i++;
//		}
		
//		button1=new JButton("1");
//		button2=new JButton("2");
//		button3=new JButton("3");
//		button4=new JButton("4");
//		button5=new JButton("5");
//		button6=new JButton("6");
//		button7=new JButton("7");
//		button8=new JButton("8");
//		button9=new JButton("9");
		buttonPoint = new JButton(".");
		buttonEqual=new JButton("=");
		buttonPlas = new JButton("+");
		buttonSubtract = new JButton("-");
		buttonMultiply = new JButton("*");
		buttonDivide = new JButton("/");
		
		
		//create panel with GridLayout 12 buttons, - 10 num
		// and "." and "="
		p1 = new JPanel();
		GridLayout gl = new GridLayout(4, 3);
		p1.setLayout(gl);
		
		p2 = new JPanel();
		GridLayout gl2 = new GridLayout(4, 1);
		p2.setLayout(gl2);
		
		int i = 0;
		while(i<10) {
			button[i] = new JButton();
			p1.add(button[i]);
			i++;
		}
		// add buttons to panel 
//		p1.add(button[i]);
//		p1.add(button2);
//		p1.add(button3);
//		p1.add(button4);
//		p1.add(button5);
//		p1.add(button6);
//		p1.add(button7);
//		p1.add(button8);
//		p1.add(button9);
//		p1.add(button0);
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		
		p2.add(buttonPlas);
		p2.add(buttonSubtract);
		p2.add(buttonMultiply);
		p2.add(buttonDivide);
		
		// move p1 to center window 
		windowContent.add("Center", p1);
		windowContent.add("East", p2);		
		
		//create frame and indicate basis panel
		JFrame frame = new JFrame("Calc");
		frame.setContentPane(windowContent);
		
		// window size
		frame.pack();
		
		// visible window
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		Calc calc = new Calc();
	}
}
