package hello;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        Scanner ent = new Scanner(System.in);
        int n = ent.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("" + i + " " + calculator.getSecond(i) + " " + calculator.getThird(i));
        }
    }
}