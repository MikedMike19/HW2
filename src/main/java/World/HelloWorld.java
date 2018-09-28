package World;

import org.apache.commons.lang.RandomStringUtils;
import java.io.File;
import java.io.IOException;
import java.util.Random;


public class HelloWorld
{

    public static void main(String[] args)
    {


        Random random = new Random ();
        int number = random.nextInt (20) + 3;
        System.out.println ("Длина: " + number);


        String generatedString = RandomStringUtils.random (number, true, true);
        System.out.println ("Name: " + generatedString);


        File theDir = new File (generatedString);
        if (!theDir.exists ()) {
            //  System.out.println ("creating directory: ");
            boolean result = false;

            try {
                theDir.mkdir ();
                result = true;
            } catch (SecurityException se) {

            }
            if (result) {
                System.out.println ("\nDIR " + generatedString + " created");
            }


            File tmp = new File (theDir, "Secret.txt");
            try
            {
                tmp.createNewFile ();
            }
            catch (IOException e)
            {
                e.printStackTrace ();
            }
        }
      }
}

