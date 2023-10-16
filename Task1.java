package lab4;

public class Task1 {
	// Task1.1
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}

		}

	}

	// Task1.2
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean isSorted = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					isSorted = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
			if (isSorted) {
				break;
			}

		}

	}

//Task 1.3
	public static void insertionSort(int[] array) {
		int n = array.length;
		for (int i = 1; i < n; i++) {
			int ai = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] < ai) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = ai;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 7, 1, 9, 2 };
		selectionSort(arr);
		System.out.print("Sort selections in descending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		bubbleSort(arr);
		System.out.print("\nSort bubble in descending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		insertionSort(arr);
		System.out.print("\nSort insertion in descending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
