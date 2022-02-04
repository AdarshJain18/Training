package com.pack;

public class StaticNonStatic {
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		User user5 = new User();
		System.out.println(user5.loginCount);
	}
}
class User{
	public int loginCount=1;
	
	public User() {
		this.loginCount = this.loginCount+1;
	}
}