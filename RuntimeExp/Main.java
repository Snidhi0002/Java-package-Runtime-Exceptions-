package RuntimeExp;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        mainLoop : while(true)
        {
            System.out.println("********MENU**********");
            System.out.println("1. Display Developer Name");
            System.out.println("2. Handle Divide By Zero Exception");
            System.out.println("3. Handle Array Index Exception ");
            System.out.println("4. Handle Negative Size Exception");
            System.out.println("5. Handle No Such Element Other Than Integer ");
            System.out.println("6. Handle Date Format ");
            System.out.println("7. Terminate The Program");
            System.out.println("----------Enter the Choice ---------");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Creating Class A object from RuntimeExp package
                    A a = new A();
                    //calling printName method from RuntimeExp package
                    a.printName();
                    break;
                case 2:
                    // Creating Class DivideByZero object from RuntimeExp package
                    DivideByZero dz = new DivideByZero();
                    //calling Divide_by_Zero method from RuntimeExp package
                    dz.Divide_by_Zero();
                    break;
                case 3:
                    // Creating Class ArrayIndex object from RuntimeExp package
                    ArrayIndex ar = new ArrayIndex();
                    //calling CheckIndex method from RuntimeExp package
                    ar.CheckIndex();
                    break;
                case 4:
                    // Creating Class NArraySize object from RuntimeExp package
                    NArraySize arrsize = new NArraySize();
                    //calling checkNeSize method from RuntimeExp package
                    arrsize.checkNeSize();
                    break;
                case 5:
                    // Creating Class NoSuchElementExp object from RuntimeExp package
                    NoSuchElementExp nse = new NoSuchElementExp();
                    //calling CheckElement method from RuntimeExp package
                    nse.CheckElement();
                    break;
                case 6:
                    // Creating DateTimeExp NoSuchElementExp object from RuntimeExp package
                    DateTimeExp dt = new DateTimeExp();
                    //calling CheckDate method from RuntimeExp package
                    dt.checkDate();
                    break;
                case 7:
                    System.out.println("Terminating The Package Program");
                    break mainLoop;
                default:
                    System.out.println("Invalid Choice ");
            }
        }
    }
}
