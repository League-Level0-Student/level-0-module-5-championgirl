package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot coder = new Robot("mini");
	
public static void main(String[] args) {

	coder.penDown();  
	coder.setSpeed(5);

	circle();
}



static void square () {

coder.move(10); 
coder.turn(90);
for( int i = 0; i <4; i++ ) {
coder.move(80);
coder.turn(90);
}
}


static void triangle () { 
	
for( int i = 0; i <3; i++ ) {
coder.move(80);
coder.turn(125);
}
}


static void circle () {

coder.turn(360);
for(int i = 0; i<360; i++) {
coder.move(3);
coder.turn(1);
 }
 }

String shape = JOptionPane.showInputDialog("What shape do you want");

(if shape = "square"){
	square();
}



}