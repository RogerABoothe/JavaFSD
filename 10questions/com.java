import java.util.Scanner;

public class com {
	private static int userScore;
	private static int userSelection;
	private static int correctAns;
	
	public int ansValidate ( int userSelection ){
		Scanner scr = new Scanner(System.in);
		
		while ( userSelection < 1 || userSelection > 4) {
			System.out.println("It seems you can't follow directions! Enter a number 1-4 for your selection");
			userSelection = scr.nextInt();
		}
		
		scr.close();
		return userSelection;
	}
	
	public void ansCheck ( int userSelection, int correctAns ) {
		com ansValid = new com();
		if ( ansValid.ansValidate(userSelection) == correctAns ) {
			userScore = userScore + 1;
			System.out.println("That is correct!");
		}
		else {
			System.out.println("Your answer was not correct");
		}
	}
	
	public static void main(String[] args) {
		com check = new com();
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Welcome to the Java FSD quiz! You will be tested on various questions about Java.");
		System.out.println("Before we being, please note that this is a graded quiz.");
		System.out.println("To pass you need to get seven (7) or more points!");
		System.out.println("Good luck!");
		
		userScore = 0;
		
		// question 1 
		System.out.println("Question 1");
		System.out.println("What are the two types of data types");
		System.out.println("1 - Primitive and non primitive");
		System.out.println("2 - Primitive and Advanced");
		System.out.println("3 - Modern and Future");
		System.out.println("4 - Int and String");
		userSelection = scr.nextInt();
		correctAns = 1;
		check.ansCheck(userSelection, correctAns);
		
		// question 2
		System.out.println("Question 2");
		System.out.println("What is the byte count for an int");
		System.out.println("1 - 2 bytes");
		System.out.println("2 - 4 bytes");
		System.out.println("3 - 8 bytes");
		System.out.println("4 - All this talk of bytes makes me hungry");
		userSelection = scr.nextInt();
		correctAns = 2;
		check.ansCheck(userSelection, correctAns);
		
		// question 3
		System.out.println("Question 3");
		System.out.println("Is Mod (%) and arithmaetic operator?");
		System.out.println("1 - Yes");
		System.out.println("2 - No");
		userSelection = scr.nextInt();
		correctAns = 1;
		check.ansCheck(userSelection, correctAns);
		
		// question 4
		System.out.println("Question 4");
		System.out.println("Which is not a valid operator type");
		System.out.println("1 - Logical");
		System.out.println("2 - Relational");
		System.out.println("3 - Bitwise");
		System.out.println("4 - Math");
		userSelection = scr.nextInt();
		correctAns = 4;
		check.ansCheck(userSelection, correctAns);
		
		// question 5
		System.out.println("Question 5");
		System.out.println("What is not a Java package");
		System.out.println("1 - JDK");
		System.out.println("2 - VM");
		System.out.println("3 - JVM");
		System.out.println("4 - JRE");
		userSelection = scr.nextInt();
		correctAns = 2;
		check.ansCheck(userSelection, correctAns);
		
		// question 6
		System.out.println("Question 6");
		System.out.println("Which of these is not a loop");
		System.out.println("1 - until");
		System.out.println("2 - for");
		System.out.println("3 - while");
		System.out.println("4 - do while");
		userSelection = scr.nextInt();
		correctAns = 1;
		check.ansCheck(userSelection, correctAns);
		
		// question 7
		System.out.println("Question 7");
		System.out.println("Which is not an access specificer");
		System.out.println("1 - Public");
		System.out.println("2 - Private");
		System.out.println("3 - Secluded");
		System.out.println("4 - Default");
		userSelection = scr.nextInt();
		correctAns = 3;
		check.ansCheck(userSelection, correctAns);
		
		// question 8
		System.out.println("Question 8");
		System.out.println("Which of these is a reason to refactor code?");
		System.out.println("1 - Change the functionality");
		System.out.println("2 - Complicate the code");
		System.out.println("3 - Increase the number of lines");
		System.out.println("4 - Clean up code to reduce technical debt");
		userSelection = scr.nextInt();
		correctAns = 4;
		check.ansCheck(userSelection, correctAns);
		
		// question 9
		System.out.println("Question 9");
		System.out.println("Which of these is not a Java data type");
		System.out.println("1 - short");
		System.out.println("2 - long");
		System.out.println("3 - double");
		System.out.println("4 - extra long");
		userSelection = scr.nextInt();
		correctAns = 4;
		check.ansCheck(userSelection, correctAns);
		
		// question 10
		System.out.println("Question 10");
		System.out.println("What is an advantage of Java");
		System.out.println("1 - It is mobile/works on any OS with JRE installed");
		System.out.println("2 - No advantages over other languages");
		System.out.println("3 - Works in Windows OS only");
		System.out.println("4 - It can run on any *nix");
		userSelection = scr.nextInt();
		correctAns = 1;
		check.ansCheck(userSelection, correctAns);
		
		scr.close();
		
		System.out.println("The test is now complete!");
		System.out.println("Your score is: " + userScore);
		
		if ( userScore >= 7) {
			System.out.println("You passed!");
			System.out.println("Great job!");
		}
		else if ( userScore == 6) {
			System.out.println("You didn't pass but you were close");
		}
		else if ( userScore < 6 ) {
			System.out.println("You failed the quiz. Please review the module again");
		}
		else {
			System.out.println("This block is unreachable!!!");
		}

	}

}