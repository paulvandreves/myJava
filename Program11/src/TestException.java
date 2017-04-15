import java.io.IOException;

/**
 * Created by Paul on 11/15/2016.
 * All exceptions should be caught with catch blocks specifying type Exception.
 */
public class TestException
{
    public static void main(String[] args)
    {
        try{
            getExceptionB();
        }catch(ExceptionA ea){
            ea.printStackTrace();
        }

        try{
            getExceptionC();
        }catch(ExceptionA ea){
            ea.printStackTrace();
            System.out.println("ExceptionA ea caught");
        }



        try {
            // something stupid
        } catch(NullPointerException e) {
            System.out.println("Null pointer Expection caught");
            // probably don't bother doing clean up
        } finally {
            // carry on as if nothing went wrong
        }

        try {
            throw new IOException();
        } catch(IOException e) {
            System.out.println("Io Exception caught");
        }


    }

    public static void getExceptionB() throws ExceptionB
    {
        throw new ExceptionB("Exception B thrown ");
    }

    public static void getExceptionC() throws ExceptionC
    {
        throw new ExceptionC("Expection C thrown  ");
    }
}
