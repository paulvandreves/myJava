/**
 * Created by Paul on 10/10/2016.
 */
import java.util.Scanner;
public class RunSimpletron {
    Simpletron run = new Simpletron();

    public static void main (String[]args)
    {

        boolean exit = true;
        while(true) {

            System.out.println("Pick a program to run. ");
            System.out.println("Enter 1  for Machine lauange 2 for simpletron and 3 for Simpletron Modification");
            Scanner userEntry = new Scanner(System.in);
            int Entry = userEntry.nextInt();

            if (Entry == 1) {
                MachineLang runn = new MachineLang();
            }
            if (Entry == 2) {
                Simpletron run = new Simpletron();
            }
            if (Entry == 3) {
                Simpletron_Simulator_Modifications Run = new Simpletron_Simulator_Modifications();
            }
            else {
                exit = false;
            }
        }
    }
}
// add float to int methoed
// convert machine language to hexadecimal
// use 0x in front of hexadecimal