package solutions2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;

public class PrimeChecker {
	public void checkPrime(int... a) {
		for(int someInt: a) {
			BigInteger bigInt = BigInteger.valueOf(someInt);
			boolean primeOrNot = bigInt.isProbablePrime(1);
			if (primeOrNot) System.out.print(someInt+" ");
		}
	}
}
//public class Solution {
//
//	public static void main(String[] args) {
//		try{
//		BufferedReader br=new BufferedReader(new InputStreamReader(in));
//		int n1=Integer.parseInt(br.readLine());
//		int n2=Integer.parseInt(br.readLine());
//		int n3=Integer.parseInt(br.readLine());
//		int n4=Integer.parseInt(br.readLine());
//		int n5=Integer.parseInt(br.readLine());
//		PrimeChecker ob=new PrimeChecker();
//		ob.checkPrime(n1);
//		ob.checkPrime(n1,n2);
//		ob.checkPrime(n1,n2,n3);
//		ob.checkPrime(n1,n2,n3,n4,n5);	
//		Method[] methods=PrimeChecker.class.getDeclaredMethods();
//		Set<String> set=new HashSet<>();
//		boolean overload=false;
//		for(int i=0;i<methods.length;i++)
//		{
//			if(set.contains(methods[i].getName()))
//			{
//				overload=true;
//				break;
//			}
//			set.add(methods[i].getName());
//			
//		}
//		if(overload)
//		{
//			throw new Exception("Overloading not allowed");
//		}
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//	}
//	
//}