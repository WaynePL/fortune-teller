import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to your future.");
		System.out.println("I already know the answer to these questions.");
		System.out.println("But as a formality, please be honest.");
		System.out.println();

		// First and last name
		System.out.println("Please tell me your first name.");
		String firstName = input.nextLine();
		// quit check
		if (firstName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}
		System.out.println("Ah ha, I knew it. Go ahead and enter your last name.");
		String lastName = input.nextLine();
		// quit check
		if (lastName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}

		System.out.println("Good, the magic crystal ball is reacting to your answers.");
		System.out.println();

		// Age
		System.out.println("Now to continue this ritual, I will need your age.");
		String age = input.nextLine();
		int ageNum = 0;
		boolean ageGiven = false;
		// Catching if they don't put in a number
		while (!ageGiven) {
			if (age.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter…");
				System.exit(0);
			}
			try {
				ageNum = Integer.parseInt(age);
				ageGiven = true;
			} catch (Exception e) {
				ageGiven = false;
				System.out.println("You didn't enter a number, please enter a number for your age.");
				age = input.nextLine();
			}
		}

		// Birth Month
		System.out.println("Please enter your birth month as a number from 1 - 12");
		String birth = input.nextLine();
		boolean birthMonthGiven = false;
		int birthMonth = 0;
		// Catching if they don't put in a number
		while (!birthMonthGiven) {
			if (birth.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter…");
				System.exit(0);
			}
			try {
				birthMonth = Integer.parseInt(birth);
				birthMonthGiven = true;
			} catch (Exception e) {
				birthMonthGiven = false;
				System.out.println("You didn't enter a number, please enter a number for your birth month.");
				birth = input.nextLine();
			}
		}

		System.out.println("Very interesting! Now we are almost to the end of the questions");
		System.out.println("But we will need just a few more pieces of information");
		System.out.println();

		// Favorite color
		System.out.println("Now I will need your favorite ROYGBIV color.");
		String color = input.nextLine();
		boolean colorGiven = false;
		while (!colorGiven) {
			if (color.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter…");
				System.exit(0);
			} else if (color.equalsIgnoreCase("help")) {
				System.out.println(
						"ROYGBIV is an acronym for the colors:\nRed, Orange, Yellow, Green, Blue, Indigo, Violet.");
				color = input.nextLine();
			} else {
				// makes sure we get a ROYGBIV color or prompts the user to use help
				switch (color.toLowerCase()) {
				case "red":
				case "orange":
				case "yellow":
				case "green":
				case "blue":
				case "indigo":
				case "violet":
					colorGiven = true;
					break;
				default:
					System.out.println("That isn't a ROYGBIV color, please type \"help\" if you need it.");
					color = input.nextLine();
					break;
				}
			}
		}

		// Number of siblings
		System.out.println("And finally, I will need the number of siblings that you have.");
		String sibling = input.nextLine();
		boolean siblingNumberGiven = false;
		int siblingNumber = 0;
		// Catching if they don't put in a number
		while (!siblingNumberGiven) {
			if (sibling.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter…");
				System.exit(0);
			}
			try {
				siblingNumber = Integer.parseInt(sibling);
				siblingNumberGiven = true;
			} catch (Exception e) {
				siblingNumberGiven = false;
				System.out.println("You didn't enter a number, please enter a number for how many siblings you have.");
				sibling = input.nextLine();
			}
		}

		input.close();

		System.out.println("That is all that I needed. Your answers were:");
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Age: " + ageNum);
		System.out.println("Birth month: " + birthMonth);
		System.out.println("Favorite color: " + color);
		System.out.println("Number of siblings: " + siblingNumber);

		System.out.println();

		// assignments

		// Retirement age
		String retirement;
		if (ageNum % 2 == 0) {
			retirement = "20 years";
		} else {
			retirement = "25 years";
		}

		// Vacation Home
		String vacationHome;
		if (siblingNumber < 0) {
			vacationHome = "Guantanamo Bay, Cuba";
		} else if (siblingNumber == 0) {
			vacationHome = "Paris, France";
		} else if (siblingNumber == 1) {
			vacationHome = "Rome, Italy";
		} else if (siblingNumber == 2) {
			vacationHome = "San Francisco, California";
		} else if (siblingNumber == 3) {
			vacationHome = "Portland, Oregon";
		} else {
			vacationHome = "Miami, Florida";
		}

		// Mode of transportation
		String transportation;
		switch (color.toLowerCase()) {
		case "red":
			transportation = "Uber";
			break;
		case "orange":
			transportation = "Lyft";
			break;
		case "yellow":
			transportation = "Lime Scooters";
			break;
		case "green":
			transportation = "a Bicycle";
			break;
		case "blue":
			transportation = "jet plane";
			break;
		case "indigo":
			transportation = "an electric car";
			break;
		case "violet":
			transportation = "a jetpack";
			break;
		default:
			transportation = "their own 2 feet";
		}

		// Bank account
		String savings;

		if (birthMonth < 0) {
			savings = "$0.00";
		} else if (birthMonth < 5) {
			savings = "$123,456,789.42";
		} else if (birthMonth < 9) {
			savings = "$42,424,242.42";
		} else if (birthMonth < 13) {
			savings = "$3,141,592.65";
		} else {
			savings = "$0.00";
		}

		System.out.println(String.format(
				"%s %s will retire in %s with %s in the bank,\n" + "a vacation home in %s, and travel by %s.",
				firstName, lastName, retirement, savings, vacationHome, transportation));
	}

}
