package Main;

import java.util.ArrayList;

import processing.core.PApplet;


public class Logica {

	private PApplet app;
	
	private ArrayList<Homero>homero ;
	public Logica(PApplet app) {
		this.app = app;
		app.fill(255);
		app.noStroke();
		this.homero= new ArrayList<Homero>();
		
		
	}
	
	public void pintar() {
		for(int i = 0; i < homero.size(); i++) {
			this.homero.get(i).pintar();
		}
	}

public void mouse() {
	
	for (int i = 0; i < homero.size(); i++) {
		Thread t = new Thread(homero.get(i));
		t.start();
	}
	
	homero.add(new Homero(app, app.mouseY));
	
	
}
}
