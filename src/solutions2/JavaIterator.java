package solutions2;

import java.util.*;

public class JavaIterator {
	
	static Iterator func(ArrayList mylist){
	      Iterator it=mylist.iterator();
	      while(it.hasNext()){
	         Object element = it.next();
	         System.out.println(element);
	         if(element instanceof String)

				break;
			}
	      return it;
	      
	   }
	   @SuppressWarnings({ "unchecked" })
	   public static void main(String []args){
	      ArrayList mylist = new ArrayList();
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int m = sc.nextInt();
	      for(int i = 0;i<n;i++){
	         mylist.add(sc.nextInt());
	      }
	      
	      mylist.add("###");
	      for(int i=0;i<m;i++){
	         mylist.add(sc.next());
	      }
	      
	      Iterator it=func(mylist);
	      while(it.hasNext()){
	         Object element = it.next();
	         System.out.println((String)element);
	      }
	   }
}




//In the main function, we call the static function, Iterator it = func(myList);.
//This function takes in list {42, 10, "###", "Hello", "Java"} and activates iterator. Iterator will start looking at elements one by one.

//It will look at 42.
//It will look at 10.
//It sees that "###" is a String data type and stops the while loop. It will return an iterator that stopped at the 4th element of the list ("Hello")
//It will now continue the iterator.

