package com.iGeekHome.homework;


/**
 * 4.���Ӱ༶���֣�ѧ����ѧʱ�ͽ���ÿ���༶���༶ӵ���Լ������ƣ�����ʱ��͵ص�ȹؼ���Ϣ����
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
