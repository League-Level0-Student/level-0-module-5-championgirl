package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet

	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable

		String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");

		if (pet.contentEquals("")) {

			JOptionPane.showMessageDialog(null, "You did not pick an animal please try again.");

		}

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
while (happinessLevel < 20) {
	

		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy", "Pet", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cuddle", "food", "walk" }, null);
		if (task == 0) {
			Cuddle(pet);
			food(pet);
			walk(pet);
		}
}
		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	static void food(String pet) {

		happinessLevel += 5;

		PetFeelings(pet);

	}

	static void Cuddle(String pet) {

		happinessLevel += 3;

		PetFeelings(pet);

	}

	static void walk(String pet) {

		happinessLevel += 7;

		PetFeelings(pet);

	}

	static void PetFeelings(String pet) {

		if (pet.contentEquals("cat")) {

			JOptionPane.showMessageDialog(null, "I feel Purrfect! 😸");

		}

		if (pet.contentEquals("dog")) {

			JOptionPane.showMessageDialog(null, "I feel Pawsome 🐕 ! ");

		}

		if (pet.contentEquals("fish")) {

			JOptionPane.showMessageDialog(null, " I feel fintastic! ");

		}

		if (pet.contentEquals("lion")) {

			JOptionPane.showMessageDialog(null, " ROAR I FEEL GREAT! ");

		}

		if (pet.contentEquals("snake")) {

			JOptionPane.showMessageDialog(null, " I feel Ssssimply the best");

		}

		if (pet.contentEquals("red panda")) {

			JOptionPane.showMessageDialog
			(null,"I'M ENDANGERED YOU ARE NOT ALLOWED TO KEEP ME AS A PET!!!!! Other than that I feel GREAT! :D");

		}
		if (pet.contentEquals("bunny")) {

			JOptionPane.showMessageDialog(null,"You make me HOPPY!🐇  :) ");

		}
		if (pet.contentEquals("dragon")) {

			JOptionPane.showMessageDialog(null," I feel dragontastic! ");

		}
		if (pet.contentEquals("lizard")) {

			JOptionPane.showMessageDialog(null," I feel awesome! ");

		}
		if (pet.contentEquals("panda")) {

			JOptionPane.showMessageDialog(null,	"  I feel awesome ");

		}

	}

}