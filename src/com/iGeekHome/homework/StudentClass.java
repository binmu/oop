package com.iGeekHome.homework;


/**
 * 4.增加班级部分，学生入学时就进入每个班级，班级拥有自己的名称，开班时间和地点等关键信息即可
 * @author student
 *
 */
public class StudentClass {

	private String classNo;
	private String studentClassName;
	private String stuClassOpenTime;
	private String stuClassAdress;
	
	public StudentClass() {
		//Student School.stus[0] = new Student();
	}

	public StudentClass(String classNo,String studentClassName,String stuClassOpenTime,String stuClassAdress) {
		this.classNo = classNo;
		this.studentClassName = studentClassName;
		this.stuClassOpenTime = stuClassOpenTime;
		this.stuClassAdress = stuClassAdress;
	}
	
	public void addStudent(String studentNo,String name,char sex,int age,String subject,String state) {  //添加学生
		if(School.studentActNum>=School.stus.length) {
			System.out.println("人数已满！！！");
			}
		if(School.sortSudent(studentNo)>=0) {
			System.out.println("学号冲突，添加失败！！！");
		}
		Student stu = new Student();
		stu.setStudentNo(studentNo);
		stu.setAge(age);
		stu.setName(name);
		stu.setSex(sex);
		stu.setState(state);
		stu.setSubject(subject);
		//stu.setStuClass(stuClassAdress);
		School.studentActNum++;
		School.stus[School.studentActNum -1] =stu;
		System.out.println("添加成功！！！");
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

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
}
