import java.util.Scanner;

public class Trigonometrija {
	Scanner reader = new Scanner(System.in);
	
	public void sin() {
		System.out.println("Type a number:");
		int sk = Integer.parseInt(reader.nextLine());
		System.out.println("Number: " + sk + " SIN = " + Math.sin(sk));
	}
	
	public void cos(){
		System.out.println("Type a number:");
		int sk = Integer.parseInt(reader.nextLine());
		System.out.println("Number: " + sk + " COS = " + Math.cos(sk));
	}
	
	public void tg(){
		System.out.println("Type a number:");
		int sk = Integer.parseInt(reader.nextLine());
		System.out.println("Number: " + sk + " TG = " + Math.tan(sk));
	}
	
	public void ctg(){
		System.out.println("Type a number:");
		int sk = Integer.parseInt(reader.nextLine());
		System.out.println("Number: " + sk + " CTG = " + Math.cos(sk)/Math.sin(sk));
	}
}