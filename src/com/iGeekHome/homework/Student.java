package com.iGeekHome.homework;

/**
 * OOP练习：做一个简单学生学籍管理系统，用一个学校作为载体
 * 可以进行入学学生、休学学生、开除学生、查看学生信息等操作，
 * 以学号作为操作的唯一依据。学生信息包含基本人的信息之外，
 * 还应该拥有学号、学科、所属省份、所属城市、所在家庭地址。
 * 该学校一共只能入住100个学生，请适当的加入合理化操作
 * 1.增加合理的构造函数和属性封装方法；
 * 2.增加省份查询，以省份为条件列出该省内的所有学生；
 * 3.增加城市查询，以城市为条件列出该城市内的所有学生
 * 4.增加班级部分，学生入学时就进入每个班级，班级拥有自己的名称，开班时间和地点等关键信息即可
 * 5.可以进行转班操作
 * @author 宾林
 *
 */
/**
 * @author student
 *
 */
public class Student {

	private String name; //姓名
	private char sex;    //性别
	private int age;     //年龄
	
	private String studentNo;    //学号
	private String subject;   //学科
	
	private String state;    //学生目前的状态，是否开除，是否休学等
	
	public StudentProvince stuProvince;
	
	public StudentClass stuClass;
	
	public Student() {
		
	}
	
//	public Student(StudentClass stuClass) {
//		//StudentClass studentClass = new StudentClass();
//		this.stuClass.setStudentClassName("32营");
//		this.stuClass.setStuClassOpenTime("2017年7月11日");
//		this.stuClass.setStuClassAdress("巨蟹座");
//		
//	}
	public Student(String studentNo) {
		this.studentNo=studentNo;
	}
	
	public Student(String name,char sex,int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public Student(String name,char sex,int age,String studentNo,String subject) {
		this(name,sex,age);
		this.studentNo = studentNo;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
