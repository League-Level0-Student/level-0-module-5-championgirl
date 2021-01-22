package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

public static void main(String[] args) {

	Robot coder = new Robot();
	
	

	

coder.penDown();
  
coder.setSpeed(5);

coder.move(10); 

coder.turn(90);

for( int i = 0; i <4; i++ ) {
coder.move(80);
coder.turn(90);
}




}

}

