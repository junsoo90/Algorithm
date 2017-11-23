package InsertSort;

public class InsertSort {
	public static void main(String[] args) {

		int arr[] = { 5, 4, 6, 2, 7, 1, 3 };
		int i, j, temp;
		/*
		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > temp)
					arr[j + 1] = arr[j];
				else {
					break;
				}
			}
			arr[j + 1] = temp;
		}
		 */
		
		for(i=1; i<arr.length; i++) {
			for(j=i-1; j>=0; j--) {
				if(arr[j+1] < arr[j]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++)
			System.out.println(arr[k]);
	}
}
