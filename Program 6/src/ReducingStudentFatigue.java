/**
 * Created by Paul on 9/29/2016.
 */
import java.util.Scanner;
import java.util.Random;

public class ReducingStudentFatigue {
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
                //System.out.println( "Very Good" );
                trueResponse();
                wrong = false;
            }

            else{
                System.out.print( "No. Please try again." );
                falseResponse();
            }
        }
    }

    public String askQuestion( int x, int y ){

        System.out.printf("How much is  " + x + "  times  " + y + "   ?");
        return "How much is" + x + "times" + y + "?";
    }

    public static void main(String args[]) throws Exception{
        new ReducingStudentFatigue().Learn();
    }
    public void falseResponse() {
        Random response = new Random();
        int rng = response.nextInt(4);
        switch (rng) {
            case 0:
                System.out.print("Every failure is a brick in my palace of knowledge");
                break;
            case 1:
                System.out.print("Wrong. Try once more.");
                break;
            case 2:
                System.out.print("Don't give up!");
                break;
            case 3:
                System.out.print("No. Keep trying");
                break;
            default:
                System.out.print("(: ");
        }
    }

    private void trueResponse() {
        Random response = new Random();
        int rng = response.nextInt(4);
        switch (rng) {
            case 0:
                System.out.print("Very good!");
                break;
            case 1:
                System.out.print("Excellent!");
                break;
            case 2:
                System.out.print("Nice work");
                break;
            case 3:
                System.out.print("Keep up the good workk!");
                break;
            default:
                System.out.print("): ");
        }
    }
}




