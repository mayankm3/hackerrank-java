package solutions2.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JavaLambdaExpressions {
	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T--> 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}

interface PerformOperation {
	 boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}
	
	public PerformOperation isOdd(){
		PerformOperation perfOp = (p)->{
			if (p%2!=0)
				return true;
			else
				return false;    
		};
		return perfOp;
	}

	public PerformOperation isPrime(){
		PerformOperation perfOp = (p)->{
			boolean primeOrNot=java.math.BigInteger.valueOf(p).isProbablePrime(1);
			if (primeOrNot)
				return true;
			else
				return false;    
		};
		return perfOp;
	}

	public PerformOperation isPalindrome(){
		PerformOperation perfOp = (p)->{
			String st1=String.valueOf(p);
			char[] ch = st1.toCharArray();              
			String rev = "";

			for (int i = 0; i < st1.length(); i++)
				rev = ch[i]+rev;
			
			if (st1.equals(rev))
				return true;
			else
				return false;    
		};
		return perfOp;
	}
}



//Witchcraft from HackerRank
//public static PerformOperation is_odd(){
//    return (int a) -> a % 2 != 0;
//}
//
//public static PerformOperation is_prime(){
//    return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
//}
//
//public static PerformOperation is_palindrome(){
//    return (int a) ->  Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
//}