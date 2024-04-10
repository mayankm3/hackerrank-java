package solutions2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
		
        HashSet<String> hst = new HashSet<String>();
		for (int i = 0; i < t; i++) {
			String fullString = pair_left[i]+" "+pair_right[i];
			hst.add(fullString);
			System.out.println(hst.size());
		}
		
		
		
		
		
		
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int noOfPairs = Integer.valueOf(br.readLine());
//		
//		HashSet<String> hst = new HashSet<String>();
//		
//		for (int i = 0; i < noOfPairs; i++) {
//			String str = br.readLine();
//			if(hst.contains(str)) {
//				System.out.println(hst.size());
//				continue;
//			}
//			hst.add(str);
//			System.out.println(hst.size());
//		}

	}

}
