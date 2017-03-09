import java.util.Scanner;

public class SimpleCalculations {
	boolean on = true;
	Operations op = new Operations();
	Scanner reader = new Scanner(System.in);

	public void calculate() {
		while (on) {
			System.out.println("Type first number");
			int a = Integer.parseInt(reader.nextLine());
			System.out.println("Type second number");
			int b = Integer.parseInt(reader.nextLine());
			System.out.println("Choose action (+ - * /)");
			String c = reader.nextLine();
			switch (c) {
			case "+":
				System.out.println(a + " + " + b + " = " + op.add(a, b));
				on = false;
				break;
			case "-":
				System.out.println(a + " - " + b + " = " + op.subtract(a, b));
				on = false;
				break;
			case "*":
				System.out.println(a + " * " + b + " = " + op.multiply(a, b));
				on = false;
				break;
			case "/":
				System.out.println(a + " / " + b + " = " + op.divide(a, b));
				on = false;
				break;
			default:
				System.out.println("Wrong Choise");
				on = false;
				break;
			}
		}
	}
}
