package hello;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner ent = new Scanner(System.in);
		int n = ent.nextInt();
		printValues(n);
	}

	public static void printValues(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("" + i + " " + getSecond(i) + " " + getThird(i));
		}
	}

	public static int getSecond(int n) {
		return n * n;
	}

	public static int getThird(int n) {
		return n * n * n;
	}
}
