package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	public void showButton() {
		System.out.println("Button clicked");
		frame.setVisible(true);
	    JButton button = new JButton("very legit fortune trust!111!!");
	    frame.add(button);
	    frame.pack();
	    button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "woohoo!! :D");
		int rand = new Random().nextInt(5);
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "You will get pregnant.");
		}
		else if(rand == 1) {
			JOptionPane.showMessageDialog(null, "bro will be rich asf");
		}
		else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "you will lose all your money gambling");
		}
		else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "You fail art school and MIGHT like german sheperds... im not elaborting");
		}
		else {
			JOptionPane.showMessageDialog(null, "you have 0 survival instincts and run into the woods and become prey for a bear");
		}
	}

}
