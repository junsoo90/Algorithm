package SelectSort;

public class SelectSort {
	public static void main(String[] args) {

		int arr[] = { 5, 4, 6, 2, 7, 1, 3 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
