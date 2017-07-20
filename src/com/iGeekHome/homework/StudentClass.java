package com.iGeekHome.homework;


/**
 * 4.增加班级部分，学生入学时就进入每个班级，班级拥有自己的名称，开班时间和地点等关键信息即可
 * @author student
 *
 */
public class StudentClass {

	private String studentClassName;
	private String stuClassOpenTime;
	private String stuClassAdress;
	
	public StudentClass() {
		
	}

	public StudentClass(String studentClassName,String stuClassOpenTime,String stuClassAdress) {
		this.studentClassName = studentClassName;
		this.stuClassOpenTime = stuClassOpenTime;
		this.stuClassAdress = stuClassAdress;
	}
	
	public String getStudentClassName() {
		return studentClassName;
	}

	public void setStudentClassName(String studentClassName) {
		this.studentClassName = studentClassName;
	}

	public String getStuClassOpenTime() {
		return stuClassOpenTime;
	}

	public void setStuClassOpenTime(String stuClassOpenTime) {
		this.stuClassOpenTime = stuClassOpenTime;
	}

	public String getStuClassAdress() {
		return stuClassAdress;
	}

	public void setStuClassAdress(String stuClassAdress) {
		this.stuClassAdress = stuClassAdress;
	}
}
