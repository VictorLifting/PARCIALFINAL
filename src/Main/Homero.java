package Main;

import processing.core.PApplet;
import processing.core.PImage;

public class Homero implements Runnable  {
	private PApplet app;
	int posX;
	int posY;
	boolean moverse;
	int edad;
	int numero;
	PImage homero;
	PImage lisa;
	PImage bart;
	public Homero(PApplet app, int posY) {
		this.app=app;
		this.posX=600;
		this.posY=10;
		this.moverse=true;
		this.edad =(int) Math.floor(Math.random()*10+1);
		this.numero =(int) Math.floor(Math.random()*10+1);
		this.homero=app.loadImage("../images/homero_simpson.png");
		this.lisa=app.loadImage("../images/bart_simpson.png");
		this.bart=app.loadImage("../images/lisa_simpson.png");
		
	}
	
	
	public void run() {
		mover();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void mover () {
		if(moverse) {
			posX-=5;
		} else {
			posX+=5;
		}
		
		if(posX > 790) moverse = true;
		if(posX < 400) moverse = false;
		
	
		
	}
	public void pintar() {
		
		app.image(homero, posX, posY,100,100);
		
	}
	
	
	

}
