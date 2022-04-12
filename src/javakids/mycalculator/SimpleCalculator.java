package javakids.mycalculator;

import javax.swing.*;
import java.awt.FlowLayout;

public class SimpleCalculator {
	public static void main(String[] args) {
		
		//создал панель
		JPanel windowContent = new JPanel();
		
		//менеджер отображения для этой панели
		FlowLayout fl = new FlowLayout();
		windowContent.setLayout(fl);
		
		// компаненты в памяти
		JLabel label1 = new JLabel("Number 1 :");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Sum:");
		JTextField field3 = new JTextField(10);
		JButton go = new JButton("Add");
		
		//добавляем компаненты на панель
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(field3);
		windowContent.add(go);
		
		// фрейм + сделать его видимым
		JFrame frame = new JFrame("First Calc");
		frame.setContentPane(windowContent);
		
		// задаем размер и делаем фрем видимым
		frame.setSize(400, 100);
		frame.setVisible(true);
		
				
		
	}

}
