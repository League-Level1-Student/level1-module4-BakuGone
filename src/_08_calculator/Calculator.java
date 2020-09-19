package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	int inputOne = 6;
	int inputTwo = 3;
	int answer;
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField firstInput = new JTextField();
	JTextField secondInput = new JTextField();
	JLabel answerLabel = new JLabel();
	
	void setup(){
		
		frame.add(panel);
		panel.add(firstInput);
		panel.add(secondInput);
		
		firstInput.addActionListener(this);
		secondInput.addActionListener(this);
		
		
		
		frame.setVisible(true);
		panel.setVisible(true);
		firstInput.setVisible(true);
		secondInput.setVisible(true);
	} 
	
	void add() {
		
		answer = inputOne + inputTwo;
		System.out.println(answer);
	}
	
	void subtract() {
		
		answer = inputOne - inputTwo;
		System.out.println(answer);
	}
	
	void multiply() {
		
		answer = inputOne * inputTwo;
		System.out.println(answer);
	}
	
	void divide() {
		
		answer = inputOne / inputTwo;
		System.out.println(answer);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
