
package Application;

import java.util.Scanner;

import Entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Dollar price: ");
		double dolar = scanner.nextDouble();
		
		System.out.println("How many dollars will be bougth: ");
		double amount = scanner.nextDouble();
		
		double dollarValue = CurrencyConverter.dollarValue(dolar);
		double toReal = CurrencyConverter.toReal(dolar, amount);
		
		System.out.println();
		System.out.printf("Dollar value + tax: US$ %.2f", dollarValue);
		
		System.out.println();
		System.out.printf("Amount in dollar: US$ %.2f", amount);
		
		System.out.println();
		System.out.printf("Total in reais: R$ %.2f", toReal);
		
		scanner.close();

	}

}
