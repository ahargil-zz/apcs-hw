import java.util.Scanner;
import java.io.*;

public class Driver {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String a = "";
	RPN b = new RPN();
	System.out.println("Input numbers and operators one at a time in post fix notation.\nInput clear when you want to clear the memory and start over.\nWhen you want to stop type in end.");
	while(!a.equals("end")) {
	    a = in.next();
	    if(a.equals("clear")) {
		b.clear();
	    }
	    else {
		b.calc(a);
		System.out.println("This is your current stack: " + b.s);
	    }
	}
    }

}
