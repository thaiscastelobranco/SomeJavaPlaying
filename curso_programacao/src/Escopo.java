
public class Escopo {

	public static void main(String[] args) {
		
		double price = 400.00;
		
		double discount = 0;
		
		if (price < 200.00) {
			discount = price * 0.1;
		}
		
		System.out.println(discount);
	}

}
