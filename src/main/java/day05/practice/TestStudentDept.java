package day05.practice;

public class TestStudentDept {

	public static void main(String[] args) {

		Department stu1Dept = new Department();
		stu1Dept.setDeptName("Mechanical");
		stu1Dept.setDeptId(3);

		Student stu1 = new Student();
		stu1.setName("Dharunraj Alagaruppu");
		stu1.setId(220019);
		stu1.setDepartment(stu1Dept);
		
		System.out.println(stu1);

	}
}
