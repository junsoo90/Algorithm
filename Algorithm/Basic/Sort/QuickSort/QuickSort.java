package QuickSort;

public class QuickSort {
	public static void main(String[] args) {

		int arr[] = { 5, 7, 2, 1, 20, 8, 3 };
		quickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	static void quickSort(int arr[], int left, int right) {

		int l = left;
		int r = right;
		int pivot = (left + right) / 2;

		while (l < r) {
			while (arr[l] < arr[pivot])
				l++;
			while (arr[r] > arr[pivot])
				r--;

			if (l > r) {
				break;
			}
			swap(arr, l, r);
		}
		if (left < pivot)
			quickSort(arr, left, r - 1);
		if (pivot < right)
			quickSort(arr, l + 1, right);

	}

	static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
