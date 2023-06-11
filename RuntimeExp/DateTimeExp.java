package RuntimeExp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeExp {
	public void checkDate()
    {
	    Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Enter a date (yyyy-MM-dd format): ");
            String input = scanner.nextLine();

            LocalDate date = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            System.out.println("Entered date: " + date);
        }
        catch (Exception e)
        {
            System.out.println("Error: Invalid input. Please enter a valid date in the given format");
            checkDate();
        }
}
}