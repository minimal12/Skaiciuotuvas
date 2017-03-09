import java.util.Scanner;

public class Rounding {
	Scanner reader = new Scanner(System.in);
	
	public void rounding(){    
		System.out.println("Type a number:");
		double sk = Double.parseDouble(reader.nextLine());
		sk = Math.round(sk * 100);
		sk = sk / 100;
		System.out.println("Rounded number value: " + sk);
	}
}
