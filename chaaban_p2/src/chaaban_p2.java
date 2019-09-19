import java.util.Scanner;

public class chaaban_p2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int weight, height, bMI = 0, choice;
		
		System.out.println("Would you like your BMI calculated as kilograms and meters or pounds and inches?");
		System.out.println("Enter 1 for kilograms and meters");
		System.out.println("Enter 2 for pounds and inches");
		
		choice = scan.nextInt();
		
		if(choice == 1) {
			System.out.print("Enter your weight in kilograms");
		
			weight = scan.nextInt();
			
			System.out.print("Enter your height in meters");
			
			height = scan.nextInt();
			
			bMI = weight / (height * height);
			
		}
		else if(choice == 2) {System.out.print("Enter your weight in pounds");
		
		weight = scan.nextInt();
		
		System.out.print("Enter your height in inches");
		
		height = scan.nextInt();
		
		bMI = (weight * 703) / (height * height);
		
			
		}
		System.out.printf ("Your Body Mass Index (BMI) is %d\n\n", bMI);
        
        System.out.println ("BMI VALUES");
        System.out.println ("Underweight: less than 18.5");
        System.out.println ("Normal:      between 18.5 and 24.9");
        System.out.println ("Overweight:  between 25 and 29.9");
        System.out.println ("Obese:       30 or greater");
		// TODO Auto-generated method stub

	}

}
