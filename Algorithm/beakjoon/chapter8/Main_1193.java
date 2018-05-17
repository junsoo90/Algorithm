package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(in.readLine());

		int sum = 1, x, y, level = 1, dif;

		while (sum < input) {
			level++;
			sum += level;
		}

		dif = sum + 1 - input;

		if (level % 2 == 0) {
			System.out.println((level + 1 - dif) + "/" + dif);
		}

		else {
			System.out.println(dif + "/" + (level + 1 - dif));
		}
	}

}
