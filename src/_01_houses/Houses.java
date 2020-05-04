package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	public void run() {
		rob.setSpeed(100);
		rob.setX(50);
		rob.setY(300);
		for(int i = 0; i<10; i++){
	drawHouse(33);
		}
	}
	public void drawHouse (String a) {
		if (a == "small")
		rob.penDown();
		rob.move(a);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(a);
		rob.turn(270);
		rob.move(40);
		rob.turn(270);
	}
	
}
