package Algorithm.Basic.QuickSort;

public class QuickSort {
    public static void main(String[] args) {
        //int arr[] = {5, 7, 2, 20, 1, 8, 3};
        int arr[] = {5, 7, 2, 1, 20 ,8 ,3};
        quickSort(arr, 0, arr.length - 1);
        //QuickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void QuickSort(int arr[], int left, int right) {
        int L = left, R = right;
        int temp;
        int pivot = arr[(left + right) / 2]; //피봇 위치(중앙)의 값을 받음.

        //아래의 while문을 통하여 pivot 기준으로 좌, 우 크고 작은 값 나열. = Partition
        while (L <= R) {
            //pivot이 중간 값이고, 비교 대상 arr[L], arr[R]은 pivot과 비교하니 중간 지점을 넘어가면 종료로 볼 수 있음.
            while (arr[L] < pivot) //left부터 증가하며 pivot 이상의 값을 찾음.
                L++;
            while (arr[R] > pivot) //right부터 감소하며 pivot 이하 값을 찾음.
                R--;
            //L, R 모두 최대 pivot 위치까지 이동.
            if (L <= R) { //현재 L이 R이하면. (이유 : L>R 부분은 이미 정리가 된 상태임).
                if (L != R) { //같지 않은 경우만.
                    temp = arr[L];
                    arr[L] = arr[R];
                    arr[R] = temp;
                } //L과 R이 같다면 교환(SWAP)은 필요 없고 한 칸씩 진행만 해주면 됨.
                L++;
                R--; //그리고 L,R 한 칸 더 진행.

            }
        }
        if (left < R)
            QuickSort(arr, left, R);
        if (L < right)
            QuickSort(arr, L, right);
    }


    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[ (l + r) / 2 ];

        for (int i = 0; i < arr.length; i++) { //데이터 확인 부분.
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        while (l < r) {
            while (arr[l] < pivot)
                l++;
            while (arr[r] > pivot)
                r--;
            if (l <= r) {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        if (left < r)
            quickSort(arr, left, r);
        if (l < right)
            quickSort(arr, l, right);

    }

    /*public static int partition(int[] arr, int left, int right){

    }*/

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
