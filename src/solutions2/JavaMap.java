package solutions2;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		in.nextLine();
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0;i<n;i++){
			String name=in.nextLine();
			int phone=in.nextInt();
			hm.put(name, phone);
			in.nextLine();
		}
			
		while(in.hasNext()){
			String contactName=in.nextLine();							
			System.out.println(hm.get(contactName)==null? "Not found":contactName+"="+hm.get(contactName));
			
		}
	}
	
	//what is that extra scan.nextLine() for ???
	//It's there because after taking integer input using nextInt(),which reads integer tokens,the last newLine character for that line 
	//of integer is still queued in the input buffer and we need to clear that or else the next input for the string will be an empty line.
	//or
	//That’s because the sc.nextInt() method does not read the newline character in your input created by hitting “Enter,”.

}

//Better solution
//class Solution {
//    public static void main(String [] args) throws Exception {
//        /* Read input and save as entries in a HashMap */
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.valueOf(br.readLine());
//        HashMap<String, Integer> map = new HashMap<>();
//        while (n-- > 0) {
//            String name = br.readLine();
//            int phone   = Integer.valueOf(br.readLine());
//            map.put(name, phone);
//        }
//        
//        /* Read each query and check if its in our HashMap */
//        String s;
//        while((s = br.readLine()) != null) {
//            if (map.containsKey(s)) {
//                System.out.println(s + "=" + map.get(s));
//            } else {
//                System.out.println("Not found");
//            }
//        }
//        
//        br.close();
//    }
//}

