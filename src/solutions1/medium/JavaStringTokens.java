package solutions1.medium;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        s = s.trim();
        if (s.length() == 0)
            System.out.println(0);
        else if(s.length()>=1&&s.length()<=4*Math.pow(10, 5)) {
            String[] arr = s.split("['!?,._@ ]+");	//or "[^a-zA-Z]+"	watch?v=_a5HiXlBcEU	watch?v=9RksQ5YT7FM
            System.out.println(arr.length);
            for(String st:arr) {
                System.out.println(st);
            }
        }
        
        scan.close();

	}

}
