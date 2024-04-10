package solutions1;

import java.util.Scanner;

public class JavaStdinAndStdout2 {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

//Why we have to do a sc.nextLine(), then do it again sc.nextLine()?
//Answer 1
//Invisible "\n" newlines
//At the end of each line of the provided input, there is an invisible "\n" which is called a newline character. This basically represents what happens when you press the "Enter" key when typing.
//
//1) The first scan.nextInt() grabs the first "int" from the input. It still leaves the "\n" on that line.
//
//2) The second scan.nextDouble() skips over that "\n" and grabs the first "double" it sees.
//
//3) Now is the tricky part. It turns out scan.nextLine() works differently than scan.nextInt() and scan.nextDouble() in that it doesn't skip over any "\n" newline characters. What it does is it reads and returns all characters until it reaches the "\n" (which it gets rid of), and stops. In the scenario above, since "\n" is the first thing we see, we get an empty String back on our 1st call to scan.nextLine().
//
//4) Our next call to scan.nextLine() will start on line 3 of input and grab the String we want.




//Answer2
//It's because when you enter a number then press Enter, input.nextInt() consumes only the number, not the "end of line". 
//When input.nextLine() executes, it consumes the "end of line" still in the buffer from the first input.
