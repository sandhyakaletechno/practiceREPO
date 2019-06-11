package ArrayAssignment;

import java.util.Scanner;

public class ReverseOddNoWordInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("give your String:");
		String s1 = sc.nextLine();

		String[] s2 = s1.split(" ");

		for (int i = 0; i < s2.length; i++) {
			if (i % 2 != 0) {
				char s3[] = s2[i].toCharArray();
				for (int j = s3.length - 1; j >= 0; j--) {
					System.out.print(s3[j]);
				//System.out.print(" ");
				}
				System.out.print(" ");
			} else
				System.out.print(s2[i]+" ");
		}

	}
}
