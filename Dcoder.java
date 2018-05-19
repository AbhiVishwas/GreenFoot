
import java.util.*;


 /*Please dont change class name, Dcoder 
 and class must not be public*/

 //Compiler version JDK 1.8


 class Dcoder {
 	private static double cansRe=0;
 	private static double cansTr=0;
 	private static double chipsTr=0;
 	private static double bottlesTr=0;
 	public static void main(String[]args) {
 		
 		System.out.println("How many aluminum cans do you recycle, on average, daily?");
 		cansRe=kB.nextDouble();
 		System.out.println("How many aluminum cans do you throw away, on average, daily?");
 		cansTr=kB.nextDouble();
 		System.out.println("How many plastic bottles do you throw away, on average, daily?");
 		chipsTr=kB.nextDouble();
 		System.out.println("How many chip bags do you throw away, on average, daily?");
 		bottlesTr=kB.nextDouble();
 		System.out.println("You output " + trashFootprint1(cansRe,cansTr,bottlesTr,chipsTr) + " tons of CO2 per year from trash.");
 		}
   /*trashed/recycled items before yearly
   conversion are average daily amounts*/
   private static double gramsToTons=.0000011023;
   private static double fPPerTrashed=.000100793643939;
   private static double cansRecycled=0.0;
   private static double cansTrashed=0.0;
   private static double bottlesTrashed=0.0;
   private static double chipBagsTrashed=0.0;
   //chip bags are standard snack size
   private static double chipBagsTrashedY() {
   	return chipBagsTrashed*365;
   	}
   private static double cansRecycledY() {
   	return cansRecycled*365;
   	}
   private static double cansTrashedY() {
   	return cansTrashed*365;
   	}
   private static double bottlesTrashedY() {	
   return bottlesTrashed*365;
   }
   private static double cTFootprint() {	
   return cansTrashedY()*fPPerTrashed;
   }
   private static double cRFootprint() {
   	
    return ((fPPerTrashed*0.05)*cansRecycledY());
    }
   private static double bTFootprint() {
   	
    return bottlesTrashedY()*(27.324*gramsToTons);
    }
   private static double cBTFootprint() {
   	
    return chipBagsTrashedY()*(1.5*gramsToTons);
    }
   private static double trashFootprint() {
   	return cRFootprint()+cTFootprint()+bTFootprint()+cBTFootprint();
   	}
   private static Scanner kB=new Scanner(System.in);
	private static double trashFootprint1(double cansR, double cansT, double bottlesT, double cBagsT) {
		cansRecycled=cansR;
		cansTrashed=cansT;
		bottlesTrashed=bottlesT;
		chipBagsTrashed=cBagsT;
	return trashFootprint();
 	}
 
 }