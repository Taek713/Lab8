package lab8;

import java.util.Scanner;

import javax.xml.validation.Validator;

public class ClassInfo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] names = { "Amelia", "Aia", "Meekel", "Taehoon", "Totianna", "Brianna" };
		String[] homeTown = { "Detroit", "Seoul", "Busan", "Traverse", "Big Blue", "Southwest" };
		String[] favFood = { "Kalbi", "Kimchi", "Udon", "Pho", "Bulgolgi", "Chili cheese fries" };

		System.out.println("Welcome to our Java class!");

		do {

			for (int i = 0; i < names.length; i++) { // length could be either array cause same size
				System.out.print((i + 1) + ". " + names[i] + " ");
			}

			System.out.println("\nPick a Student(1-6): ");

			int studentNum = scnr.nextInt();

			System.out.print("Student " + studentNum + " is " + names[studentNum - 1]
					+ ". What else would you like to learn more about " + names[studentNum - 1]);

			String studentInfo = Validator.getString(scnr, "? (enter \"hometown\" or \"favorite food\") \n");

			if (studentInfo.equalsIgnoreCase("hometown")) {
				System.out.println(names[studentNum - 1] + "'s hometown is " + homeTown[studentNum - 1] + ".");

			} else if (studentInfo.equalsIgnoreCase("favorite")) {
				System.out.println(names[studentNum - 1] + "'s favorite food is " + favFood[studentNum - 1] + ".");
			} else {
				System.out.println("That data does not exist. Please enter \"hometown\" or \"favorite food\".");

			}
			System.out.println("\nDo you want to continue? (enter yes or no.): ");

		} while (scnr.next().equalsIgnoreCase("yes"));

		System.out.println("Thanks!");

		scnr.close();
	}
}
