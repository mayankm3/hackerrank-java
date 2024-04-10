package solutions1;

import java.util.Collections;
import java.util.Scanner;

public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        java.util.TreeSet<String> trs = new java.util.TreeSet<String>();
        
        if(s.length()>0&&s.length()<1001) {
        	for(int i=0;i<=s.length()-k;i++) {
        		trs.add(s.substring(i, i+k));
            	
            }
        }
        
        smallest=trs.first();
        largest=trs.last();
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();	//welcometojava
        int k = scan.nextInt();	//3
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}







//My solution 6 months later on 9 May 2022
//java.util.ArrayList<String> arr = new java.util.ArrayList<String>();
//
//for(int i=0; i<=s.length()-k;i++){
//    String sub = s.substring(i, k+i);
//    arr.add(sub);
//}
//
//Collections.sort(arr, (s1, s2)->s1.compareTo(s2));
//
//smallest = arr.stream().findFirst().get();
//largest = arr.get(arr.size()-1);
