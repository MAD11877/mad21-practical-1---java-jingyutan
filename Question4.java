import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
     
    Scanner in = new Scanner(System.in);
    System.out.print("");
    int num = in.nextInt();

   for (int i = 1; i<=num; i++) {
     for (int x = num; x >= i; x--){
       System.out.print("*");
     }
     System.out.println(" ");


   }

  }

}
