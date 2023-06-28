package ifelse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire una parola...");
		String s = sc.nextLine();
		System.out.printf("La lunghezza della parila è %s", stringaPariDispari(s) ? "pari" : "dispari");
		System.out.println();
		System.out.println("Inserire un anno...");
		int anno = sc.nextInt();
		System.out.printf(annoBisestile(anno) ? "%d è un anno bisestile" : "%d non è un anno bisestile", anno);

	}

	public static boolean stringaPariDispari(String s) {
		return s.length() % 2 == 0;
	}

	public static boolean annoBisestile(int anno) {
		if (anno % 4 == 0) {
			if (anno % 100 == 0 && anno % 400 == 0) {
				return true;
			} else if (anno % 100 == 0) {
				return false;
			} else {
				return true;
			}

		} else {
			return false;
		}
	}
}
