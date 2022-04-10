package com.inherit;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student stu1 = new Student();
//		stu1.setName("bala");
//		stu1.setEmail("bala93kumar@gmail.com");
//
//		Person per1 = new Person();
//		per1.setName("ram");
//		per1.setEmail("ram@google.com");
//
//		System.out.println(per1);

		Employee emp1 = new Employee("krithiga");
		emp1.setTitle("engineer");
		emp1.setEmployeeGrade('c');
		emp1.setEmployeeName("krithiga");
		emp1.setPhoneNumber("8610440311");

		System.out.println(emp1);

	}

}
