package solutions1;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        if(s.length()<=100) {
            BigInteger bint = new BigInteger(s.trim());
            boolean val = bint.isProbablePrime(1);
            if(val)
                System.out.println("prime");
            else
                System.out.println("not prime");
        }

	}

}
