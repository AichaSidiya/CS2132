package lab5q2;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class FindPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create two BigDecimal 22 and 7 for the value of pi
		BigDecimal number1 = new BigDecimal(22);
		BigDecimal number2 = new BigDecimal(7);
		
		//create a BigDecimal that divides 22 by 7 and store the result in pi with 200 decimal points
		BigDecimal pi = number1.divide(number2, 200, RoundingMode.CEILING);
		
		//print the value of pi
		System.out.println("\tThe value of PI is:");
		System.out.println("\t---------------------");
		System.out.println(pi);
		
		
		
	}

}
