package com.skoti.learning.creational.builderpattern;

public class User {

	private final String firstName;  	//required parameters
	private final String lastName; 		//required parameters
	private final int age; 				//optional parameters
	private final String phoneNumber; 	//optional parameters
	private final String address; 		//optional parameters
	
	private User(UserBuilder userBuilder) {
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.age = userBuilder.age;
		this.phoneNumber = userBuilder.phoneNumber;
		this.address = userBuilder.address;
	}

	//provide only getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phoneNumber="
				+ phoneNumber + ", address=" + address + "]";
	}

//create inner static builder class
public static class UserBuilder {

	private final String firstName;
	private final String lastName;
	private int age;
	private String phoneNumber;
	private String address;
			
		//create constructor with mandatory parameters
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		//Return the finally constructed User object
		public User build() {
			User user = new User(this);
			return user;
		}
	}
}
 	