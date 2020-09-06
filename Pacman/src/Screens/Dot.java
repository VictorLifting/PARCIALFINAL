package Screens;

import processing.core.PApplet;

public class Dot extends PApplet {

	PApplet app;


	public Dot (PApplet app) {	
		this.app = app;	
	}
	
	public void crear(int posX, int posY) {
		app.fill(255,0,0);
		app.ellipseMode(CORNER);
		app.ellipse(posX, posY, 20, 20);	

	}

}
