package MergeSort;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
		mergeSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void mergeSort(int arr[], int l, int r) {

		if (l >= r)
			return;
		int mid = (l + r) / 2;
		mergeSort(arr, l, mid);
		mergeSort(arr, mid + 1, r);
		merge(arr, l, mid, r);

	}

	public static void merge(int arr[], int left, int mid, int right) {
		int temp[] = new int[arr.length];
		int l = left;
		int r = mid;
		int t = left;

		while (l < mid && right > r) {
			if (arr[l] < arr[r])
				temp[t++] = arr[l++];
			else
				temp[t++] = arr[r++];
		}

		while (l < mid)
			temp[t++] = arr[l++];
		while (r < right)
			temp[t++] = arr[r++];

		for (int i = left; i < right; i++)
			arr[i] = temp[i];

	}

}
