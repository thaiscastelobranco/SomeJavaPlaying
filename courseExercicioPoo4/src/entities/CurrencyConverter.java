package entities;

public class CurrencyConverter {
	public static final double Iof = 0.06;
	
	public static double totalPrice(double amount, double dollares) {
		return amount  * dollares *(1.0 + Iof);
	}
}
