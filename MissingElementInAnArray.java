package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		// length of array
		int length = arr.length;
		System.out.println("The length of array is " + length);

		// sorting array
		Arrays.sort(arr);
		for (int j = 0; j < length; j++) {
			System.out.println("The Sorted array is " + arr[j]);
		}
		// missing element in the array
		for (int i = 1; i <= length + 1; i++) {

			if (i != arr[i - 1]) {
				System.out.println("The missing element in the array is " + i);
				break;
			}

		}

	}

}

