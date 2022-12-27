import java.util.Scanner;

 public class factorial {

 public static void main(String args[]) {

   System.out.println("Find the factorial of: ");

   // creating a scanner object

   Scanner ref = new Scanner(System.in);

   int number = ref.nextInt(); // taking the input with scanner

 

   int k, fact = 1; // first factorial value

 

   for (k = 1; k <= number; k++) {

     fact = fact * k;

   }

   System.out.println("Factorial of " + number + " is: " + fact);

   ref.close();

 }

}