package Calculaters;

	import java.util.Scanner;

	public class Calculators{

		public static void main(String[] args) {
			Scanner number = new Scanner(System.in);
			
			double num1, num2;
			String operator;
			
			System.out.println("Enter first number: ");
			num1 = number.nextDouble();
			
			System.out.println("operator: " + number.nextLine());
			operator = number.nextLine();
			
			System.out.println("Enter second number: ");
			num2 = number.nextDouble();
			
			
			
			
			
		
		switch (operator)  {
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
	

			

		


