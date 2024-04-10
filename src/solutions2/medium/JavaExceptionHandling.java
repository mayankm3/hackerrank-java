package solutions2.medium;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int a = sc.nextInt();
            int b = sc.nextInt();          
            int result = a/b;
            System.out.println(result);			
		}		
		catch(InputMismatchException e){
			System.out.println(e.getClass().getName());
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		//Best practice & HackerRank witchcraft
//        try(Scanner sc = new Scanner(System.in)){
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            System.out.println(x/y);
//        }
//        catch(ArithmeticException | InputMismatchException e){
//            System.out.println(e);
//        }        
	}
}
