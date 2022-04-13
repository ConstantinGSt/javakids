package javakids.mycalculator;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calc {
	//обьявляю все компоненты
	JPanel windowContent;
	JTextField displayField;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	JPanel p1;
	
	// BorderLayout & GridLayout добавляем все элементы на фрейм
	// в конструкторе
	Calc() {
		windowContent = new JPanel();
		
		// схема для панели
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		// create and visible Field
		displayField = new JTextField(30);
		windowContent.add("Naorth", displayField);
		
		// create button use construct
		// JButton - input text Button as option
		
		button0 = new JButton("0");
		button1=new JButton("1");
		button2=new JButton("2");
		button3=new JButton("3");
		button4=new JButton("4");
		button5=new JButton("5");
		button6=new JButton("6");
		button7=new JButton("7");
		button8=new JButton("8");
		button9=new JButton("9");
		buttonPoint = new JButton(".");
		buttonEqual=new JButton("=");
		
	}
}
