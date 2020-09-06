package Screens;

import processing.core.PApplet;


public class Pacman extends PApplet{

	int x=286;
	int y=472;
	int direction;
	PApplet app;



	public Pacman (PApplet app) {
		this.app = app;


	}
	


	public void drawPacman(int PosX,int PosY) {


		app.fill(255,240,0);
		app.ellipseMode(CORNER);
		app.ellipse(PosX, PosY, 25, 25);


	}
	
	

}
