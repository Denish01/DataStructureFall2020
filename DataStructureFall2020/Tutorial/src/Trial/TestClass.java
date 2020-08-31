package Trial;

import java.util.Scanner;
public class TestClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will display for you the\ntotal carpet cost for the room in detail\n");
		
		System.out.println("Enter the room lenth\n");
		double length = input.nextDouble();
		
		System.out.println("Enter the room width\n");
		double width = input.nextDouble();
		
		System.out.println("Enter Carpet Cost per square feet\n");
		double CarpetCost = input.nextDouble();
		
		RoomDimension dim = new RoomDimension(length, width);
		CarpetSize required = new CarpetSize(dim, CarpetCost);
		
		System.out.println(required);

	}

}
