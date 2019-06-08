/*
ID: goku7171
LANG: JAVA
TASK: gift1
*/

package Section1_2;

import java.util.*;
import java.io.*;

public class gift1 {
	
	static Scanner in;
	static PrintWriter out;
	static int np;
	static LinkedHashMap<String,Integer> map;
	static String result;
	
	public static void main(String[] args) {
		
		try {
			in = new Scanner(new File("gift1.in"));
			out = new PrintWriter(new File("gift1.out"));
			init();
			solve();
			
			out.print(result);
			
			in.close();
			out.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	static void init() {
		np = in.nextInt();
		map = new LinkedHashMap<String, Integer>();
		for(int i = 0; i < np; i++) {
			map.put(in.next(), 0);
		}
	}
	
	static void solve() {
		for(int i = 0; i < np; i++) {
			give();
		}
		StringBuilder build = new StringBuilder();
		for(String key:map.keySet()) {
			build.append(key).append(" ").append(map.get(key)).append("\n");
		}
		result = build.toString();
	}
	
	static void give() {
		String giver = in.next();
		int money = in.nextInt();
		int people = in.nextInt();
		//System.out.println(giver + " " + money + " " + people);
		if(people==0) {
			return;
		}
		int giveamount = money/people;
		int balance = money%people;
		//System.out.println(giveamount + " " + balance);
		map.put(giver, map.get(giver)-money);
		//System.out.println(map);
		map.put(giver, map.get(giver)+balance);
		for(int i = 0; i < people; i++) {
			String temp = in.next();
			map.put(temp, map.get(temp)+giveamount);
		}
		//System.out.println(map);
	}
	

}
