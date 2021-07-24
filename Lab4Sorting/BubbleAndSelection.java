package Lab4;

/**
 * Sorting Arrays using two different sort methods
 * 
 * @author delizcolonj
 *
 */
public class Lab4 {
	/**
	 * Method to sort an array using Selection sort
	 * 
	 * @param array
	 */
	public static void SelectionSort(int[] array) {
		for (int i = 0; i <= array.length - 2; i++) {
			int min = i;
			for (int j = i + 1; j <= array.length - 1; j++) {// compares one index to the other to check which one is
																// smaller and replaces the minimum with the new smaller
																// value
				min = j;
			}
			int temp = array[min]; // if the next index is lower it swaps places with the current index position
			array[min] = array[i];
			array[i] = temp;

		}
	}

	/**
	 * Method to sort array using Bubble sort
	 * 
	 * @param array
	 */
	public static void BubbleSort(int[] array) {
		for (int i = 0; i <= array.length - 2; i++) {// Two pointers to compare value at A[j] and A[j + 1] and keeps
														// going until no more swaps are needed or the end of the array
			for (int j = 0; j <= array.length - 2 - i; j++) {
				if (array[j + 1] < array[j]) {// swaps places if A[j + 1] < A[j] because we want from least to greatest
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] example = { 5, 4, 3, 2, 1 };
		// int[] example2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		printArray(example);// before sorting
		SelectionSort(example);
		printArray(example);// after sorting

		// Uncomment to check bubble sort
		// printArray(example2);//before sorting
		// BubbleSort(example2);
		// printArray(example2);//after sorting

	}

}
