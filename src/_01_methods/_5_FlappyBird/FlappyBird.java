package _01_methods._5_FlappyBird;

import javax.swing.JOptionPane;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int bigX = 150;
    int bigY = 300;
    int BPipeX = 790;
    int TPipeX = 790;
    int BPipeH = 0;
    int BPipeY = 0;
    float score = -1;
    int pipeGap = 150;
    int TPipeHeight = (int) random(100, 400);
    float birdYVelocity = -10;
    float gravity = (float) 0.25;
    PImage back;
    PImage pipeBottom;
    PImage pipeTop;
    PImage borb;
    
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    

    public void setup() {
    	 back = loadImage("veggieground.jpg");
    	 back.resize(WIDTH, HEIGHT);
         pipeBottom = loadImage("bottomPipe.png");
         pipeTop = loadImage("topPipe.png");
         borb = loadImage("big.png");
         borb.resize(70,50);
         teleportPipes();
    }

    private void teleportPipes() {
    	BPipeX = 790;
        TPipeX = 790;
        TPipeHeight = (int) random(100, 400);
        pipeTop.resize(50, TPipeHeight);
        BPipeY = TPipeHeight + pipeGap;
        BPipeH = 600 - BPipeY;
        pipeBottom.resize(50, BPipeH);
        score += 1;
        
    }


	public void draw() {
    	background(back);
        image (pipeBottom,BPipeX,BPipeY);
        image (pipeTop,TPipeX, 0);
        image (borb, bigX, bigY);
        birdYVelocity += gravity;
        bigY += birdYVelocity;
        BPipeX -= 2;
        TPipeX -=2;
        text("Score: "+score, 10, 10);
        if (BPipeX < -100) {
        	teleportPipes();
        }
        if(intersectsPipes() == true) {
        	JOptionPane.showMessageDialog(null, "You died :[ YOU IDIOT SANDWICH /jk jk jk");
        	System.exit(0);
        }
    }
    public void mouseClicked() {
    	birdYVelocity = -5; 
    }
    boolean intersectsPipes() { 
        if (bigY < TPipeHeight && bigX > TPipeX && bigX < (TPipeX+50)){
           return true; }
       else if (bigY>BPipeY && bigX > TPipeX && bigX < (TPipeX+50)) {
           return true; }
       else { return false; }
    }
    

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
