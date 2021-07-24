package Lab3;

import java.util.Random;

public class Lab3 {

	public static int SortAnalysis(int[] array) {
		int numberOfComparisons = 0;
		int v = 0, j = 0;

		for (int i = 0; i < array.length; i++) {
			v = array[i];

			j = i - 1;

			while (j >= 0 && array[j] > v) {
				array[j + 1] = array[j];
				numberOfComparisons++;

				j = j - 1;
				array[j + 1] = v;
				numberOfComparisons++;

			}
			numberOfComparisons++;

		}
		return numberOfComparisons;
	}

	public static int[] FillRandArray(int[] array, int n) {
		Random rand = new Random();
		array = new int[n];
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = rand.nextInt();
		}
		return array;
	}

	public static void print(int[] array) {// not used but can make algorithm towards the bottom more efficient
		for (int i : array)
			System.out.println(i + " ");
	}

	public static void main(String[] args) {
		int[] a = null;

		int[] b = { 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };// worst case array

		a = (FillRandArray(a, 1000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a)); // the amount of times the basic operation is performed

		a = (FillRandArray(a, 2000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 3000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 1000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 4000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 5000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 6000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 7000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 8000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 9000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 10000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 11000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 12000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 13000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 14000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 15000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 16000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 17000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 18000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 19000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		a = (FillRandArray(a, 20000));
		for (int i = 0; i <= a.length - 1; i++) {
			// System.out.println(a[i]);
		}
		System.out.println(SortAnalysis(a));

		System.out.println(SortAnalysis(b)); // worst case n^2
	}

}
