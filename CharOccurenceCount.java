package com.pack;

public class CharOccurenceCount {
	public static void main(String[] args) {
		String s = "helloworld";
		
		int count[] = new int[256];
		
		int len = s.length();
		
		for(int i = 0; i < len; i++) {
			count[s.charAt(i)]++;
		}
		char ch[] = new char[s.length()];
		for(int i = 0; i < len; i++) {
			ch[i] = s.charAt(i);
			int find = 0;
			for(int j = 0; j <= i; j++) {
				if(s.charAt(i) == ch[j]) {
					find++;
				}
			}
			if(find == 1) {
				System.out.println(s.charAt(i) + " - " + count[s.charAt(i)]);
			}
		}
	}
}
