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
public class Student {

	public String name; //姓名
	public char sex;    //性别
	public int age;     //年龄
	
	public int studentNo;    //学号
	public String subject;   //学科
	public String province;  //学生所属省份
	public String city;      //所属城市
	public String address;   //家庭住址
}
