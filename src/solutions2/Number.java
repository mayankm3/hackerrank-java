package solutions2;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		String st1=String.valueOf(num);
		char[] ch = st1.toCharArray();		
		
		String rev = "";
		
		for (int i = 0; i < st1.length(); i++) {
			rev = ch[i]+rev;
		}
		System.out.println(rev);
		if(st1.equals(rev)) {
			System.out.println("Paali");
		}
			
	}

}
