/**
 * Created by Paul on 10/12/2016.
 */

import java.util.Scanner;
public class MachineLang {
    //public static void main (String[]args)
    public MachineLang()
    {
        /*
            00      1099
            01      2099
            02      3098
            03

            98      ----        Total sum
            99      ----        User input
    Private int[] memory = new int[100];
	Private int acc = 0;
	Private int iReg = 0;
	Private int operation = 0;
	Private int operand = 0;
	Private int icounter = 0;
        */
        Scanner keyboard = new Scanner(System.in);

        final int READ = 10;
        final int WRITE = 11;
        final int LOAD = 20;
        final int STORE = 21;
        final int ADD = 30;
        final int SUBTRACT = 31;
        final int DIVIDE = 32;
        final int MULTIPLY = 33;
        final int BRANCH = 40;
        final int BRANCHNEG = 40;
        final int BRANCHZERO = 42;
        final int HALT = 43;

        int[] memory = new int[100];
        int acc = 0;
        int iReg = 0;
        int operation = 0;
        int operand = 0;
        int icounter = 0;

        // Simpletron loop
        int counter = 0;
        while(counter <= 10)
        {
            iReg = memory[icounter];
            operation = iReg / 100;
            operand = iReg % 100;

            switch (operand){
                case READ:
                    System.out.println("Input: ");
                    memory[operand] = keyboard.nextInt();
                    break;
                case WRITE:
                    // instruction
                    System.out.println(iReg);
                    break;
                case LOAD:
                    acc = memory [ operand ];
                    break;
                case STORE:
                    memory [ operand ] = acc;
                    break;
                case ADD:
                    acc += memory [ operand ];
                    break;
                case SUBTRACT:
                    acc -= memory [ operand];
                    break;
                case DIVIDE:
                    acc %= memory [ operand ];
                    break;
                case MULTIPLY:
                    acc *= memory [ operand ];
                    break;
                case BRANCH:
                    icounter =  operand;
                    break;
                /*
                case BRANCHNEG:
                    if ( acc < 0 )
                        icounter = operand;
                    break;
                    */
                case BRANCHZERO:
                    if ( acc == 0 )
                        icounter = operand;
                    break;
                case HALT:
                    System.exit ( 0 );
                    break;


            }
            counter++;

        }
        System.exit(0);

        //initalzie Scanner OBJECT
        // BIULD A SWITCH CASE STRUCTURE WITH LOOP WITH BREAK TO SYSTEM . EXIT
        // ADD A COUNTER VARIBLE TO ITTERATE THROUG EACH

    }


}
