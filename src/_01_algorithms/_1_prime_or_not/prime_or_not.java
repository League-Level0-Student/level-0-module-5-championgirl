package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	

String number = JOptionPane.showInputDialog("Type a number!");

int prime= Integer.parseInt(number);

for( int i = 2; i < prime; i++ ) {
	   if(prime%i==0) {

		 JOptionPane.showMessageDialog(null, "number is not prime");
	   System.exit(0);
	   }
	  
	   
	  

		   
	  
}
JOptionPane.showMessageDialog(null, "number is prime");
}
}

	
	
	
	
	
	
	

	

