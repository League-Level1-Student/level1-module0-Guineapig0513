package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String uh = "https://www.giantfreakinrobot.com/wp-content/uploads/2022/08/rick-astley-900x506.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component e;
		// 3. use the "createImage()" method below to initialize your Component
		e = createImage(uh);
		// 4. add the image to the quiz window
		quizWindow.add(e);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String wow = JOptionPane.showInputDialog("who is this guy? If you dont know i will assassinate you ;]");
		// 7. print "CORRECT" if the user gave the right answer
		if(wow.equalsIgnoreCase("rick ashley")) {
			System.out.println("CORRECT YAYAYAY");
		}
		else {
			System.out.println("INCORRECT boo hoo :{");
		}
		// 8. print "INCORRECT" if the answer is wrong
		
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(e);
		// 10. find another image and create it (might take more than one line
		// of code)
		String hah = "https://cdn-useast1.kapwing.com/static/templates/get-stick-bugged-lol-meme-template-full-4aeb0e95.webp";
		Component erm;
		erm = createImage(hah);
		// 11. add the second image to the quiz window
		quizWindow.add(erm);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String stick = JOptionPane.showInputDialog("who is this tell me now.");
		// 14+ check answer, say if correct or incorrect, etc.
		if(stick.equalsIgnoreCase("Stickbug")) {
			System.out.println("lmao get stickbugged but CORRECT!1!!11!");
		}
		else {
			System.out.println("how did you get that wrong your INCORRECT... get stickbugged lol");
		}
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
