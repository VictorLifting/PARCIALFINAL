package View;

import Main.Logica;
import processing.core.PApplet;


public class Main extends PApplet{
	private Logica log;

	public static void main(String[] args) {
	PApplet.main(Main.class.getName());

	}
	
	public void settings(){
		size(800,600);
	}
	
	public void setup(){
		background(0);
		this.log = new Logica(this);
		
	}
	
	public void draw() {
	this.log.pintar();
		
	}
	
	public void mouseClicked() {
		this.log.mouse();
		
	}
	

}
