import java.io.IOException;

/**
 * Created by Paul on 11/16/2016.
 *  Write a program demonstrating that the order of catch blocks is important.
 *  If you try to catch a superclass exception type before a subclass type, the compiler should generate errors
 */
public class CatchBlockOrder
{
    static void main (String []args)
    {
        try
        {
            getParentExpection();
        }
        catch (Exception ea)
        {
            ea.printStackTrace();
        }



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

    public static void getParentExpection() throws Exception
    {
        throw new Exception("Most super Exception thrown");
    }
}
