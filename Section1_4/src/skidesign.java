import java.io.*;
import java.util.*;

public class skidesign {
	
	static Scanner in;
	static PrintWriter out;
	static int n;
	static int[] arr;
	
	public static void main(String[] args){
		
		try {
			in = new Scanner(new File("skidesign.in"));
			out = new PrintWriter(new FileWriter("skidesign.out"));
			init();
			out.println(solve());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		out.close();
		in.close();
	}
	
	public static void init() {
		n = in.nextInt();
		arr = new int[n];
		for(int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
	}
	
	public static int solve() {
		int cost = Integer.MAX_VALUE;
		for(int x = arr[0]; x <= arr[arr.length-1]-17; x++) {
			int y = x + 17;
			int tempsum = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i]<x) {
					tempsum += (x-arr[i])*(x-arr[i]);
				}
				else if(arr[i]>y) {
					tempsum += (arr[i]-y)*(arr[i]-y);
				}
				
			}
			cost = Math.min(tempsum, cost);
		}
		return cost;
	}
	
}
