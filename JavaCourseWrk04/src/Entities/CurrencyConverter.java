package Entities;

public class CurrencyConverter {

	public static final double Tax = 0.06;
	
	public static double dollarValue(double dolar) {
		return dolar + (dolar * Tax);
	}
	
	public static double toReal(double dolar, double amount) {
		return amount * (dolar + (dolar * Tax));
	}

	
	
}
