import java.util.Scanner;

public class Trigonometrijos_Skaiciavimas {

	public static void main(String[] args) {
		boolean on = true;
		Trigonometrija trig = new Trigonometrija();
		Scanner reader = new Scanner(System.in);
		
		while(on) {
			System.out.println("Pasirinkite skaiciavimo metoda: 1 - sin; 2 - cos; 3 - tng; 4 - ctg;");
			String a = reader.nextLine();
			switch(a) {
			case "1":
				System.out.println("Iveskite skaiciu:");
				double s = Double.parseDouble(reader.nextLine());
				trig.sin(s);
				break;
			case "2":
				System.out.println("Iveskite skaiciu:");
				double c = Double.parseDouble(reader.nextLine());
				trig.cos(c);
				break;
			case "3":
				System.out.println("Iveskite skaiciu:");
				double t = Double.parseDouble(reader.nextLine());
				trig.cos(t);
				break;
			case "4":
				System.out.println("Iveskite skaiciu:");
				double ct = Double.parseDouble(reader.nextLine());
				trig.cos(ct);
				break;
			default:
				System.out.println("Blogas pasirinkimas");
				on = false;
				break;
			}
		}
		reader.close();
	}

}
