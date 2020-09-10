package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	JButton joke = new JButton();
	JButton punchline = new JButton();
	
	void main() {
		
		makeButtons();
	}
	
	void makeButtons() {
		
		JFrame frame = new JFrame(); 
		JPanel panel = new JPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		joke.setLabel("Joke!");
		punchline.setLabel("Punchline!");
		
		joke.addActionListener(this);
		punchline.addActionListener(this);

		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		frame.setVisible(true);
		panel.setVisible(true);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == joke) {
			
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
		}
		
		else if(e.getSource() == punchline) {
			
			JOptionPane.showMessageDialog(null, "To get to the other side! Hahahaha!");
		}
	}

}
