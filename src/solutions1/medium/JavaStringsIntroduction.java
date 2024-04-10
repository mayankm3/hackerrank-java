package solutions1.medium;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length()+B.length());
        
        System.out.println(A.compareTo(B)>0?"Yes":"No");
       
        A = A.substring(0, 1).toUpperCase()+A.substring(1);
        B = B.substring(0, 1).toUpperCase()+B.substring(1);
        System.out.println(A+" "+B);      
	}
	
}
