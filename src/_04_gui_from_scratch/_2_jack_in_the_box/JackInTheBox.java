package _04_gui_from_scratch._2_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JackInTheBox implements ActionListener {
	JButton button = new JButton("SUPRISE!!!");
	JFrame frame = new JFrame("supa mysterious button :O");
	public static void main(String[] args) {
		new JackInTheBox().run();

	}


	private void run() {
		       
		          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		          frame.add(button);
		          frame.pack();
		          frame.setVisible(true);
		          button.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
				
	}
}

