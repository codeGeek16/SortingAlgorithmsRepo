package com.ds;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String args[]) {
		int arrayToSort[] = { 5, 6, 2, 1, 4 };
		System.out.println("sorted Array =");
		int[] sortedarray = insertionSortArray(arrayToSort);
		for (int i = 0; i < sortedarray.length; i++) {
			System.out.println(sortedarray[i]);
		}

	}

	/**
	 * Insertion sort sorts the elements such that elements to the left of the
	 * insertion point are already sorted Best case complexity of O(n) in case
	 * all the elements are already sorted and hence the while loop is never
	 * looped Worst Case complexity of O(n^2) in case array is sorted in
	 * descending order so number of comparisons for each element before it
	 * finds its appropriate place in array is governed by n(n+1)/2 hence the
	 * order O(n^2)(number of comparisons for each element is equal to the
	 * position of the element and this forms a sequence of natural numbers
	 * hence the sum of this sequence is n(n+1)/2
	 */
	private static int[] insertionSortArray(int[] arrayToSort) {
		// this is the element where we start our comparison
		int key, pointer;
		for (int k = 1; k < arrayToSort.length; k++) {
			key = arrayToSort[k];
			pointer = k - 1;
			while (pointer >= 0 && key < arrayToSort[pointer]) {// added >=0 so
																// if we have
																// reached
																// starting of
																// array
																// means all
																// elements to
																// right are
																// already
																// larger than
																// key
				arrayToSort[pointer + 1] = arrayToSort[pointer];
				pointer = pointer - 1; // decrementing condition to go backwards
										// in comparison
			}
			arrayToSort[pointer + 1] = key;

		}

		return arrayToSort;
	}

}
