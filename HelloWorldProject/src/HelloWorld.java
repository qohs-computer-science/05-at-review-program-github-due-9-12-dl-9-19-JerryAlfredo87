import java.util.Scanner;
/*
 * TODO: Name: Meade Havenstein
 * TODO: Date: 9/10/25
 * TODO: Class Period: 6
 * TODO: Program Description: ask the user for their name, age, favorite 3+ digit number, and GPA  (cumulative, weighted). The program will then print out the name, age based comment, grade based compliment, all multiples of the length of name until favorite number
 */
//Yes, I know the file name should be something like ReviewProgram - working on it!
public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("What is your age?");
		
		int age = scanner.nextInt();
		while(fav < 99)
		{
			System.out.println("You inputted an invalid response. What is your favorite number that has more than 3 digits?");
			age = scanner.nextInt();
		}
		System.out.println("What is your favorite number that has more than 3 digits?");
		int fav = scanner.nextInt();
		while(fav < 99)
		{
			System.out.println("You inputted an invalid response. What is your favorite number that has more than 3 digits?");
			fav = scanner.nextInt();
		}
		System.out.println("What is your cumulative, weighted GPA?");
		double gpa = scanner.nextDouble();
		while(gpa < 0.0 || gpa > 5.0)
		{
			System.out.println("You inputted an invalid response. What is your cumulative, weighted GPA?");
			gpa = scanner.nextDouble();
		}
		
		System.out.println("Hello " + name);
		String congrats = "";
		if(age > 17)
			congrats = "Congradulations on being 18!";
		else
			congrats = 18 - age + " years until you turn 18!";
		System.out.println(congrats);

		String comp = "";
		if (gpa >= 4.5)
			comp = "You're doing an amazing job in school!";
		else if (gpa >= 4.0)
			comp = "You're doing a good job in school!";
		else if (gpa >= 3.5)
			comp = "Your grades are almost there!";
		else if (gpa >= 3.0)
			comp = "Keep trying in school!";
		else
			comp = "Do your best in school!";
		System.out.println(comp);

		for(int x = 0; x < fav; x++)
		{
			if(x % name.length() == 0)
				System.out.print(x + ", ");
		}//end for
		scanner.close();
	}//end main

}//end class
