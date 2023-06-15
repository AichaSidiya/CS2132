package lab5q1;

import java.math.BigDecimal;

public class SquareNumbers
{
	public static void main(String[] args)
	{
		//create a BigDecimal holding the Long.MAX_VALUE
		BigDecimal number = new BigDecimal(Long.MAX_VALUE);
		//create a BigDecimal holding the square root of the Long.MAX_VALUE to find the first 10 squared values greater than Long.MAX_VALUE
		long first = (long) Math.sqrt(Long.MAX_VALUE);
		BigDecimal number2 = new BigDecimal(first);
		
		System.out.println("\tThese are the first ten square numbers greater than Long.MAX_VALUE: ");
		System.out.println("\t---------------------------------------------------------------------");
		for(int i = 0; i <= 10; i++) {
			//square number2
			BigDecimal squared = number2.multiply(number2);
			//compare number2 and Long.MAX_VALUE
			if(squared.compareTo(number) > 0)
			{
				//print the first 10 squared values greater than Long.MAX_VALUE
				System.out.println("Number " + i + ": " + number2 + " squared = " + squared + " is greater than Long.MAX_VALUE");
			}
			number2 = number2.add(BigDecimal.ONE);
		}
	}
}
