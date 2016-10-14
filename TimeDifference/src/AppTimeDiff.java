import java.util.Scanner;

public class AppTimeDiff {

	public static void main(String[] args) {

		int years = 0;
		int month = 0;
		int days = 0;
		int thisyears = 0;
		int thismonth = 0;
		int thisdays = 0;
		int date1 = 0;
		int date2 = 0;
		int date3 = 0;


		// Create scanner object
		Scanner input = new Scanner(System.in);

		// Output the prompt
		System.out.println("Enter your birth year: ");

		// Wait for user Entry
		years = input.nextInt();

		// Output the prompt
		System.out.println("Enter the month of your birth as a number: ");

		// Wait for user Entry
		month = input.nextInt();

		// Output the prompt1
		System.out.println("Enter the numbered day your were born: ");

		// Wait for user Entry
		days = input.nextInt();

		// Output the prompt
		System.out.println("Enter the Year: ");

		// Wait for user Entry
		thisyears = input.nextInt();

		// Output the prompt
		System.out.println("Enter this Months number: ");

		// Wait for user Entry
		thismonth = input.nextInt();

		// Output the prompt
		System.out.println("Enter todays numbered date: ");

		// Wait for user Entry
		thisdays = input.nextInt();

		System.out.println("You entered: " + month + "/" + days + "/" + years + ".");
		System.out.println("Todays date is: " + thismonth + "/" + thisdays + "/" + thisyears + ".");

		//calculations
		years = (years*365);
		thisyears = (thisyears*365);
		
		while (true) {
			
		if(month == 1) 
		month = month+30;
		
		if(month == 2) 
			month = month+26;
		
		if(month == 3) 
			month = month+28;
		
		if(month == 3) 
			month = month+28;
		
		if(month == 4) 
			month = month+26;
		
		if(month == 5) 
			month = month+26;
		
		if(month == 6) 
			month = month+28;
		
		if(month == 7) 
			month = month+24;
		
		if(month == 8) 
			month = month+28;
		
		if(month == 9) 
			month = month+28;
		
		if(month == 10) 
			month = month+21;
		
		if(month == 11) 
			month = month+19;
		
		if(month == 12) 
			month = month+19;
		
		if(thismonth == 1) 
			thismonth = thismonth+30;
			
			if(thismonth == 2) 
				thismonth = thismonth+26;
			
			if(thismonth == 3) 
				thismonth = thismonth+28;
			
			if(thismonth == 3) 
				thismonth = thismonth+28;
			
			if(thismonth == 4) 
				thismonth = thismonth+26;
			
			if(thismonth == 5) 
				thismonth = thismonth+26;
			
			if(thismonth == 6) 
				thismonth = thismonth+28;
			
			if(thismonth == 7) 
				thismonth = thismonth+24;
			
			if(thismonth == 8) 
				thismonth = thismonth+28;
			
			if(thismonth == 9) 
				thismonth = thismonth+28;
			
			if(thismonth == 10) 
				thismonth = thismonth+21;
			
			if(thismonth == 11) 
				thismonth = thismonth+19;
			
			if(thismonth == 12) 
				thismonth = thismonth+19;
			
			if (date1 == 0)
				date1 = years + month + days;
			
			if (date2 == 0)
				date2 = thisyears + thismonth + thisdays;
			
			if (date3== 0)
				date3 = date2 - date1;
			
			System.out.println("You are now " + date3 + " days old!");
			break;
				}
		 
		
				
		
		
	}

}
