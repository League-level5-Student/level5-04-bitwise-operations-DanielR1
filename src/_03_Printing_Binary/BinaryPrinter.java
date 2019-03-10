package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public void printIntBinary(int i) {
		int x = 1;
		while (i >= x) {
			x = x * 2;
		}
		x = x / 2;
		System.out.println(x);
		String b = "";
		while(i!=0) {
			if(i>=x) {
				b+="1";
				i=i-x;
				x=x/2;
		}
			else {
				b+="0";
				x=x/2;
				
			}
		}
			System.out.println(b);
		//System.out.println(x);
		int y = (int) (Math.log(x) / Math.log(2));
		int binary = 0;
//		int[] a = new int[y + 1];
//		for (int j = y; j > -1; j--) {
//			a[j] = (int) Math.pow(2, j);
//		}
//		int temp = 0;
//		for (int j = y; j > -1; j--) {
//			if (i >= x) {
//				binary += Math.pow(10, j);
//				temp = x;
//				x = (int) (x + x / Math.pow(2, y - j + 1));
//				// System.out.println(x);
//			} else {
//				x = temp;
//				// System.out.println(x);
//				x = (int) (x + x / Math.pow(2, y - j + 1));
//			}
		//System.out.println(Integer.toBinaryString(i));
		
		}
	
	
	public void printLongBinary(long l) {
		
	}
	public static void main(String[] args) {
		BinaryPrinter b = new BinaryPrinter();
		b.printIntBinary(256);
	}
}
