package solutions1;

import java.util.Scanner;

public class JavaEndofFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner rl=new Scanner(System.in);		
		int i=1;
		
		while(rl.hasNext()) {
			System.out.println(i+" "+rl.nextLine());
			i++;
		}
	}

}
