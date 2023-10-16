package lab4;

public class Task2 {

	public static void mergeSort(int[] array) {
		if (array.length < 2) {
			return;
		}

		int mid = array.length / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[array.length - mid];

		System.arraycopy(array, 0, leftArray, 0, mid);
		System.arraycopy(array, mid, rightArray, 0, array.length - mid);

		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(array, leftArray, rightArray, true);
	}

	private static void merge(int[] array, int[] leftArray, int[] rightArray, boolean isDescending) {
		int leftLength = leftArray.length;
		int rightLength = rightArray.length;
		int i = 0, j = 0, k = 0;

		while (i < leftLength && j < rightLength) {
			if (isDescending) {
				if (leftArray[i] >= rightArray[j]) {
					array[k++] = leftArray[i++];
				} else {
					array[k++] = rightArray[j++];
				}
			} else {
				if (leftArray[i] <= rightArray[j]) {
					array[k++] = leftArray[i++];
				} else {
					array[k++] = rightArray[j++];
				}
			}
		}

		while (i < leftLength) {
			array[k++] = leftArray[i++];
		}

		while (j < rightLength) {
			array[k++] = rightArray[j++];
		}
	}

	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(array, low, high);
			quickSort(array, low, pivotIndex - 1); 
			quickSort(array, pivotIndex + 1, high); 
		}
	}

	private static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (array[j] >= pivot) {
				i++;

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {
		int[] array = { 3, 1, 5, 8, 7, 9 };
		quickSort(array);
		System.out.print("Quick sort descending order: ");
		for (int num : array) {
			System.out.print(num + " ");

		}
		mergeSort(array);
		System.out.print("\nMerge sort descending order: ");
		for (int num : array) {
			System.out.print(num + " ");

		}

	}
}
