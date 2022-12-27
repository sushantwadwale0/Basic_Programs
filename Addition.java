import java.util.Scanner;

public class Addition {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input the first number: ");
    double num1 = input.nextDouble();
    System.out.print("Input the second number: ");
    double num2 = input.nextDouble();
    double sum = num1 + num2;
    //System.out.println();
    System.out.println("Sum: "+sum);
    System.out.println("Enter your First number for Multification");
    double fname = input.nextInt();
    System.out.println("Enter you second number for multification");
    double sname = input.nextInt();
    double fs = fname*sname;
    System.out.println("Your Multiplay Number is:"+" "+fs);
  }
}