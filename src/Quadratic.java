import java.util.Scanner;

public class Quadratic {
	
	public void quadraticCalculation(){
		double x1, x2, d;
		int a, b, c;
		Scanner reader = new Scanner(System.in);
		System.out.println("Type number a:");
		a = Integer.parseInt(reader.nextLine());
		if (a == 0) {
			System.out.println("Coefficient a = 0, Equation not quadratic");
		} else {
			System.out.println("Type number b:");
			b = Integer.parseInt(reader.nextLine());
			System.out.println("Type number c:");
			c = Integer.parseInt(reader.nextLine());
			reader.close();
			d = Math.pow(b, 2) - 4 * a * c;
			if (d >= 0) {
				x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
				x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
				System.out.println("Coefficient a: " + a);
				System.out.println("Coefficient b: " + b);
				System.out.println("Coefficient c: " + c);
				System.out.println("Solutions of the equation: " + x1 + " and " + x2);
			} else {
				System.out.println("Coefficient a: " + a);
				System.out.println("Coefficient b: " + b);
				System.out.println("Coefficient c: " + c);
				System.out.println("Equation dont have any solutions");
			}
		}
	}
}
