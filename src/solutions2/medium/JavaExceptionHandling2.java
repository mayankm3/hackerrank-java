package solutions2.medium;

import java.util.Scanner;

public class JavaExceptionHandling2 {
    public static final MyCalculator2 my_calculator = new MyCalculator2();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class  MyCalculator2{  
	public long power(int n, int p) throws Exception {
		int result = 1;
		
		if(n<0 || p<0) {
			throw new Exception("n or p should not be negative.");	//java.lang.Exception: n or p should not be negative.
		}
		else if(n==0 && p==0) {
			throw new Exception("n and p should not be zero.");	//java.lang.Exception: n and p should not be zero.
		}
		else {
			while(p!=0) {
				result = result*n;
				p--;
			}
		}
		
		return result;
	}
}
