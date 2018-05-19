import java.util.Scanner;
public class FoodConsumptions
{ 
    private double corn;
    private double milk;
    private double apples;
    private double eggs;
    private double chicken;
    private double cheese;
    private double pork;
    private double beef;
    private double weight;
    private double energyUsage;
   static Scanner sc;
   public FoodConsumptions(){
       sc = new Scanner(System.in);
    }
   public double calculateEnergyUsage(){
       sc = new Scanner(System.in);
         corn = 2;
         milk = 3;
         apples = 2.5;
         eggs = 5;
         chicken = 5;
         cheese = 7.5;
         pork = 12.5;
         beef = 30.5;
        System.out.println("What food did you eat?");
         String type=sc.next();
        System.out.println("How much of it?");  
         weight=sc.nextDouble();
     if(type.equals(corn)){
         energyUsage = corn * weight ; 
        }
     if(type.equals(milk)){
         energyUsage = milk * weight;
        }
     if(type.equals(apples)){
          energyUsage = apples * weight;
        }
     if(type.equals(eggs)){
          energyUsage = eggs * weight ; 
        }
     if(type.equals(chicken)){
         energyUsage = chicken * weight ;
        }
     if(type.equals(cheese)){
          energyUsage = cheese * weight;
        }
     if(type.equals(pork)){
          energyUsage = pork * weight;
        }
     if(type.equals(beef)){
          energyUsage = beef * weight;
        }
       return energyUsage;
    }
}