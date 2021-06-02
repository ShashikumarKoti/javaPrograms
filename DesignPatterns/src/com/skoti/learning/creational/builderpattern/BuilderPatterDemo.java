package com.skoti.learning.creational.builderpattern;

public class BuilderPatterDemo {

	public static void main(String[] args) {
	
	User user1 = new User.UserBuilder("Shashikumar", "Koti")
			.age(31).phoneNumber("9916669765").build();
	
	System.out.println(user1);
	
	User user2 = new User.UserBuilder("Shashikumar", "Koti")
			.age(31).phoneNumber("9916669765").address("Bangalore").build();
	
	System.out.println(user2);
	
	User user3 = new User.UserBuilder("Shashikumar", "Koti")
			.age(31).build();
	
	System.out.println(user3);
	
	User user4 = new User.UserBuilder("Shashikumar", "Koti")
			.build();
	
	System.out.println(user4);
	}
}
