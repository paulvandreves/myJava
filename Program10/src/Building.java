import java.util.Scanner;

/**
 * Created by Paul on 11/12/2016.
 */
public class Building implements CarbonFootPrint
{

    private int rVaule;

    //String[] heatSource = new String []{"geoThermal","passiveSolar", "naturalGas", "heatPump", "wood", "coal", "propane"    };
    private enum heatSource
    {
        geoThermal, passiveSolar, naturalGas, heatPump, wood, coal, propane;
    }

    private int cubicFeet;

    public Building()
    {
        getCarbonFootPrint();
    }

    public double getCarbonFootPrint()
    {
        Scanner userEntry = new Scanner(System.in);
        int carbonFootPrint = 0;
        System.out.println("Enter the R vaule for the insulation oy your home");
        userEntry.nextInt(rVaule);
        carbonFootPrint = cubicFeet % rVaule;
        String choice = userEntry.nextLine();
        System.out.println("Enter the corresponding letter to the heat source of your building  ");
        System.out.println("a: geo Thermal, b:passive Solar, c: natural Gas, d: heat Pump, e: wood, f: coal, g: propane");


        switch (choice)
        {
            case "a":
                carbonFootPrint--;

                break;
            case "b":
                carbonFootPrint--;

                break;
            case "c":
                carbonFootPrint += Integer.parseInt("100");
                break;
            case "d":
                carbonFootPrint += 78;

                break;
            case "e":
                carbonFootPrint++;
                break;
            case "f":
                carbonFootPrint += 200;
                break;
            case "g":
                carbonFootPrint += 150;
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









