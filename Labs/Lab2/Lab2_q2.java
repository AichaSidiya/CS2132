package secondprogram;

public class Lab2_q2 {

	public static void main(String[] args) {
		final double numberOfSecondsInYear = 365 * 24 * 60 * 60; //constant for number of seconds in a year
		
		final double totalBirth = numberOfSecondsInYear / 7.0; //constant for total number of birth per year 
		final double totalDeaths = numberOfSecondsInYear / 13.0; //constant for total number of deaths per year
		final double totalImigrants = numberOfSecondsInYear / 45.0; //constant for total number of immigrant per year
		
		final double totalGrowth = totalBirth +  totalImigrants - totalDeaths; //constant for total growth 
		
		// population of each year 
		double firstYear = 312032486 + totalGrowth;
		double secondYear = 312032486 + totalGrowth * 2;
		double thirdYear = 312032486 + totalGrowth * 3;
		double fourthYear = 312032486 + totalGrowth * 4;
		double fifthYear = 312032486 + totalGrowth * 5;
		
		//printing out the result 
		System.out.println("First Year: " + String.format("%.0f",firstYear));
		System.out.println("Second Year: " + String.format("%.0f",secondYear));
		System.out.println("Third Year: " + String.format("%.0f", thirdYear));
		System.out.println("Fourth Year: " + String.format("%.0f", fourthYear));
		System.out.println("Fifth Year: " + String.format("%.0f", fifthYear));
	}

}
