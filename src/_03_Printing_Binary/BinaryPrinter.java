package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		int i = (int)b;
		int x = 1;
		while (i >= x) {
			x = x * 2;
		}
		int y = (int) (Math.log(x) / Math.log(2));
		x = x / 2;
	//	System.out.println(x);
		String c = "";
		
		while(i!=0) {
			if(i>=x) {
				c+="1";
				i=i-x;
				x=x/2;
		}
			else {
				c+="0";
				x=x/2;
				
			}
		}
		
		while(c.length()!=y) {
			c+="0";
		}
			System.out.println(c);


		
	}
	
	public void printShortBinary(short s) {
		int i = (int)s;
		int x = 1;
		while (i >= x) {
			x = x * 2;
		}
		int y = (int) (Math.log(x) / Math.log(2));
		x = x / 2;
	//	System.out.println(x);
		String c = "";
		
		while(i!=0) {
			if(i>=x) {
				c+="1";
				i=i-x;
				x=x/2;
		}
			else {
				c+="0";
				x=x/2;
				
			}
		}
		
		while(c.length()!=y) {
			c+="0";
		}
			System.out.println(c);


	}
	
	public void printIntBinary(int i) {
		int x = 1;
		while (i >= x) {
			x = x * 2;
		}
		int y = (int) (Math.log(x) / Math.log(2));
		x = x / 2;
	//	System.out.println(x);
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
		
		while(b.length()!=y) {
			b+="0";
		}
			System.out.println(b);

		
		}
	
	
	public void printLongBinary(long l) {
		int i= (int)l;
		int x = 1;
		while (i >= x) {
			x = x * 2;
		}
		int y = (int) (Math.log(x) / Math.log(2));
		x = x / 2;
	//	System.out.println(x);
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
		
		while(b.length()!=y) {
			b+="0";
		}
			System.out.println(b);


	}
	public static void main(String[] args) {
		BinaryPrinter b = new BinaryPrinter();
		b.printIntBinary(157);
		b.printLongBinary(34);
		b.printByteBinary((byte)6);
		b.printShortBinary((short)134);
	
	}
}
