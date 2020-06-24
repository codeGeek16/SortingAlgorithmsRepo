package com.ds;

public class MergeSort {

	public static void main(String args[]) {
		int arrayToSort[] = { 5, 6, 2, 1, 4 };
		System.out.println("sorted Array =");
		int[] sortedarray = mergeSortArray(arrayToSort, 0, arrayToSort.length);
		for (int i = 0; i < sortedarray.length; i++) {
			System.out.println(sortedarray[i]);
		}

	}

	private static int[] mergeSortArray(int[] arrayToSort, int start, int end) {
		if (start != end) {
			int mid = (start + end) / 2;
			mergeSortArray(arrayToSort, start, mid);
			mergeSortArray(arrayToSort, mid + 1, end);
			arrayToSort = merge(arrayToSort, start, mid, mid + 1, end);
		}

		return arrayToSort;
	}

	private static int[] merge(int[] arrayToSort, int firstArrayStart, int firstArrayEnd, int secondArrayStart,
			int secondArrayEnd) {

		int[] auxArr = new int[(firstArrayEnd - firstArrayStart) + (secondArrayEnd - secondArrayStart) + 2];

		int i, j, k;
		for (i = firstArrayStart, j = secondArrayStart, k = firstArrayStart; i <= firstArrayEnd && j <= secondArrayEnd; k++) {

			if (arrayToSort[i] < arrayToSort[j]) {
				auxArr[k] = arrayToSort[i];
				i++;
			} else {
				auxArr[k] = arrayToSort[j];
				j++;
			}
		}

		if (i == firstArrayEnd + 1)
			for (; j <= secondArrayEnd; j++)
				auxArr[j] = arrayToSort[j];
		else
			for (; i <= firstArrayEnd; i++)
				auxArr[i] = arrayToSort[i];

		for(int auxI = firstArrayStart; auxI< auxArr.length; auxI++)
			arrayToSort[auxI] = auxArr[auxI];
		return arrayToSort;
	}
}
