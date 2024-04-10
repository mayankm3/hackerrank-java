package solutions1;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     String A=sc.next();
	     
	     char[] cArr = A.toCharArray();
	     
	     StringBuffer sb = new StringBuffer();
	     
	     if(A.toLowerCase().length()<50) {
	    	 for (int i = cArr.length-1; i>=0; i--) {
	    		 sb.append(cArr[i]);				
			}
	     }

	     System.out.println(A.contentEquals(sb)? "Yes":"No");
	}

}
