package FallingBall_Main;

import java.util.Random;

public class Plataforma {
	private int centerY, centerX;
	private int speedY = -5;
	boolean vez_1 = true;
	Random r = new Random();
	Random w = new Random();

	public void update(int Y) {
		if (vez_1) {
			escolher();
			centerY = Y;
			vez_1 = false;
		}
		centerY = centerY + speedY;
		if (centerY < 0) {
			escolher();
			centerY = 800;
		}
	}

	private void escolher(){
		int rand = r.nextInt(7);
		switch (rand) {
		case 0:
			centerX = 50;
			break;
		case 1:
			centerX = 150;
			break;
		case 2:
			centerX = 200;
			break;
		case 3:
			centerX = 250;
			break;
		case 4:
			centerX = 300;
			break;
		case 5:
			centerX = 350;
			break;
		case 6:
			int rand2 = w.nextInt(3);
			switch(rand2){
				case 0:
					centerX=-100;
					break;
				case 1:
					centerX=430;
					break;
				case 2:
					centerX = 75;
					break;
			}
			break;
		}
	}
	
	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	public boolean isVez_1() {
		return vez_1;
	}

	public void setVez_1(boolean vez_1) {
		this.vez_1 = vez_1;
	}
	
}
