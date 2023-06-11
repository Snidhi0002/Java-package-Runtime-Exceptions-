package RuntimeExp;
import java.util.Scanner;

public class NArraySize {
public void checkNeSize(){
	Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("Enter the size of the array: ");
            int size = scanner.nextInt();

            if (size < 0)
            {
                System.out.println("Error: Negative array size not allowed!");
            }
            int[] array = new int[size];
            System.out.println("Array created with size: " + array.length);
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++)
            {
                System.out.print("Enter " + (i+1) +" Element " + ": ");
                array[i] = scanner.nextInt();
            }
            System.out.println("Arrays Elements are : ");
            for(int i = 0;i<size;i++)
                System.out.print(array[i] + "\t");
            System.out.println("Succesfully Compiled And Exceptions are Handeled\n");
        }
        catch (Exception e)
        {
            System.out.println("Error: Invalid input or operation.");
            checkNeSize();
        }
    }
}