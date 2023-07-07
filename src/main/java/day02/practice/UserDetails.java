package day02.practice;

 class UserPractice {

	private int id;
	private String name;
	private String password;
	private String email;

	public  int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
 
 public class UserDetails{
	 
	 public static void main(String[] args) {
		 
		 UserPractice sc = new UserPractice();
		 
		 sc.setId(6);
		 sc.setName("Dharunraj");
		 sc.setPassword("740247Dh#456");
		 sc.setEmail("dharun@gmail.com");
		 
		 System.out.println(sc.getId());
		 System.out.println(sc.getName());
		 System.out.println(sc.getPassword());
		 System.out.println(sc.getEmail());
	 }
 }

