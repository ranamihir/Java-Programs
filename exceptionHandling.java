import java.util.*;

public class exceptionHandling{
	public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		try{
			int i = sc.nextInt();
		}
		
		catch(InputMismatchException ex){
			System.out.println("Invalid input.");
			
			String y = "y", n = "n";
			
			System.out.println("Do you want to restart program? (y/n)");
			String input = sc.nextLine();
			
			if(input.equals(y))
			{
				exceptionHandling.main(new String[] {"a"});
			}
			
			else if(input.equals(n))
			{
				System.exit(0);
			}
		}
	}
}