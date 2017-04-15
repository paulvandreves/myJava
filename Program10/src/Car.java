import java.util.Scanner;

/**
 * Created by Paul on 11/12/2016.
 */
public class Car implements CarbonFootPrint
{
    private int mpg;
    private int yearMileage;

    private enum fuelType
    {
        gas,eletric,desiel,hydrogen,naturalGas
    }



    public Car()
    {

    }

    public double getCarbonFootPrint()
    {
        int carbonFootPrint = 0;
        Scanner userEntry = new Scanner(System.in);
        System.out.println("Enter your vehicles average mileage ");
        userEntry.nextInt(mpg);
        System.out.println("Enter you vehicle's yearly mileage ");
        String choice = userEntry.nextLine();
        carbonFootPrint = mpg * yearMileage;
        System.out.println("Enter the corresponding letter to the heat source of your building  ");
        System.out.println("a: Gas, b: electric , c: diesel , d:, e: hydrogen, f: natural Gas ");


        switch (choice)
        {
            case "a":
                carbonFootPrint+= 100;

                break;
            case "b":
                carbonFootPrint--;

                break;
            case "c":
                carbonFootPrint += Integer.parseInt("100");
                break;
            case "d":
                carbonFootPrint --;

                break;
            case "e":
                carbonFootPrint++;
                break;

            default:
                System.out.println("Please enter an option in the form of a letter ");
                System.out.println("a:geo Thermal ");
                System.out.println("b:passive solar");
                System.out.println("c: natural gas");
                System.out.println("d: heat Pump");
                System.out.println("e: wood");
                System.out.println("f: coal");
                System.out.println("g: propane");
                break;


        }
        System.out.println("Your building's carbon foot print is:" + carbonFootPrint);
        return carbonFootPrint;
    }
}
