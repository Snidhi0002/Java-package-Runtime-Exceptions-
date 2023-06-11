package RuntimeExp;
import java.util.Scanner;
public class DivideByZero
{
  public void Divide_by_Zero(){
	Scanner sc = new Scanner(System.in);
    try
    {
        System.out.println(" ");
        System.out.println("Please Enter the numerator: ");
        int n = sc.nextInt();

        System.out.println("Please Enter the denominator: ");
        int d = sc.nextInt();
	
        int res = n / d;
        System.out.println("Result: \n " + n + " / " + d + " = "+ res);
        System.out.println("Succesfully Compiled And Exceptions are Handeled");
    }
    catch (Exception e)
    {
        System.out.println("Error: Invalid input. Please enter denominator greather than Zero only.\n");
        //sc.nextLine();
        Divide_by_Zero();
     }
  }
}