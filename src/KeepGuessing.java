import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secretNumber, guess = 0;//guess is initialized to 0
		
		secretNumber = 123;
		
		System.out.println("I'm thinking of a number between 1 and 1000");
		
	
		System.out.println("Generate 10 random integers between 1 and 1000");

        Random rnd = new Random();
        
        System.out.print("Enter the number:");
		guess = keyboard.nextInt();
			
        
     
		while ( guess != secretNumber )
			
		{
			
			if (guess == 5 )
				break;
			
			else if (guess != 123)
				System.out.println("\nYou are wrong. Try again.");
			
				
			System.out.println("Enter the number: ");
		
			guess = keyboard.nextInt();
			
		}
		
	
			System.out.print("You are correct. ");
			
			if (guess == secretNumber)
				System.out.print("You win a prize!");
			
	
		}
	
		
		
	}