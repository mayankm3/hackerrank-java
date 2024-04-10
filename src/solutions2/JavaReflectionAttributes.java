package solutions2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflectionAttributes {

    public static void main(String[] args){
        Class student = Student.class;	//student just becomes a variable. It's type is of type Class. You can use it to get information about the class
        								//https://docs.oracle.com/javase/7/docs/api/java/lang/Class.html				
        
        Method[] methods = student.getDeclaredMethods();	//Why i can't use here "getMethods()" instead of "getDeclaredMethods()" ?
        													//getMethods will give all methods declared in class plus methods in parent Object class

        ArrayList<String> methodList = new ArrayList<>();
        for(Method mt: methods){
            methodList.add(mt.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
