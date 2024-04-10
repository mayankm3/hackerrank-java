package solutions2;

import java.util.LinkedList;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numEle = sc.nextInt();
		
		LinkedList<Integer> link_list = new LinkedList<Integer>();
		
		for (int i = 0; i < numEle; i++) {
			link_list.add(sc.nextInt());
		}
		
		int queries = sc.nextInt();
		
		for (int j = 0; j < queries; j++) {
			
			String st = sc.next();
			switch(st) {
				case "Insert":
					int index1 = sc.nextInt();
					int intEle = sc.nextInt();
					link_list.add(index1, intEle);
					break;
					
				case "Delete":
					int index2 = sc.nextInt();
					link_list.remove(index2);
					break;
			}
		}
		
		link_list.forEach(p->System.out.print(p+" "));
	}

}
