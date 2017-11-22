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
		int[] temp = new int[arr.length]; // merge한 배열을 순서대로 넣는다 ( 왼쪽, 오른쪽 배열 모두 넣을수 있는 크기만큼 )

		int i = l; // 왼쪽 배열 index
		int j = mid + 1; // 오른쪽 배열 index
		int k = l; // 정렬할 배열 index

		while (i <= mid && j <= r) { // 비교해서 temp에 넣는다
			if (arr[i] <= arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}

		// 남은 부분 채우기
		while (i <= mid)
			temp[k++] = arr[i++];
		while (j <= r)
			temp[k++] = arr[j++];

		// 원래 배열에 넣기

		for (int t = l; t <= r; t++) {
			arr[t] = temp[t];
		}
	}
}
