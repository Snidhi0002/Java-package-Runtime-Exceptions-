package RuntimeExp;
import java.util.Scanner;
public class NoSuchElementExp
{
	public void CheckElement() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a integer value: ");
            int num = sc.nextInt();
            System.out.println("Entered number: " + num);
            System.out.println("Succesfully Compiled And Exceptions are Handeled");
        } catch (Exception e) {
            System.out.println("Error: Invalid input or Value is not an integer.\n");
            CheckElement();
        }
    }
}