import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Calculates the carbon footprint for cars
 *
 * Pranav Veerubhotla
 * 1.0 kappa
 */
public class Cars
{
    // instance variables - replace the example below with your own
    static Scanner keyboard;
    private double caremission;

    /**
     * Constructor for objects of class Cars
     */
    public Cars()
    {
        keyboard = new Scanner(System.in);
    }

    public double calculate()
    {
        System.out.println("Please select your type of vehicle! Enter 'G' for Gasoline, 'D' for Diesel, 'H'for hybrid, and 'E' for Electric.");
        String type = keyboard.next();
        if(type.equals("G")){
            System.out.println("Please enter your average daily MPG, this value can be rough");
            double mpg = keyboard.nextDouble();
            System.out.println("About how many miles do you drive evryday?");
            double yearmiles = keyboard.nextDouble()*365;
            double co2pkm = 6760/(mpg);
            double co2pm = co2pkm/1.609;
            caremission = (co2pm * yearmiles)/(1.1023e-6);
        }
        if(type.equals("D")){
            System.out.println("Please enter your average daily MPG, this value can be rough");
            double mpg = keyboard.nextDouble();
            System.out.println("About how many miles do you drive evryday?");
            double yearmiles = keyboard.nextDouble()*365;
            double co2pkm = 7440/(mpg);
            double co2pm = co2pkm/1.609;
            caremission = (co2pm * yearmiles)/(1.1023e-6);
        }
        if(type.equals("H")){
            System.out.println("Please enter your average daily eMPG, this value is the MPG when both the electric motor and engine are running");
            double mpg = keyboard.nextDouble();
            System.out.println("About how many miles do you drive evryday?");
            double yearmiles = keyboard.nextDouble()*365;
            double co2pkm = 6760/(mpg);
            double co2pm = co2pkm/1.609;
            caremission = (co2pm * yearmiles)/(1.1023e-6);
        }
        if(type.equals("E")){
            System.out.println("This is accounted for in your power usage");
            caremission = 0;
        }
        return caremission;
    }
}
