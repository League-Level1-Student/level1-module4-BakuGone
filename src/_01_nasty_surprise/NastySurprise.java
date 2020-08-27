package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	
	public void run() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton trick = new JButton();
		JButton treat = new JButton();
	
		frame.setVisible(true);
		trick.setVisible(true);
		treat.setVisible(true);
		
		frame.add(panel);
		panel.add(trick);
		panel.add(treat);
		
		trick.setText("Trick");
		treat.setText("Treat");
	
		trick.addActionListener(this);
		treat.addActionListener(this);
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

	public void trickAction(ActionEvent e) {
		
		showPictureFromTheInternet("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.livescience.com%2Fcoronavirus-first-case-human-to-dog-transmission.html&psig=AOvVaw3GPcAvc9XI_dcPGGKXOIBj&ust=1598580624372000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLDC44SnuusCFQAAAAAdAAAAABAD");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		showPictureFromTheInternet("https://www.google.com/url?sa=i&url=https%3A%2F%2Fknowyourmeme.com%2Fphotos%2F97668-why-would-you-do-that&psig=AOvVaw0-gRvlHYltIen9kSD5xA8q&ust=1598580809534000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCMjd8N2nuusCFQAAAAAdAAAAABAJ");
		
	}
}
