package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor {
	
	JFrame frame = new JFrame();
	JLabel currentLetterLabel = new JLabel();
	
	char currentLetter;

	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	
	void main() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String charToString = Character.toString(currentLetter);
		currentLetter = generateRandomLetter();
		currentLetterLabel.setText(charToString);
		
		frame.add(currentLetterLabel);
		frame.setVisible(true);
		currentLetterLabel.setVisible(true);
		frame.pack();
	}
	
}
