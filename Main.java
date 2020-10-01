import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
Scanner input = new Scanner(System.in); 
 // get the user grade between A to F
 System.out.println("Please make a selection (A-F)");
 String choice = input.nextLine();
 //  switch case statement
 switch(choice){
   case "A":
   System.out.println("This is between 80% and 100%");
   break;
   case "B":
   System.out.println("This is between 70% and 79%");
   break;
   case "C":
   System.out.println("This is between 60% and 69%");
   break;
   case "D":
   System.out.println("This is between 50% and 59%");
    case "F":
   System.out.println("This is between 0% and 49%");
 }
   

  }
}
