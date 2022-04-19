package week1.day2.assignments;

public class FindInterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		int len1 = arr1.length;

		for (int i = 0; i < len1; i++) {

			for (int j = 0; j < len1; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}

	}

}
