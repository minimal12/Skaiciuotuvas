import java.util.Scanner;

public class SimpleCalculations {
	boolean on = true;
	Operations op = new Operations();
	Scanner reader = new Scanner(System.in);

	public void calculate() {
		while (on) {
			System.out.println("Iveskite pirma skaiciu");
			int a = Integer.parseInt(reader.nextLine());
			System.out.println("Iveskite antra skaiciu");
			int b = Integer.parseInt(reader.nextLine());
			System.out.println("Iveskite veiksma (+ - * /)");
			String c = reader.nextLine();
			switch (c) {
			case "+":
				System.out.println(a + " + " + b + " = " + op.add(a, b));
				break;
			case "-":
				System.out.println(a + " - " + b + " = " + op.subtract(a, b));
				break;
			case "*":
				System.out.println(a + " * " + b + " = " + op.multiply(a, b));
				break;
			case "/":
				System.out.println(a + " / " + b + " = " + op.divide(a, b));
				break;
			default:
				System.out.println("Blogas pasirinkimas");
				on = false;
				break;
			}
		}
	}
}
