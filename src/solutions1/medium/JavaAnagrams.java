package solutions1.medium;

import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		if (a.length() != b.length())
            return false;
		
		//Time complexity O(n^2). Hackerrank first solution has O(n).
		if(a.length()>=1 && b.length()<=50) {
			for(int i=0; i<a.length(); i++) {
				for(int j=0; j<b.length(); j++) {
					if(b.charAt(j) == a.charAt(i)) {
//						System.out.println(i+"      "+j);
//						System.out.println(b.substring(0, j));
//						System.out.println(b.substring(j + 1));
						b = b.substring(0, j) + b.substring(j + 1);
						System.out.println(b+"\n");
						break;
					}					
				}
			}
		}

		if (b.length() == 0)
			return true;
		else
			return false;       
    }

    public static void main(String[] args) {   
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}