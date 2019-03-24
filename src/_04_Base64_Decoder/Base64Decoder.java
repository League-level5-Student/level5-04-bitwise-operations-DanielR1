package _04_Base64_Decoder;

import java.io.BufferedReader;
import java.io.FileReader;

public class Base64Decoder {
	/*
	 * Base 64 is a way of encoding binary data using text.
	 * Each number 0-63 is mapped to a character. 
	 * NOTE: THIS IS NOT THE SAME AS ASCII OR UNICODE ENCODING!
	 * Since the numbers 0 through 63 can be represented using 6 bits, 
	 * every four (4) characters will represent twenty four (24) bits of data.
	 * 4 * 6 = 24
	 * 
	 * For this exercise, we won't worry about what happens if the total bits being converted
	 * do not divide evenly by 24.
	 * 
	 * If one char is 8 bits, is this an efficient way of storing binary data?
	 * (hint: no)
	 * 
	 * It is, however, useful for things such as storing media data inside an HTML file (for web development),
	 * so that way a web site does not have to look for an image, sound, library, or whatever in a separate location.
	 * 
	 * View this link for a full description of Base64 encoding
	 * https://en.wikipedia.org/wiki/Base64
	 */
	
	
	final static char[] base64Chars = {
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
		'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
		'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'
	};
	
	//1. Complete this method so that it returns the the element in
	//   the base64Chars array that corresponds to the passed in char.
	public static byte convertBase64Char(char c){
		int x=0;
		for (int i = 0; i < base64Chars.length; i++) {
			if(base64Chars[i]==c) {
				x=i;
			}
		}
		return (byte)x;
	}
	
	//2. Complete this method so that it will take in a string that is 4 
	//   characters long and return an array of 3 bytes (24 bits). The byte 
	//   array should be the binary value of the encoded characters.
	public static byte[] convert4CharsTo24Bits(String s){
		String cb="";
		char [] stringChars = s.toCharArray();
		for (int i = 0; i < stringChars.length; i++) {
			int x=indexOfCharArray(base64Chars, stringChars[i]);
			cb+=returnIntBinary(x);
		}
			byte[] r =new byte[3];
			for (int i = 0; i < 3;i++) {
				//System.out.println(cb.substring(8*i,8*i+8));
				r[i]=(byte)Integer.parseInt(cb.substring(8*i, 8*i+8),2);
			}
			
		
		
		return r;
	}
	
	//3. Complete this method so that it takes in a string of any length
	//   and returns the full byte array of the decoded base64 characters.
	public static byte[] base64StringToByteArray(String file) {
		String cb="";
		char [] stringChars = file.toCharArray();
		for (int i = 0; i < stringChars.length; i++) {
			int x=indexOfCharArray(base64Chars, stringChars[i]);
			//System.out.println(returnIntBinarySix(43));
			cb+=returnIntBinarySix(x);
	
			
		}
			byte[] r =new byte[(stringChars.length*3)/4];
			System.out.println(r.length);
			System.out.println(cb.length());
			for (int i = 0; i < r.length;i++) {
				r[i]=(byte)Integer.parseInt(cb.substring(8*i, 8*i+8),2);
				//System.out.println(r[i]);
			}
			
		
		
		return r;
	}
	public static int indexOfCharArray(char[] c, char index) {
		int x=0;
		for (int i = 0; i < c.length; i++) {
			if(c[i]==index) {
				x=i;
			}
			
		}
		return x;
	}
	public static String returnIntBinary(int i) {
		int x = 1;
		String b = "";
		while (i >= x) {
			x = x * 2;
		}
		int y = (int) (Math.log(x) / Math.log(2));
		int ex=6-y;
		for (int j = 0; j < ex; j++) {
			b+="0";
			//System.out.println("1");
		}
		x = x / 2;
	//	System.out.println(x);
		
		
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
		
		while(b.length()<y) {
			b+="0";
			//System.out.println(b);
		}
			return b;

		
		}
	public static String returnIntBinarySix(int i) {
		String r = "";
		int x=32;
		for (int j = 0; j < 6; j++) {
			if(i>=x) {
				r+=1;
				x=x/2;
				i-=Math.pow(2,5-j);
			}
			else {
				r+=0;
				x=x/2;
			
			}
		}
		return r;
	}
	public static int binaryToInteger(String binary) {
	    char[] numbers = binary.toCharArray();
	    int result = 0;
//	    for(int i=numbers.length - 1; i>=0; i--) {
//	        if(numbers[i]=='1')
//	            result += Math.pow(2, (numbers.length-i - 1));
//	    }
	    for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==1) {
				result+=Math.pow(2, numbers.length-i-1);
			}
		}
	    return result;
	}
	
}
