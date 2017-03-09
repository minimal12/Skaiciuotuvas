import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SimpleCalculations sc = new SimpleCalculations();
		TrigoCalculate tc = new TrigoCalculate();
		Quadratic qc = new Quadratic();
		Rounding rc = new Rounding();
		Menu m = new Menu();
		boolean on = true;
		int menu = 0;
		Scanner reader = new Scanner(System.in);
		
		while (on) {
			if (menu == 0) {
				m.printMenu();
				menu = Integer.parseInt(reader.nextLine());
			}
			switch (menu) {
			case 1:
				sc.calculate();
				menu = 0;
				break;
			case 2:
				tc.calculate();
				menu = 0;
				break;
			case 3:
				qc.quadraticCalculation();
				menu = 0;
				break;
			case 4:
				rc.rounding();
				menu = 0;
				break;
			case 5:
				System.out.println("Work in progress!");
				System.out.println("Its alpha. Give us a break!");
				menu = 0;
				break;
			case 6:
				System.out.println("Disconected");
				on = false;
				break;
			default:
				System.out.println("Wrong Choise");
				on = false;
				break;
			}
		}
		reader.close();
	}
}
