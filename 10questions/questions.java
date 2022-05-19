import java.util.*;

public class questions {
	private static int userScore;
	private static int userAns;
	private static int correctAns;
	private static int invAnsCount;
	static Scanner scr = new Scanner(System.in);
	
	public int ansValidate ( int userAns ){
		while ( userAns < 1 || userAns > 4 ) {
			System.out.println("It seems you can't follow directions! Enter a number 1-4 for your selection!");
			invAnsCount = invAnsCount + 1  ;
			userAns = ansInt();
		}
		
		return userAns;
	}
	
	public static int ansInt() {
		while ( true ) {
			try {
				return scr.nextInt();
			}
			catch ( InputMismatchException e ) {
				scr.next();
				invAnsCount = invAnsCount + 1  ;
				System.out.println("You have not entered a number 1-4, I think that was a string!");
			}
		}
	}
	
	public void ansCheck ( int userAns, int correctAns ) {
		questions valid = new questions();
		if ( valid.ansValidate(userAns) == correctAns ) {
			userScore = userScore + 1;
			System.out.println("That is correct!");
		}
		else {
			System.out.println("Your answer was not correct");
		}
	}
	
	public void userResult ( int userScore ) {
		System.out.println("The test is now complete!");
		System.out.println("Your score is: " + userScore);
		System.out.println("You entered " + invAnsCount + " invaild answers causing us to ask again!");
		
		if ( userScore >= 7 && invAnsCount < 5) {
			System.out.println("You passed! \nGreat Job!");
		}
		else if ( invAnsCount > 5) {
			System.out.println("You would have passed if you could follow directions!");
		}
		else if ( userScore == 6 ) {
			System.out.println("You didn't pass but you were close.");
		}
		else if ( userScore < 6 ) {
			System.out.println("You failed the quiz. Please review the module again.");
		}
		else {
			System.out.println("This block is unreachable!!!");
		}
		
	}
	
	public static void main( String[] args ) {
		questions check = new questions();
		questions result = new questions();
		
		System.out.println("Welcome to the Java FSD quiz! You will be tested on various questions about Java.");
		System.out.println("Before we being, please note that this is a graded quiz.");
		System.out.println("To pass you need to get seven (7) or more points! Also you can't give more than 5 invalid answer formats!");
		System.out.println("Good luck!");
		
		userScore = 0;
		invAnsCount = 0;
		
		// question 1 
		System.out.println("Question 1");
		System.out.println("What are the two types of data types?");
		System.out.println("1 - Primitive and non primitive");
		System.out.println("2 - Primitive and Advanced");
		System.out.println("3 - Modern and Future");
		System.out.println("4 - Int and String");
		userAns = ansInt();
		correctAns = 1;
		check.ansCheck(userAns, correctAns);
		
		// question 2
		System.out.println("Question 2");
		System.out.println("What is the byte count for an int?");
		System.out.println("1 - 2 bytes");
		System.out.println("2 - 4 bytes");
		System.out.println("3 - 8 bytes");
		System.out.println("4 - All this talk of bytes makes me hungry");
		userAns = ansInt();
		correctAns = 2;
		check.ansCheck(userAns, correctAns);
		
		// question 3
		System.out.println("Question 3");
		System.out.println("Is Mod (%) and arithmaetic operator?");
		System.out.println("1 - Yes");
		System.out.println("2 - No");
		userAns = ansInt();
		correctAns = 1;
		check.ansCheck(userAns, correctAns);
		
		// question 4
		System.out.println("Question 4");
		System.out.println("Which is not a valid operator type?");
		System.out.println("1 - Logical");
		System.out.println("2 - Relational");
		System.out.println("3 - Bitwise");
		System.out.println("4 - Math");
		userAns = ansInt();
		correctAns = 4;
		check.ansCheck(userAns, correctAns);
		
		// question 5
		System.out.println("Question 5");
		System.out.println("What is not a Java package?");
		System.out.println("1 - JDK");
		System.out.println("2 - VM");
		System.out.println("3 - JVM");
		System.out.println("4 - JRE");
		userAns = ansInt();
		correctAns = 2;
		check.ansCheck(userAns, correctAns);
		
		// question 6
		System.out.println("Question 6");
		System.out.println("Which of these is not a loop?");
		System.out.println("1 - until");
		System.out.println("2 - for");
		System.out.println("3 - while");
		System.out.println("4 - do while");
		userAns = ansInt();
		correctAns = 1;
		check.ansCheck(userAns, correctAns);
		
		// question 7
		System.out.println("Question 7");
		System.out.println("Which is not an access specificer?");
		System.out.println("1 - Public");
		System.out.println("2 - Private");
		System.out.println("3 - Secluded");
		System.out.println("4 - Default");
		userAns = ansInt();
		correctAns = 3;
		check.ansCheck(userAns, correctAns);
		
		// question 8
		System.out.println("Question 8");
		System.out.println("Which of these is a reason to refactor code?");
		System.out.println("1 - Change the functionality");
		System.out.println("2 - Complicate the code");
		System.out.println("3 - Increase the number of lines");
		System.out.println("4 - Clean up code to reduce technical debt");
		userAns = ansInt();
		correctAns = 4;
		check.ansCheck(userAns, correctAns);
		
		// question 9
		System.out.println("Question 9");
		System.out.println("Which of these is not a Java data type?");
		System.out.println("1 - short");
		System.out.println("2 - long");
		System.out.println("3 - double");
		System.out.println("4 - extra long");
		userAns = ansInt();
		correctAns = 4;
		check.ansCheck(userAns, correctAns);
		
		// question 10
		System.out.println("Question 10");
		System.out.println("What is an advantage of Java?");
		System.out.println("1 - It is mobile/works on any OS with JRE installed");
		System.out.println("2 - No advantages over other languages");
		System.out.println("3 - Works in Windows OS only");
		System.out.println("4 - It can run on any *nix");
		userAns = ansInt();
		correctAns = 1;
		check.ansCheck(userAns, correctAns);
		
		// display results
		result.userResult(userScore) ; 

	}

}