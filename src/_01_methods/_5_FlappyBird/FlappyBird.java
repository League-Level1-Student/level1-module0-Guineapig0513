package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int bigX = 150;
    int bigY = 300;
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
         borb.resize(75,50);
    }

    public void draw() {
    	background(back);
        image (pipeBottom,250,375);
        image (pipeTop,250,-130);
        image (borb, bigX, bigY);
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
