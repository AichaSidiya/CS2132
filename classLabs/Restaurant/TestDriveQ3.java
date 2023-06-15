package restaurant;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestDriveQ3 {

	public static void main(String[] args) 
	{
//		// TODO Auto-generated method stub
		System.out.println("------------\tWelcome to Rise and Shine Restaurant\t--------------------");
		
		Scanner input = new Scanner(System.in);
		
		//inputting the data for object 1
		System.out.print("Enter the first item name: ");
		String itemName1 = input.nextLine();
		System.out.print("Enter the first item description: ");
		String description1 = input.nextLine();
		System.out.print("Enter the first item price: ");
        double price1 = input.nextDouble();
        
        input.nextLine();
      //inputting the data for object 2
        System.out.print("Enter the second item name: ");
		String itemName2 = input.nextLine();
		System.out.print("Enter the second item price: ");
        double price2 = input.nextDouble();
        
        //creating object 1 and 2 of the Menu class
        Menu item1 = new Menu(itemName1, description1, price1);
        Menu item2 = new Menu(itemName2, price2);
        
        //displaying the output in JOptionPane
        JOptionPane.showMessageDialog(null, item1.itemName + "    " + item1.price + " SAR"+ "\n" + "------------------------------------------------------------------------------------------------------------\n" + item1.description);
        JOptionPane.showMessageDialog(null, item2.itemName + "    " + item2.price + " SAR");
        
        //inputing the rating for object 1 and 2
        System.out.print("Please rate the first item: ");
        double rate = input.nextDouble();
        item1.setRating(rate);
        
        System.out.print("Please rate the second item: ");
        double rate2 = input.nextDouble();
        item2.setRating(rate2);
        
        //if statement that outputs the rating and Best Seller if isBestSeller is true. 
        if(item1.isBestSeller())
        {
        	JOptionPane.showMessageDialog(null, item1.itemName + "    " + item1.getRating() + " BEST SELLER");
        }
        else
        {
        	JOptionPane.showMessageDialog(null, item1.itemName + "    " + item1.getRating());
        }
        
        if(item2.isBestSeller())
        {
        	JOptionPane.showMessageDialog(null, item2.itemName + "    " + item2.getRating()+ " BEST SELLER");
        }
        else
        {
        	JOptionPane.showMessageDialog(null, item2.itemName + "    " + item2.getRating());
        } 
        
        input.close();
        
        JOptionPane.showMessageDialog(null, "Thank You for visiting our restaurant!");
	}

}
