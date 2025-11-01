package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int bigX = 150;
    int bigY = 300;
    int BPipeX = 790;
    int TPipeX = 790;
    int pipeGap = 100;
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
    	 back = loadImage("flappyBackground.jpg");
    	 back.resize(WIDTH, HEIGHT);
         pipeBottom = loadImage("bottomPipe.png");
         pipeTop = loadImage("topPipe.png");
         borb = loadImage("big.png");
         borb.resize(90,45);
         teleportPipes();
    }

    private void teleportPipes() {
    	BPipeX = 790;
        TPipeX = 790;
        int TPipeY = (int) random(100, 400);
	}

	public void draw() {
    	background(back);
        image (pipeBottom,BPipeX,375);
        image (pipeTop,TPipeX,-130);
        image (borb, bigX, bigY);
        birdYVelocity += gravity;
        bigY += birdYVelocity;
        BPipeX -= 2;
        TPipeX -=2;
        if (BPipeX < -100) {
        	teleportPipes();
        }
    }
    public void mouseClicked() {
    	birdYVelocity = -5; 
    }
    

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
