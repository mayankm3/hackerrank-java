package solutions2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {

		 Scanner sc= new Scanner(System.in);
		 int nLines = sc.nextInt();
		 
		 ArrayList<Integer> smallestArray =  new ArrayList<Integer>();
		 smallestArray.add(nLines);
		 
		 ArrayList<ArrayList<Integer>> arrOfArr = new ArrayList<ArrayList<Integer>>();
		 arrOfArr.add(smallestArray);
		 
		
		 
		 for (int i = 0; i < nLines; i++) {
			 ArrayList<Integer> arr =  new ArrayList<Integer>();
			 int noOfIntegersinLine = sc.nextInt();
			 arr.add(noOfIntegersinLine);
			 
			 for (int j = 0; j < noOfIntegersinLine; j++) {
				 int ele = sc.nextInt();
				 arr.add(ele);
			 }
			 
			 arrOfArr.add(arr);
		 }
		 
		 //number of queries. Each query will consist of two integers  x and y.
		 int queryLines = sc.nextInt();
		 for (int k = 0; k < queryLines; k++) {
			 int lineNumber = sc.nextInt();
			 int whichInteger = sc.nextInt();
			 try {
				 System.out.println(arrOfArr.get(lineNumber).get(whichInteger));
				 
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
		 
	}

}
