package solutions1.medium;

import java.util.Scanner;

public class StaticInitializerBlock {
	
    public static int B,H;
    public static boolean flag;

    static{
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        flag = true;
        
        if (B<=0 || H<=0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
	public static void main(String[] args) {
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}

}




//I tried again on 5th May 2022. 
//Reason from hackerrank discussion on why I cannot write  [throw new Exception("Breadth and height must be positive");] inside static block's if statement

//You need to either use a try catch block or add "throws (Exception)" to a method name in order to throw a checked exception. 
//In this case, there is no method name for the static initializer block, so you must use a try catch!