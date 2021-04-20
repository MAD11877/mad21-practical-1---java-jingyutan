import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in); // Creating scanner object "in"
    
    System.out.print("Enter weight in kilograms: ");
    double weight = in.nextDouble(); // Asssigning enterred user value into "weight"
    
    
    System.out.print("Enter height in m: ");
    double height = in.nextDouble(); // Assigning entered user value into "height"
    
    double BMI = weight / (height * height);
    System.out.println("BMI = " + BMI);
  }
}
