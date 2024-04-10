package solutions1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaBigDecimal {

	   public static void main(String []args){
	        //Input
	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n+2];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	      	sc.close();
	      	
//	        if(s.length<=200&&s.length>=1) {
//	        	ArrayList<BigDecimal> arrLi = new ArrayList<BigDecimal>();
//	        	for(int i=0;i<s.length;i++) {
//	        		if(s[i].length()<=300) {
//	        			double doub = Double.parseDouble(s[i]);
//			        	BigDecimal bd = BigDecimal.valueOf(doub);
//			        	arrLi.add(bd);
//	        		}	
//	        	}
//	        	arrLi.sort(null);
//	        	System.out.println(arrLi);
//	        }

	        //Output
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }
	    }

}
