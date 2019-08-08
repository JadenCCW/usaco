import java.util.*;
import java.io.*;

public class ariprog {
	
	static Scanner in;
	static PrintWriter out;
	static boolean[] arr;
	static int n;
	static int m;
	
	public static void main(String[] args) {
		
		try {
			in = new Scanner(new File("ariprog.in"));
			out = new PrintWriter(new FileWriter("ariprog.out"));
			init();
			solve();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void init() {
		n = in.nextInt();
		m = in.nextInt();
		arr = new boolean[m*m*2];
		for(int i = 0; i <= 7; i++) {
			for(int j = 0; j <= 7; j++) {
				int bisquare = (i*i)+(j*j);
				arr[bisquare] = true;
			}
		}
	}
	
	public static void solve() {
		
		for(int i = 0; i < n; i++) {
			
		}
		
	}
	
}
