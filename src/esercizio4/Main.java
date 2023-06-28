package esercizio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire un numero...");
		int n = sc.nextInt();
		do {
			System.out.print(n-- + (n > -1 ? " - " : " "));
		} while (n >= 0);

	}

}
