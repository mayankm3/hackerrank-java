package solutions1;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",s1, x);
        }
        System.out.println("================================");

    }
}

//The "-" is used to left indent (spaces will be added at the end of the string). 
//The 15 means the resulting string will be 15 characters long.

//%03d (0 to pad with zeros and 3 makes our integer be a minimum length of 3)

//%n new line


//Sample Input
//
//java 100
//cpp 65
//python 50


//Sample Output
//
//================================
//java           100 
//cpp            065 
//python         050 
//================================