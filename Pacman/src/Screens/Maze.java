package Screens;
import processing.core.PApplet;

public class Maze extends PApplet{
	int [][] matrix; 
	int col,row;
	float posX,posY;	
	int matX, matY;
	private PApplet app;
	
	public Maze (PApplet app){
		this.app = app;

	}

	public void setup() {
		col  = 30;
		row  = 35;
		posX = 100;
		posY = 100;
		matX = 1;
		matY = 1;
	    matrix  = new int [][]{
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,0,0,0,0,1,1,0,0,0,0,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,0,0,0,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,0,0,0,0,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,0,1,1,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,1},
			{1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1},
			{1,1,1,0,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,0,1,1,1},
			{1,1,1,0,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,1,1,1},
			{1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1},
			{1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1},
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			
		};
	}

	public void drawMaze(){
		for (int i = 0; i < this.col; i++) {
			for (int j = 0; j < this.row; j++) {
				System.out.println("hey");
				rect((i*20),(j*20),20,20);
				if(this.matrix[j][i] == 0) {
					app.fill(255);
				}else if (this.matrix[j][i] == 1) {
					app.fill(0);
				}else {
					app.fill(255,0,0);
				}
				rect((i*20),(j*20),20,20);
			}
		}
		
		app.ellipse(posX,posY,25,25);
	}

	
	/*public void keyPressed() {
		switch (keyCode) {
		case RIGHT:
			if(matrix[matY][matX+1]!=1) {
				posX += 20;
				matX++;
			}
			break;
		case LEFT:
			if(matrix[matY][matX-1]!=1) {
				posX -= 20;
				matX--;
			}
			break;
		case UP:
			if(matrix[matY-1][matX]!=1) {
				posY -= 20;
				matY--;
			}
			break;
		case DOWN:
			if(matrix[matY+1][matX]!=1) {
				posY += 20;
				matY++;
			}
			break;
		default:
			break;
		}
	}*/
}