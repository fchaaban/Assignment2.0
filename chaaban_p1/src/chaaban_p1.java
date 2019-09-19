import java.util.Scanner;


public class chaaban_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstDigit, secondDigit, thirdDigit, fourthDigit, number, temp;
        Scanner input = new Scanner( System.in );
 
        do{
        System.out.print(" Enter Four Digit Number: ");
        number = input.nextInt();
        }while(number / 1000 == 0 || number / 10000 != 0 );
 
        firstDigit = number / 1000;
        secondDigit = number / 100 % 10;
        thirdDigit = number / 10 % 10;
        fourthDigit = number % 10;
 
        firstDigit = (firstDigit + 7) % 10;
        secondDigit = (secondDigit + 7) % 10;
        thirdDigit = (thirdDigit + 7) % 10;
        fourthDigit = (fourthDigit + 7) % 10;
 
        temp = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = temp;
 
        temp = secondDigit;
        secondDigit = fourthDigit;
        fourthDigit = temp;
 
        System.out.printf("the encrypted number is %d%d%d%d\n",
                firstDigit, secondDigit, thirdDigit, fourthDigit);

	}

}
