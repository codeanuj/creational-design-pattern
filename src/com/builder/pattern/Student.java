package com.builder.pattern;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String course;
	private String email;
	private String phone;
	private String college;
	private float psp;
	
	
	
	public static StudentBuilder getBuilder() {
		return new StudentBuilder();
	}
	
	
	 public int getId() {
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public float getPsp() {
		return psp;
	}


	public void setPsp(float psp) {
		this.psp = psp;
	}


	static class StudentBuilder{
		
		private Student student = new Student();
		
		public Student build() {
			/**
			 * Validation of attributes 
			 */
			if(student.age<18) throw new RuntimeException("Age is below 18");
			if(student.name==null) throw new RuntimeException("Name shouldn't be empty");
			
			return student;
		}
		
		public StudentBuilder setId(int id) {
			student.id=id;
			return this;			
		}
		
		public StudentBuilder setName(String name) {
			student.name=name;
			return this;			
		}
		
		public StudentBuilder setAge(int age) {
			student.age=age;
			return this;			
		}
		
		public int getAge() {
			return student.age;		
		}
		
		public StudentBuilder setCourse(String course) {
			student.course=course;
			return this;			
		}
		
		public StudentBuilder setEmail(String email) {
			student.email=email;
			return this;
		}
		
		public StudentBuilder setPhone(String phone) {
			student.phone=phone;
			return this;
		}
		
		public StudentBuilder setCollege(String college) {
			student.college=college;
			return this;
		}
		
		public StudentBuilder setPsp(float psp) {
			student.psp=psp;
			return this;
		}
	}

}
