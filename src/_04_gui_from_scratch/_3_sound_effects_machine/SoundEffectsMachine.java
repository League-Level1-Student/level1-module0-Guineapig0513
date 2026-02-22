package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton button1 = new JButton("sound uno");	
	JButton button2 = new JButton("sound dos");
	JButton button3 = new JButton("sound tres");
	
	
	JFrame frame = new JFrame("WOAHHHH A SOUND MACHINE???");
	JPanel panel = new JPanel();
	
	JButton yes = new JButton("ACCEPT");
	JButton no = new JButton("DECLINE");
	JFrame fr4me = new JFrame ("NEW NUMBER");
	JPanel p4nel = new JPanel();
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if (button1 == e.getSource()) {
			fr4me.add(p4nel);
			fr4me.pack();
			p4nel.add(yes);
			p4nel.add(no);
			fr4me.pack();
			fr4me.setVisible(true);
			yes.addActionListener(this);
			no.addActionListener(this);
			JOptionPane.showMessageDialog(null, "NEW CONTACT CALLED 'Spamton G Spamton' SENT A VOICEMAIL, ACCEPT?");
		}
		if(yes == e.getSource()) {
			playSound("spam.wav");
			JOptionPane.showMessageDialog(null, "oh noes! you got scammed :'[.. somehow?");;
		}
		else if(no == e.getSource()) {
			fr4me.setVisible(false);
		}
		else if (button2 == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Oh look the news is on, on that suspiously purple TV! it kinda sounds like TV TIME...");
			playSound("news.wav");
		}
		else {
			playSound("wood.wav");
		}
	}
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}

}
