import java.util.Scanner;

/**
 * Created by Paul on 10/16/2016.
 */
public class Simpletron_Simulator_Modifications {

    private int acc;
    private int [] memory;
    private int iReg;
    private int iCounter;
    private int operator;
    private int operand;

    public  Simpletron_Simulator_Modifications( )
    {
        displayWelcomeMessage ();
        initialiseVariables ();
        runSimulator ();
    }


    public void displayWelcomeMessage ( )
    {
        System.out.printf ("\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s %s\n%s %s\n",
                "*** Welcome to Simpletron! ***",
                "*** Please enter your program one instruction ***",
                "*** (or data word) at a time.   ***",
                "*** I will display the location number   ***",
                "**  and a question mark (?). You then  ***",
                "*** type the word for that location. Press the***",
                "*** Done button to stop entering your program ***",
                " Loc", " Inst", "****", "*****");
    }


    public void runSimulator ()
    {
        int submittedInstruction = 0;
        int memoryPointer = 0;

        Scanner input = new Scanner ( System.in );

        do
        {
            System.out.printf ("%d %s  ", memoryPointer, "?" );
            submittedInstruction = input.nextInt ();
            if ( submittedInstruction != -99999 )
                memory [ memoryPointer ] = submittedInstruction;
            memoryPointer++;

        } while ( submittedInstruction != -99999 );	// end do-while

        System.out.printf ("\n%s%s", "*** Program loading completed ***\n",
                "*** Program excecution begins  ***\n");


        for ( int code : memory )
        {

            if ( code != 0 )	// skip all the null instructions
            {
                load ();
                execute ( operand, operator );
            }
        }

    }

    public void initialiseVariables ( )
    {
        memory = new int [1000];
        iCounter = 0;


    }


    public void load ( )
    {


        operator = memory [ iCounter ] / 100;
        operand = memory [ iCounter ] % 100;

    }


    public void execute ( int operands, int operation )
    {

        switch ( operation )
        {
            case 10:
                Scanner input = new Scanner ( System.in );
                System.out.print ( "Please Enter a whole number (positive or negative): " );
                memory [ operands ] = input.nextInt ();
                break;
            case 11:
                System.out.println ("The result of the operation is " + memory [ operands] );
                break;
            case 20:
                acc = memory [ operands ];
                break;
            case 21:
                memory [ operands ] = acc;
                break;
            case 30:

                acc += memory [ operands ];
                break;
            case 31:

                acc -= memory [ operands ];
                break;
            case 32:
                acc /=  memory [ operands ];

                break;
            case 33:

                acc *= memory [ operands ];
                break;
            case 40:
                iCounter = operands;
                break;
            case 41:
                if ( acc < 0 )
                    iCounter = operands;
                break;
            case 42:
                if ( acc == 0 )
                    iCounter = operands;
                break;
            case 43:
                dumpTheCore ();
                System.out.printf ("\n%s\n", "The program has ended...");
                System.exit ( 0 );
                break;

        }

        iCounter++;

    }


    public void dumpTheCore ( )
    {
        System.out.printf ("\n%30s\n%30s\t%s%4d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n\n%30s\n", "REGISTERS:",
                "acc", "+", acc, "instruction counter", iCounter, "instruction register",
                iCounter, "operation code", operator, "operand", operand, "MEMORY:" );


        for ( int i = 0; i < 10; i++ )
        {
            System.out.printf ( "%6d", i);
        }

        System.out.println ();
        int counter = 0;


        for (int i = 0; i < 10; i++ )
        {
            if ( counter %10 == 0 )
                System.out.printf ("%2d ", counter);
            for (int j = 0; j < 10; j++)
            {

                if ( memory [ counter ] == 0 )
                    System.out.printf ( "%s%s", "+", "0000 ");
                else
                    System.out.printf ("%s%4d ", "+", memory [counter]);
                counter++;

            }

            System.out.println ();

        }
    }

}
