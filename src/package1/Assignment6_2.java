package package1;       //This java file is inside package named package1 inside src folder.
import java.util.*;       //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

/*
 * This assignment helped me to master the concepts of custom exception handling.
 */

class NegativeAgeException extends Exception      //Creating class NegativeAgeException as a child of Exception inbuilt class.
{
	
	
	public String toString()
	{
		return "\nThis not a valid input. Please enter a positive value and greater than Zero.";         //returning String when exception occures.
	}
	
}    //End of class. 





public class Assignment6_2       //Class Declaration containing main function. 
{
	static void checkAge(int inputAge) throws NegativeAgeException     //Function to check age and to throw Exception if it is negative. 
	{
		if(inputAge <= 0)      //Checking weather age is negative or not.
		{
			throw new NegativeAgeException();     //If age is negative then throw exception.
		}
		else
		{
			System.out.println("User's Age is "+inputAge);       //Printing statement.
		}
		
	}      //End of function.
	
	
	
	public static void main(String[] args)     //main function declaration. and because it is static, program execution starts from main function. 
	{
		int ageOfUser;           //int variable to store age of user.
		
		System.out.println("Please, Enter your Age");
		// asking value of age from the user.
        // for printing this on screen. we have used the inbuilt function println() of out stream of System class.
		
		
		//Now we want to take input of the value of age from the user.
      	// For taking input from the user, we have to make the object of Scanner class.
      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
		Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
		
		ageOfUser=sc.nextInt();       //Initializing variable by input integer by user.
		
		try       //try block.
		{
			checkAge(ageOfUser);     //Calling the checkAge function to check weather age is possible or not.
		}
		catch(NegativeAgeException e)          //catch block.
		{
			System.out.println(e);      //Printing Exception Statement.
		}
		
		sc.close();          //Closing the Scanner object.
	}      //End of main function.

}      //End of class.