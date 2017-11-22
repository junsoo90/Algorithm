package BubbleSort;

public class BubbleSort {
	public static void main(String[] args) {

		int arr[] = { 5, 4, 6, 2, 7, 1, 3 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j+1] < arr[j]) {
					
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
