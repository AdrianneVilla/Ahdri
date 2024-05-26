package amountDue;

class AmountDue {

	public double computeAmountDue(double price) {
		
		double tax = price * 0.12  ;
		double totalDue = price + tax;
		return totalDue;
		
	}
	
	public double computeAmountDue(double price , int quantity) {
		
		double tax = price * 0.12;
		double totalDue = (price * quantity) + tax;
		return totalDue;
		
		
		
		
	}
	public double computeAmountDue(double price, int quantity, double discount) {
		
		double tax = price * 0.12;
	
		double totalDue = (price * quantity) - discount;
		totalDue = totalDue + tax;
		return totalDue;
		
		
		
	}

}
