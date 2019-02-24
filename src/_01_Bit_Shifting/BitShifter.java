package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		int numShifted = num << 1;
		numShifted = 43;
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		int x = 1;
		while (numShifted >= x) {
			x = x * 2;
		}
		x = x / 2;
		System.out.println(x);
		int y = (int) (Math.log(x) / Math.log(2));
		int binary = 0;
		int[] a = new int[y + 1];
		for (int i = y; i > -1; i--) {
			a[i] = (int) Math.pow(2, i);
		}
		int temp = 0;
		for (int i = y; i > -1; i--) {
			if (numShifted >= x) {
				binary += Math.pow(10, y);
				temp = x;
				x = (int) (x + x / Math.pow(2, y - i + 1));
				// System.out.println(x);
			} else {
				x = temp;
				// System.out.println(x);
				x = (int) (x + x / Math.pow(2, y - i + 1));
			}

		}
		System.out.println(binary);
		// System.out.println(binary);
		// 3. Compare the two binary values. Can you figure out what the << operator is
		// for?

		// 4. Try shifting num 3 places.

		// FYI: Binary values can be shifted to the right as well using the >> operator.
	}
}
