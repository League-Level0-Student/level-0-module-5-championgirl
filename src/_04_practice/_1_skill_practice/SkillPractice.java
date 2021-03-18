package _04_practice._1_skill_practice;

import java.awt.print.Printable;
import java.util.Random;

import javax.swing.JOptionPane;



public class SkillPractice {
 public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
         skills.skill1();
          skills.skill2();
       skills.skill3();
          skills.skill4();
          skills.skill5();
 }



 // CONVERT DIMES INTO CENTS//


void skill1() {
 
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");

int numberdimes = Integer.parseInt(dimes);

int cents = numberdimes * 10;


JOptionPane.showMessageDialog(null, cents+" cents");

		

 String height = JOptionPane.showInputDialog("How tall are you (in inches)");

int inches = Integer.parseInt(height);

 if (inches<36) {

 JOptionPane.showMessageDialog(null,"Eat your Wheaties.");

 }

 else{
JOptionPane.showMessageDialog(null, "Good job eating your Wheaties!");
 }

}
 


void skill2() {
	

	
for(int j = 1; j<=30; j++) {
		if(j % 3 == 0) {
			System.out.println(j);
		}
		
		
				
}
}


void skill3() {


Random poppy = new Random();
int number = poppy.nextInt(20);
System.out.println(number);

	
Random pop = new Random();
int ran = pop.nextInt(10);
System.out.println(ran);
System.out.println( number-ran);
}
 
void skill4() {// In a pop-up, ask the user for the city they live in 
 
 String City = JOptionPane.showInputDialog("What city do you live in?");
if(City.equalsIgnoreCase("san diego")) {

JOptionPane.showMessageDialog(null,"You live in America's Finest City");

	}
else {
	
JOptionPane.showMessageDialog(null,"Move to San Diego!");

}
 


//Create a variable - cars - and initialize it to the number of cars your family has.
 int cars=2;
 // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 

if(cars==0) {
	
	JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
}

//If there is 1 car, use a pop-up to display the make/model of the car 

if(cars==1) {
	
	JOptionPane.showMessageDialog(null, "You have one car!");
	
	}

//If there is more than 1 car, use a pop-up to display how many wheels the// cars have between them. 


if(cars==2) {
	
	JOptionPane.showMessageDialog(null,"You have "+ cars*4 + " car wheels");
	
	}


 }

		
		
		//WONDERFULL SCHOOL//


void skill5() {
      

		String School = JOptionPane.showInputDialog("Whats the name of your school?");
     	JOptionPane.showMessageDialog(null, School +" is a wonderful school and you're too!");
}


	}

