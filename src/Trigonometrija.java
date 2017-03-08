import java.util.Scanner;

public class Trigonometrija {
	Scanner reader = new Scanner(System.in);
	
	public Trigonometrija() {

	}
	
	public void sin(double s) {
		
		System.out.println("Skaiciaus " + s + " sinusas = " + Math.sin(s));
	}
	
	public void cos(double c) {
		System.out.println("Skaiciaus " + c + " cosinusas = " + Math.cos(c));
	}
	
	public void tng(double t) {
		System.out.println("Skaiciaus " + t + " tangentas = " + Math.tan(t));
	}
	
	public void ctg(double ct) {
		System.out.println("Skaiciaus " + ct + " cotangentas = " + 1.0 / Math.tan(ct));
	}
}
