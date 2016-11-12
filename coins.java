package coins;

public class coins {
		
	public static void main (String args[]) {
		double money = 572.75;
		double tens = (double) Math.floor (money/10);
		money -= tens * 10;
		double fives = (double) Math.floor(money/5);
		money -= fives * 5;
		double ones = (double) Math.floor(money/1);
		money -= ones * 1;
		double cents = (double) Math.floor(money/0.25);
		money -= cents * 0.25;


		System.out.println("10 Peso Bills: " + tens);
		System.out.println("5 Peso Coins: " + fives);
		System.out.println("1 Peso Coin: " + ones);
		System.out.println("25 Cents Coins: " + cents);
	}

}