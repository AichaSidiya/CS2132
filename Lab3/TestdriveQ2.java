package lab3q2;

public class TestdriveQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating Stock object for Oracle Corporation 
		Stock s = new Stock("ORCL", "Oracle Corporation");
		s.previousClosingPrice = 34.5;
		s.currentPrice = 34.35;
		
		// printing the info of the Stock object s
		System.out.print("\t" + s.symbol + " " + s.name + " " + "\t");
		System.out.printf("%.2f", s.getChangePrice());
		System.out.println("%");
		System.out.println("Current Price: " + s.currentPrice);
		System.out.printf("Change: %.2f" , s.getChangePrice());
		System.out.println("\nPrevious Close: " + s.previousClosingPrice);
		
	}

}
