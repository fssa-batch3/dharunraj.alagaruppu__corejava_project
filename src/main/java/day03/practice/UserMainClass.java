package day03.practice;

public class UserMainClass {

	public static void main(String[] args) {

		User user1 = new User();

		User user2 = new User("dharun", "740247Dh@3347", "dharun@gmail.com");

//		System.out.println("user1 object values : ");
//
//		System.out.println("name : " + user1.name);
//		System.out.println("emailId : " + user1.emailId);
//		System.out.println("password : " + user1.password);
//
//		System.out.println();

		System.out.println("After create a overloaded constructor for User class"); //
//		System.out.println("user2 object values : ");

		System.out.println("name : " + user2.name);
		System.out.println("emailId : " + user2.emailId);
		System.out.println("password : " + user2.password);

	}

}

class User {

	String name;
	String password;
	String emailId;

	User() {

	}

	User(String name, String password, String emailId) {

		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}

}
