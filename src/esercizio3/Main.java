package esercizio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		while (!":q".equals(input)) {
			if (input.length() > 0) {
				String[] a = input.split("");
				for (int i = 0; i < a.length; i++) {
					if (i == a.length - 1) {
						System.out.print(a[i]);
						continue;
					}
					System.out.print(a[i] + ", ");
				}
				System.out.println();
			}
			System.out.println("Inserire una parola...");
			input = sc.nextLine();

		}

	}

}
