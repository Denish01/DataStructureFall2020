
package Trial;
import java.util.LinkedList;
import java.util.Scanner;
public class Temper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1(-2);
		T2(2);
		num(561344);
	}
	public static void T1(int C) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a conversion value");
		C = input.nextInt();
		int Celc = ((9*C)/5)+32;
		System.out.println(C + " Degree Celcious = "+Celc+" Drgree Farenheits");
	}
	public static void T2(int F) {
		Scanner input2 = new Scanner(System.in);
		F = input2.nextInt();
		int Far = (F-32)*5/9;	
		System.out.println(F + " Degree Farenheits = "+Far+" Drgree Celcious");
			
	}
	
	public static void num(int Num) {
		Scanner input3 = new Scanner(System.in);
		System.out.println("\nEnter an integer");
		Num = input3.nextInt();
		String output = String.valueOf(Num);
		
		for (int i = 0; i < output.length(); i++) {
			int j = Character.digit(output.charAt(i), 10);
			System.out.println("Outputs at index ("+ i +") = "+j);
		}
	}
}
