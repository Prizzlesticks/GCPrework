import java.util.Scanner;

public class Reversal {
	
	public static void main(String[] args) {
		
		int value = 0;
		int reverse = 0;
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a Number: ");
		
		// Wait for user Entry
		value = input.nextInt();
		
		//Reverse the number
		
		//Use a while loop to break down the input
		while(value != 0 )
	{
		//Multiply the reverse number to finish inversion
		reverse = reverse * 10;
		//Use Modulus to divide and get a remainder
		reverse = reverse + value%10; 
		//Use the value input and divide by 10 to obtain next number
		value = value/10;
	}
	
		// Output user Entry 
		System.out.println("The reverse of your entry is " + reverse);
		
		
		// Found code to close memory leak
		try {
		    
		} finally {
		    input.close();     
		}
	}

}
