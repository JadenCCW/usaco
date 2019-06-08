/*
ID: goku7171
LANG: JAVA
TASK: ride
*/
package Section1_2;

import java.util.*;
import java.io.*;

public class ride {
	
	static Scanner in;
	static PrintWriter out;
	static String input[];
	static String result;
	
	public static void main(String[] args) {
		
		try {
			in = new Scanner(new File("ride.in"));
			out = new PrintWriter(new File("ride.out"));
			init();
			result = solve();
			
			out.println(result);
			
			in.close();
			out.close();
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	static void init() {
		input = new String[2];
		input[0] = in.nextLine();
		input[1] = in.nextLine();
	}
	
	static String solve() {
		//Step 1: Convert input String to Integer
		int n1 = convert(input[0])%47;
		int n2 = convert(input[1])%47;
		//System.out.println(n1);
		//System.out.println(n2);
		
		//Step 2: Compare first input with second input
		if(n1==n2) return "GO";
		else return "STAY";
		
	}
	
	static int convert(String input) {
		int result = 1;
		for(int i = 0; i < input.length(); i++) {
			int temp=(int)(input.charAt(i));
			temp = temp-64;
			result = result * temp;
		}
		return result;
	}

}
