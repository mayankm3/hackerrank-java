package solutions2.medium;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner inp = new Scanner(System.in);
		byte[] myBytes = inp.nextLine().getBytes();
		
		//Just to see
		/*
		for (byte b : myBytes) {
			System.out.println(b);
		}
		*/
		
		MessageDigest msgDig = MessageDigest.getInstance("SHA-256");
		msgDig.update(myBytes);
		
		byte[] barr = msgDig.digest();
		for (byte b : barr) {
			System.out.printf("%02x",b);	//%[flags][width]conversion.
											//Flag '0' - The result will be zero-padded.
											//Width 2. 
											//Conversion 'x' - The result is formatted as a hexadecimal integer, lowercase
											//%02x means print at least 2 digits, prepend it with 0's if there's less.
		}
		inp.close();
	}

}
