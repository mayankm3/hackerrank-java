package solutions1.medium;

import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter q:");
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){	//5 3 5
        	System.out.println("Enter a:");
            int a = in.nextInt();
            System.out.println("Enter b:");
            int b = in.nextInt();
            System.out.println("Enter n:");
            int n = in.nextInt();                      
           
            for(int step=0;step<n;step++){
                a+=Math.pow(2, step)*b;
                System.out.print(a+" ");              
            }
            System.out.println();             
        }
        
        in.close();      
	}
}
