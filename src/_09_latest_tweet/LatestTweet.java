package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField searchBar = new JTextField(8);
	JButton search = new JButton();
	
	void setup() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.add(searchBar);
		panel.add(search);
		
		frame.setVisible(true);
		panel.setVisible(true);
		search.setVisible(true);
		searchBar.setVisible(true);
		
		search.setText("Search Twitter!");
		search.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String searchBarContents = searchBar.getText();
		JOptionPane.showMessageDialog(null, "Twitter jars not working, would be searching Twitter for: " + searchBarContents);
	}
}
