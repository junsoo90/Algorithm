
import java.util.Scanner;

public class Main_1475 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int input = in.nextInt();

		int result = 0;
		int arr[] = new int[10];

		int temp = input;

		while (temp != 0) {
			int wei = temp % 10;
			if (wei == 9)
				arr[6]++;
			else
				arr[wei]++;

			temp = temp / 10;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				if (i == 6)
					result += 2;
				else
					result++;
			}
		}
		System.out.println(result);
	}

}
