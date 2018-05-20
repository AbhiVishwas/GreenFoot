import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class GreenFoot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreenFoot
{
    // instance variables - replace the example below with your own
    private double corn;
    private double milk;
    private double apples;
    private double eggs;
    private double chicken;
    private double cheese;
    private double pork;
    private double beef;
    private double weight;
    private double foodEnergyUsage;
    private static double cansRe=0;
    private static double cansTr=0;
    private static double chipsTr=0;
    private static double bottlesTr=0;
    static Scanner keyboard;
    private double caremission;
    private double totalCarbon;
    public GreenFoot()
    {
        keyboard = new Scanner(System.in);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double calculateFoodEnergyUsage(){
        foodEnergyUsage=0.0;
        corn = 2;
        milk = 3;
        apples = 2.5;
        eggs = 5;
        chicken = 5;
        cheese = 7.5;
        pork = 12.5;
        beef = 30.5;
        
        System.out.println("What food did you eat?");
        String type=keyboard.next();
        System.out.println("How much of it?");  
        weight=keyboard.nextDouble();
        if(type.equals("corn")){
            foodEnergyUsage += corn * weight ; 
        }
        if(type.equals("milk")){
            foodEnergyUsage += milk * weight;
        }
        if(type.equals("apples")){
            foodEnergyUsage += apples * weight;
        }
        if(type.equals("eggs")){
            foodEnergyUsage += eggs * weight ; 
        }
        if(type.equals("chicken")){
            foodEnergyUsage += chicken * weight ;
        }
        if(type.equals("cheese")){
            foodEnergyUsage += cheese * weight;
        }
        if(type.equals("pork")){
            foodEnergyUsage += pork * weight;
        }
        if(type.equals("beef")){
            foodEnergyUsage += beef * weight;
        }
        /** IF YOU WANT TO ADD MULTIPLE FOODS
        System.out.println("Do you want to add more food? 'yes' or no");
        String answer = keyboard.next();
        if(answer.equals("yes")){
            calculateFoodEnergyUsage();
        }
        else{
            foodEnergyUsage/=907.18;
        }
        */
        return foodEnergyUsage;
    }

    public double carbonFromPower(String state, double powerBill) {
        String[] states = {"Alaska",
                "Alabama",
                "Arkansas",
                "Arizona",
                "California",
                "Colorado",
                "Connecticut",
                "District of Columbia",
                "Delaware",
                "Florida",
                "Georgia",
                "Hawaii",
                "Iowa",
                "Idaho",
                "Illinois",
                "Indiana",
                "Kansas",
                "Kentucky",
                "Louisiana",
                "Massachusetts",
                "Maryland",
                "Maine",
                "Michigan",
                "Minnesota",
                "Missouri",
                "Mississippi",
                "Montana",
                "North Carolina",
                "North Dakota",
                "Nebraska",
                "New Hampshire",
                "New Jersey",
                "New Mexico",
                "Nevada",
                "New York",
                "Ohio",
                "Oklahoma",
                "Oregon",
                "Pennsylvania",
                "Rhode Island",
                "South Carolina",
                "South Dakota",
                "Tennessee",
                "Texas",
                "Utah",
                "Virginia",
                "Vermont",
                "Washington",
                "West Virginia",
                "Wisconsin",
                "Wyoming"};
        Double[] prices = {11.27, 18.72, 10.25, 8.63, 14.83, 9.64, 17.13, 12.35, 10.09, 10.05,
                9.38, 28.70, 7.93, 8.51, 10.32, 9.33, 10.37, 9.86, 8.95, 13.12, 11.08, 17.67, 11.50,
                10.01, 10.9, 8.48, 9.96, 8.41, 8.15, 16.96, 12.49, 9.65, 13.58, 9.14, 8.59, 10.32,
                7.69, 8.76, 9.42, 17.68, 8.22, 9.32, 10.39, 8.53, 8.24, 15.05, 8.48, 8.84, 9.96, 10.95, 9.50};
        int i=0;
        while (states[i].compareTo(state)<0){
            i++;
        }
        double price=prices[i]/100;
        double kwh = 12*powerBill/price;
        double pounds = 1.4*kwh;
        return pounds*.0005;
    }
    public double carbonFromCar()
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
            caremission = (co2pm * yearmiles);
        }
        if(type.equals("D")){
            System.out.println("Please enter your average daily MPG, this value can be rough");
            double mpg = keyboard.nextDouble();
            System.out.println("About how many miles do you drive evryday?");
            double yearmiles = keyboard.nextDouble()*365;
            double co2pkm = 7440/(mpg);
            double co2pm = co2pkm/1.609;
            caremission = (co2pm * yearmiles);
        }
        if(type.equals("H")){
            System.out.println("Please enter your average daily eMPG, this value is the MPG when both the electric motor and engine are running");
            double mpg = keyboard.nextDouble();
            System.out.println("About how many miles do you drive evryday?");
            double yearmiles = keyboard.nextDouble()*365;
            double co2pkm = 6760/(mpg);
            double co2pm = co2pkm/1.609;
            caremission = (co2pm * yearmiles);
        }
        if(type.equals("E")){
            System.out.println("This is accounted for in your power usage");
            caremission = 0;
        }
        return caremission;
    }
    public double calculateCarbon(String state, double powerBill){
        double temp1 = 0;
        double temp2 = 0;
        double temp3 = 0;
        temp1 += calculateFoodEnergyUsage();
        
        temp2 += carbonFromPower(state, powerBill);
        
        temp3 += carbonFromCar()/90718;
        
        totalCarbon = (temp1 + temp2 + temp3);
        System.out.println("Your total carbon footprint is " + totalCarbon + "tons per year");
        
        return totalCarbon;
    }
}
