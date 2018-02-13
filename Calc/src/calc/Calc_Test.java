package calc;

import java.util.Scanner;

public class Calc_Test {

	public static void main(String[] args) {
	Scanner number = new Scanner(System.in);
				
				double num1, num2;
				System.out.println("Enter first number: ");
				
				num1 = number.nextDouble();
				System.out.println("Enter second number: ");
				num2 = number.nextDouble();
				System.out.println("Enter second number: ");
				
				String str = "+";
			
			switch (str)  {
					case "+":
						System.out.println("Your answer is " +(num1 + num2));
						break;
						
					case "-":
						System.out.println("Your answer is " +(num1 - num2));
						break;
						
					case "*":
						System.out.println("Your answer is " +(num1 * num2));
						break;
						
					case "/":
						System.out.println("Your answer is " +(num1 / num2));
						break;
						
					default:	
					System.out.println("Your answer is ");	
			  }
			
			
		
	
		}
}
