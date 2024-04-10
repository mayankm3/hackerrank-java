package solutions1;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 int len=scan.nextInt();
		 
		 if (len>=1&&len<=100) {
			 int[] myArr=new int[len];
			 int ele, sum=0, count=0;
			 
			 for (int i = 0; i < len; i++) {
				ele=scan.nextInt();
				if (ele>=-10000&&ele<=10000) myArr[i]=ele;	
			 }
			 
			 
			 /**
			  * https://www.hackerrank.com/challenges/java-negative-subarray/forum
			  * Courtesy: Rodney Shag
			  */			 
			 for (int g = 0; g < len; g++) {
				for (int h = g; h < len; h++) {
					sum+=myArr[h];
					if(sum<0)
						count++;
				}
				sum=0;
			}			 
			System.out.println(count);
		 }
		 
		
	}

}
