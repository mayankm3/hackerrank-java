package solutions2;

import java.lang.reflect.Method;

public class JavaGenerics {
	
	public <T> void printArray(T[] arr) {
		for (T element : arr) {
			System.out.println(element);
		}
	}

}

class Solution {


    public static void main( String args[] ) {
    	JavaGenerics myPrinter = new JavaGenerics();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : JavaGenerics.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
