package com.builder.pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Student student1 = Student.getBuilder().setAge(12).setName("Tanya").build();
		Student student2 = Student.getBuilder().setAge(18).setName("Ram").setCollege("BVP").setPsp(80).build();
		System.out.println(student2.getAge());
		System.out.println(student2);
	}

}
