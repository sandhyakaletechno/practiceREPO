package ArrayAssignment;

public class EqualityOfArray {

	static boolean compareArray() {
		int A[] = new int[] { 21, 57, 11, 37, 24 };
		int B[] = new int[] { 21, 57, 11, 37, 24 };
		int n = A.length;
		int m = B.length;
		if (n != m)
			return false;

		for (int i = 0; i < n; i++)

			if (A[i] != B[i])
				return false;

		return true;

	}

	public static void main(String[] args) {
		System.out.println(compareArray());
	}

}
