import java.util.Scanner;
public class Checkinput {

	public static void main(String arg[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Number:");
		int num = input.nextInt();
		
		if( num > 0 ) {
			System.out.println("Your number is Positive");
		}else
		if( num < 0 ) {
			System.out.println("Your number is Negative");
			
		}else {
			System.out.println("your number is zero");
		}
		
	}
	}
