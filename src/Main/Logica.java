package Main;

import java.util.ArrayList;

import processing.core.PApplet;




public class Logica {

	private PApplet app;
	
	private ArrayList<Homero>homero ;
	
	int contador;
	
	private int[] lista;
	
	public Logica(PApplet app) {
		this.app = app;
		app.fill(255);
		app.noStroke();
		this.homero= new ArrayList<Homero>();
		this.contador=0;
		lista=new int[3];
		
		
	}
	
	public void pintar() {
		for(int i = 0; i < homero.size(); i++) {
			this.homero.get(i).pintarH();
		}
		
		
		for (int i  = 0; i < lista.length; i++) {
			
			
		}
		
		
	}

public void mouse() {
	
	for (int i = 0; i < homero.size(); i++) {
		Thread t = new Thread(homero.get(i));
		t.start();
	}
	
	switch (contador) {
	case 0:
		homero.add(new Homero(app, app.mouseY));
		break;

	case 1:
		homero.add(new Homero(app, app.mouseY));
		break;
	}
	
	contador++;
	
	
}

public void exepcion() throws MiExcepcion{
	if(contador>10) {
		throw new MiExcepcion("ya alcanzo el maximo limite");
	}
}
}
