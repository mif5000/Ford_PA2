import java.util.Scanner;

public class Ford_p2 {
	public static void main (String[] args) {
		Scanner scnr = new Scanner (System.in);
        double BMI;
        double weight;
        double height;
         
        System.out.print ("Enter your Weight in Kilograms: ");
        weight = scnr.nextDouble();
        System.out.print ("Enter your Height in Meters: ");
        height = scnr.nextDouble();
        BMI = (weight) / (height * height);
        System.out.printf ("Your BMI is %.1f\n\n", BMI);
         
        System.out.println ("BMI Categories");
        System.out.println ("Underweight =<  18.5");
        System.out.println ("Normal:  18.5 - 24.9");
        System.out.println ("Overweight: 25 - 29.9");
        System.out.println ("Obese: 30+");
	}
}
