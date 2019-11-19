public class Money {
	private int dollars;
	private int cents;
	
	public Money(int dollars, int cents) {
		this.dollars = dollars;
		this.cents = cents;
		normalize(); //Normalize the amount
	}
	public int getDollars() {
		return dollars;
	}
	
	public int getCents() {
		return cents;
	}
	
	public void setCents(int cents) {
		this.cents = cents;
	}
	
	public Money() {
		this.dollars = 0;
		this.cents = 0;
	}
	
	public Money add(Money m) {
		int totalInCents = (this.dollars * 100 + this.cents) + (m.dollars * 100 +m.cents); // Converts both money to cents and add them
		Money result = ConvertCentsToMoney(totalInCents); //Convert cents to dollars and cents
		
		return result;
	}
	
	public Money subtract(Money m) {
		int totalInCents = (this.dollars * 100 + this.cents) - (m.dollars * 100 + m.cents); //Convert both the money to cents and subtract them
		Money result = ConvertCentsToMoney(totalInCents); //Convert cent to dollar and cents
		
		return result;
	}
	
	public Money multiply(int m) {
		int totalInCents = (this.dollars * 100 + this.cents) * m; //Convert money to cents and multiply by m
		Money result = ConvertCentsToMoney(totalInCents); //Convert cents to dollars and cents
		
		return result;
	}
	
	public static Money[] multiply(Money[] moneys, int amt) {
		Money result[] = new Money[moneys.length]; //Array to store result
		for(int i = 0; i < moneys.length; i++) {
			int totalInCents = moneys[i].dollars*100 + moneys[i].cents; //Convert each money to cents
			int newAmountInCents = totalInCents * amt; //Multiple total in cents by amt
			result[i] = ConvertCentsToMoney(newAmountInCents); //Convert cents to dollar and cents
		}
		return result;
	}
	
	public boolean equals(Money money) {
		return (this.dollars == money.dollars && this.cents == money.cents); //Return true if bot dollar and cents of both object matches
	}
	
	public String toString() {
		String money = this.dollars + "." + this.cents; //Converts money object to its String Representation
		return money;
	}
	
	private void normalize() {
		// If cents value if more than 100, converts cents to dollar and cents
		if(this.cents >= 100) {
			this.dollars = this.dollars +(this.cents/100);
			this.cents = this.cents % 100;
		}
	}
	private static Money ConvertCentsToMoney(int cents) {
		
		int dollars = cents / 100; // Dollar amount of cents value
		int cent = cents % 100; // Cent amount of cents value
		Money money = new Money(dollars, cents);
		return money;
	}
}
