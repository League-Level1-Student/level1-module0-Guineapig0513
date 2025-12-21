package _03_gui_with_help._4_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the recipe java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the recipe package(body_part_quiz), and change the names below.

	String firstImage = "src/_03_gui_with_help/_4_body_part_quiz/arnold.jpeg";
	String secondImage = "src/_03_gui_with_help/_4_body_part_quiz/leonardo.jpeg";
	String thirdImage = "src/_03_gui_with_help/_4_body_part_quiz/morgan.jpeg";
	String fourthImage = "src/_03_gui_with_help/_4_body_part_quiz/jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.setSize(225, 225);

		showNextImage();

	}

	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		int score = 0;
		// 2. Set the size of the window in the initializeGui() method 
		
		// 4. Ask the user who this person is and store their answer
		String guess = JOptionPane.showInputDialog("who is this?");

		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1
		if(guess.equalsIgnoreCase("Arnold")) {
			JOptionPane.showMessageDialog(null, "good job ^^!");
			score +=1;
		}
		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is
		else {
			score -= 1;
			JOptionPane.showMessageDialog(null, "you got it wrong :[");
		}
		JOptionPane.showMessageDialog(null, "your new score is "+score+"!");
		// 7. Use the showNextImage() method below to get the next image
		showNextImage();

		// 8. .... repeat 4-7 for all your images.....
		String guess2 = JOptionPane.showInputDialog("Now, who is this?");
		// 9. Show them their current score
		if(guess2.equalsIgnoreCase("leonardo")) {
			score +=1;
			JOptionPane.showMessageDialog(null, "good, great ^w^!");
		}
		else {
			score -=1;
			JOptionPane.showMessageDialog(null, "wrong :[ (twin idk who this guy is also TwT)");
		}
		JOptionPane.showMessageDialog(null, "your new score is "+score+"!");
		showNextImage();
		String guess3 = JOptionPane.showInputDialog("whooo is this?");
		if(guess3.equalsIgnoreCase("morgan")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "amazing! seriously!! :^P");
		}
		else {
			score -= 1;
			JOptionPane.showMessageDialog(null, "who even is this, anyways boohoo D:");
		}
		showNextImage();
		String guess4 = JOptionPane.showInputDialog("finally, who is this?");
		if(guess4.equalsIgnoreCase("jack")) {
			score +=1;
			JOptionPane.showMessageDialog(null, "you finished strong and correctly good job!!! C:");
		}
		else {
			score -=1;
			JOptionPane.showMessageDialog(null, "WHO IS THIS AUHFWUIE anyways u got it wrong :'/");
		}
		JOptionPane.showMessageDialog(null, "Loading results..");
		JOptionPane.showMessageDialog(null, "Loading results...");
		JOptionPane.showMessageDialog(null, "Loading results..");
		JOptionPane.showMessageDialog(null, "Complete!!!");
		if(score ==4) {
		JOptionPane.showMessageDialog(null, "You got a 100!! congrats you really know people! (or are chronically online) NO INBETWEENS");
		}
		else if(score == 3) {
			JOptionPane.showMessageDialog(null, "you got a 75%! you got one wrong but everyone makes mistakes :] (plus idk who these people are)");
		}
		else if(score == -1) {
			JOptionPane.showMessageDialog(null, "bro. getting smt to -25% - -100% really?");
		}
		else if(score == -2) {
			JOptionPane.showMessageDialog(null, "bro. getting smt to -25% - -100% really?");
		}
		else if(score == -3) {
			JOptionPane.showMessageDialog(null, "bro. getting smt to -25% - -100% really?");
		}
		else if(score == -4) {
			JOptionPane.showMessageDialog(null, "bro. getting smt to -25% - -100% really?");
		}
		else {
			JOptionPane.showMessageDialog(null, "RETAKE THE QUIZ YOU GOT A 0%-50% FAILURE /jk jk");
		}
	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();

		return new JLabel("No more images");
	}
}