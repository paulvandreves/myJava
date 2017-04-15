/**
 * Created by Paul on 9/26/2016.
 */
import java.util.Scanner;
import java.util.Random;

public class sixpointfive {
    public void Learn(){

        Random multiple = new Random();
        Scanner input = new Scanner( System.in );
        boolean wrong = true;

        int num1 = 1 + multiple.nextInt( 9 );
        int num2 = 1 + multiple.nextInt( 9 );

        while( wrong == true ){

            askQuestion( num1, num2 );
            int answer = input.nextInt();

            if( answer == num1*num2 ){
                System.out.println( "Very Good" );
                wrong = false;
            }

            else{
                System.out.print( "No. Please try again." );
            }
        }
    }

    public String askQuestion( int x, int y ){

        System.out.printf("How much is  " + x + "  times  " + y + "   ?");
        return "How much is" + x + "times" + y + "?";
    }

    public static void main(String args[]) throws Exception{
        new sixpointfive().Learn();
    }
}
