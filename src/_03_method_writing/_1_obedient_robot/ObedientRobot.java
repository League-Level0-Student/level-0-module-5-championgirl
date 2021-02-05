package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot coder = new Robot("batman");

	public static void main(String[] args) {

		coder.penDown();
		coder.setSpeed(5);

		String color = JOptionPane.showInputDialog("What color would you like the robot to draw with?");

		if (color.equals("red")) {
			coder.setPenColor(Color.red);
		} else if (color.equals("purple")) {
			coder.setPenColor(Color.MAGENTA);
		} else if (color.equals("yellow")) {
			coder.setPenColor(Color.yellow);
		} else if (color.equals("pink")) {
			coder.setPenColor(Color.pink);
		} else if (color.equals("blue")) {
			coder.setPenColor(Color.blue);
		} else if (color.equals("orange")) {
			coder.setPenColor(Color.orange);
		} else if (color.equals("green")) {
			coder.setPenColor(Color.green);
		} else if (color.equals("black")) {
			coder.setPenColor(Color.black);
		} else if (color.equals("white")) {
			coder.setPenColor(Color.white);
		}

		else {
			coder.setRandomPenColor();
		}
		
		
		
		String shape = JOptionPane.showInputDialog("What shape would you like the robot to make?");

		 if (shape.equals("triangle")) {
			triangle();
		}

		else if (shape.equals("circle")) {
			circle();
		}

		else if (shape.equals("square")) {
			square();

		}
		else{
			
			JOptionPane.showMessageDialog(null, "Sorry we don't have that shape, please try another shape thank you.");
	
		}
		
	}

	static void square() {

		coder.move(10);
		coder.turn(90);
		for (int i = 0; i < 4; i++) {
			coder.move(80);
			coder.turn(90);
		}
	}

	static void triangle() {

		for (int i = 0; i < 3; i++) {
			coder.move(80);
			coder.turn(125);
		}
	}

	static void circle() {

		coder.turn(360);
		for (int i = 0; i < 360; i++) {
			coder.move(3);
			coder.turn(1);
		}
	}

}
