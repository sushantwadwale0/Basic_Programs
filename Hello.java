import java.util.Scanner;

public class Hello {
  public static void main(String[] args) 
  {
    Scanner enter = new Scanner (System.in);
    System.out.print("Input your first name: ");
    String fname = enter.next();
    System.out.print("Input your last name: ");
    String lname = enter.next();
    System.out.println();
    System.out.println("Hello \n"+fname+" "+lname);
    //Scanner output = new Scanner (System.in);
	System.out.println("Enter your company name.");
    String cname = enter.next();
    System.out.println();
    System.out.println("Welcome to the company"+" " +cname);
    System.out.println("Enter your monile number");
    String mono = enter.next();
    System.out.println();
    System.out.println("Your Mobile Number:" +" "+mono);
    System.out.println();
    System.out.println("Enter your DOB number");
    String dob = enter.next();
    System.out.println("Your DOB :" +" "+dob);
    System.out.println("Enter your date of joinning");

    Scanner demo = new Scanner(System.in);
    String date = demo.next();
    System.out.println(" Your date of joinning"+" "+date);
  }
}