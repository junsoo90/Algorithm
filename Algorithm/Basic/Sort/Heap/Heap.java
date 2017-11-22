package Test;

public class Heap {

	int arr[];
	int totalcount;
	int usedSize;

	public Heap(int cnt) {
		arr = new int[cnt];
		totalcount = cnt;
		usedSize = 0;
	}

	public void insert(int data) {

		int currentindex = usedSize;
		int parentindex;
		arr[currentindex] = data;
		while (true) {
			parentindex = (currentindex - 1) / 2;

			if (arr[currentindex] < arr[parentindex]) {
				swap(arr, currentindex, parentindex);
			} else
				break;
			currentindex = parentindex;
		}
		usedSize++;
	}

	public void delete() {
		usedSize--;
		int currentindex = 0;
		int leftchild;
		int rightchild;
		
		swap(arr, currentindex, usedSize);
		
		System.out.println("arr[0] = "  + arr[0]);
		System.out.println("arr[usedSize] = "  + arr[usedSize]);
		
		while (true) {
			leftchild = currentindex * 2 + 1;
			rightchild = currentindex * 2 + 2;

			if (leftchild >= usedSize)
				break;
			else {
				if (rightchild >= usedSize) {
					if (arr[leftchild] < arr[currentindex]) {
						swap(arr, leftchild, currentindex);
						currentindex = leftchild;
					}
					else
						break;
				} 
				else {
					if (arr[leftchild] > arr[rightchild]) {
						if (arr[rightchild] < arr[currentindex]) {
							swap(arr, rightchild, currentindex);
							currentindex = rightchild;
						}
						
					}

					else {
						if (arr[leftchild] < arr[currentindex]) {
							swap(arr, leftchild, currentindex);
							currentindex = leftchild;
						}
					}
				}
			}

		}

	}


	public static void deleteHeap() {
		System.out.println(arr[0]);
		if (heapsize == 0) 
			return;
		
		int currentindex = 0;
		int leftchild = 1;
		int rightchild = 2;
		
		heapsize--;
		swap(arr, 0, heapsize);

		while (true) {
			int select = 0;
			if (leftchild >= heapsize)
				break;
			else if (rightchild >= heapsize)
				select = leftchild;
			else {
				if (arr[leftchild] > arr[rightchild])
					select = rightchild;
				else
					select = leftchild;
			}
			
			if(arr[select] < arr[currentindex]) {
				swap(arr, select, currentindex);
				currentindex = select;
			}
			else
				break;
			leftchild = currentindex * 2 + 1;
			rightchild = leftchild + 1;

		}
	
	}
	
	public void print() {
		int depth = 0;
		int position = 0;
		for (int i = 0; i < usedSize; i++) {
			if (position == i) {
				if (position != 0)
					System.out.println("");
				System.out.println("Depth : " + depth);
				position = position + (int) Math.pow(2, depth);
				depth += 1;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	public void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
