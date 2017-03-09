import java.util.Scanner;

public class TrigoCalculate {
	boolean on = true;
	Trigonometrija t = new Trigonometrija();
	Scanner reader = new Scanner(System.in);
	
		public void calculate() {
			while (on) {
				System.out.println("Choose action");
				System.out.println("1. Sin");
				System.out.println("2. Cos");
				System.out.println("3. Tg");
				System.out.println("4. Ctg");
				int a = Integer.parseInt(reader.nextLine());
				switch (a) {
				case 1:
					t.sin();
					on = false;
					break;
				case 2:
					t.cos();
					on = false;
					break;
				case 3:
					t.tg();
					on = false;
					break;
				case 4:
					t.ctg();
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
