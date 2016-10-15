import java.util.Scanner;

public class Reversal {
	
	public static void main(String[] args) {
		
		int value = 0;
		int newNumber = 0;
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a Number: ");
		
		// Wait for user Entry
		value = input.nextInt();
		
		//Reverse the number
		
		//Use a while loop to break down the input - loop continues while not equal to 0
		while(value != 0 )
	{
		//Multiply the reverse number to finish inversion
		newNumber = newNumber * 10;
		//Use Modulus to divide and get a remainder
		newNumber = newNumber + value%10; 
		//Use the value input and divide by 10 to obtain next number
		value = value/10;
	}
	
		// Output user Entry 
		System.out.println("The reverse of your entry is " + newNumber);
		
		
		// Found code to close memory leak
		try {
		    
		} finally {
		    input.close();     
		}
	}

}
