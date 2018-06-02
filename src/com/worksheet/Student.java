package com.worksheet;

public class Student {
	public int studentId;
	 public String firstName;
	 public String lastname;
	 public String gender;
	 public String branch;
	 public String dept;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	 //@Override
		//public String toString() {
		//	return ;
	@Override
	public String toString() {
		return "Student studentId=" + studentId + ", firstName=" + firstName + ", lastname=" + lastname + ", gender="
				+ gender + ", branch=" + branch + ", dept=" + dept + "";
	}

}
