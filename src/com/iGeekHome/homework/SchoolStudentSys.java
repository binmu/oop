package com.iGeekHome.homework;


/**
 * OOP练习：做一个简单学生学籍管理系统，用一个学校作为载体
 * 可以进行入学学生、休学学生、开除学生、查看学生信息等操作，
 * 以学号作为操作的唯一依据。学生信息包含基本人的信息之外，
 * 还应该拥有学号、学科、所属省份、所属城市、所在家庭地址。
 * 该学校一共只能入住100个学生，请适当的加入合理化操作
 * @author 宾林
 *
 */

public class SchoolStudentSys {
	
	public static void main(String[] args) {
		//school.addStudent(  Student());
//		StudentClass studentClass = new StudentClass();
//		studentClass.setStudentClassName("32营");
//		studentClass.setStuClassOpenTime("2017年7月11日");
//		studentClass.setStuClassAdress("巨蟹座");
		
		Student stu = new Student();
		
		School school = new School();
		school.addStudent("2014143136");
		school.show("2014143136");
	}

}
