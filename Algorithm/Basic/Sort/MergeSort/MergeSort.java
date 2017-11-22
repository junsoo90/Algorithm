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

	public static void merge(int arr[], int l, int mid, int r) {
		int[] temp = new int[arr.length]; // merge�� �迭�� ������� �ִ´� ( ����, ������ �迭 ��� ������ �ִ� ũ�⸸ŭ )

		int i = l; // ���� �迭 index
		int j = mid + 1; // ������ �迭 index
		int k = l; // ������ �迭 index

		while (i <= mid && j <= r) { // ���ؼ� temp�� �ִ´�
			if (arr[i] <= arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}

		// ���� �κ� ä���
		while (i <= mid)
			temp[k++] = arr[i++];
		while (j <= r)
			temp[k++] = arr[j++];

		// ���� �迭�� �ֱ�

		for (int t = l; t <= r; t++) {
			arr[t] = temp[t];
		}
	}
}
