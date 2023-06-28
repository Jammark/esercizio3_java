package esercizio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire un numero da 0 a 3...");
		int n = sc.nextInt();
		switch (n) {
		case 0: {
			System.out.println("Zero");
			break;
		}
		case 1: {
			System.out.println("Uno");
			break;
		}
		case 2: {
			System.out.println("Due");
			break;
		}
		case 3: {
			System.out.println("Tre");
			break;
		}
		default: {
			System.out.println("Errore numero inserito sconosciuto.");
		}
		}

	}

}
