package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton button1 = new JButton("sound uno");	
	JButton button2 = new JButton("sound dos");
	JButton button3 = new JButton("sound tres");
	
	
	JFrame frame = new JFrame("WOAHHHH A SOUND MACHINE???");
	JPanel panel = new JPanel();
	
	public void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		frame.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
