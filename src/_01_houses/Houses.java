package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	public void run() {
		rob.setSpeed(100);
		rob.setX(50);
		rob.setY(300);
		int r = 250;
		int g = 0;
		int b = 0;
		String a = "small";
		Random rand = new Random();
		
		for (int i = 0; i<10; i++) {
		int randomNumber = rand.nextInt(3);
			if (randomNumber == 0) {
				a = "small";
			}
			if (randomNumber == 1) {
				a = "medium";
			}
			if (randomNumber == 2) {
				a = "large";
			}
		
			if (a.equals("large")) {
				drawPointyRoof(a,r,g,b);
			}
			else {
				drawFlatRoof(a,r,g,b);
			}
		}
	}
	
	public void drawFlatRoof (String a, int r, int g, int b) {
		rob.setPenColor(r, g, b);
		if (a.equals("small")) {
			rob.penDown();
			rob.move(60);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(60);
			rob.turn(270);
			rob.setPenColor(30,100,30);
			rob.move(40);
			rob.turn(270);
		}
		else if (a.equals("medium")) {
			rob.penDown();
			rob.move(120);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(120);
			rob.turn(270);
			rob.setPenColor(30,100,30);
			rob.move(40);
			rob.turn(270);
		}	
		else {
			rob.penDown();
			rob.move(250);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(250);
			rob.turn(270);
			rob.setPenColor(30,100,30);
			rob.move(40);
			rob.turn(270);
		}
	}
	public void drawPointyRoof(String a, int r, int g, int b) {
		rob.setPenColor(r, g, b);
		if (a.equals("small")) {
			rob.penDown();
			rob.move(60);
			rob.turn(45);
			rob.move(20);
			rob.turn(90);
			rob.move(20);
			rob.turn(45);
			rob.move(60);
			rob.turn(270);
			rob.setPenColor(30,100,30);
			rob.move(40);
			rob.turn(270);
		}
		else if (a.equals("medium")) {
			rob.penDown();
			rob.move(120);
			rob.turn(45);
			rob.move(20);
			rob.turn(90);
			rob.move(20);
			rob.turn(45);
			rob.move(120);
			rob.turn(270);
			rob.setPenColor(30,100,30);
			rob.move(40);
			rob.turn(270);
		}	
		else {
			rob.penDown();
			rob.move(250);
			rob.turn(45);
			rob.move(20);
			rob.turn(90);
			rob.move(20);
			rob.turn(45);
			rob.move(250);
			rob.turn(270);
			rob.setPenColor(30,100,30);
			rob.move(40);
			rob.turn(270);
		}
	}
}
