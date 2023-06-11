package RuntimeExp;
import java.util.Scanner;
public class ArrayIndex
{
    Scanner scanner = new Scanner(System.in);
	public void CheckIndex()
    {
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter " + (i+1) +" Element " + ": ");
            arr[i] = scanner.nextInt();
        }
        Access_Index(arr);
    }
    public void Access_Index(int[] arr)
    {
        try
        {
            System.out.println("Enter the index to access: ");
            int index = scanner.nextInt();
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
            System.out.println("Succesfully Compiled And Exceptions are Handeled\n");
        }
        catch(Exception e)
        {
            System.out.println("Error: Invalid input. Please Enter the size less than the input size.\n");
            Access_Index(arr);
        }
    }
}