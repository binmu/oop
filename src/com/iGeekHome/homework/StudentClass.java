package com.iGeekHome.homework;


/**
 * 4.���Ӱ༶���֣�ѧ����ѧʱ�ͽ���ÿ���༶���༶ӵ���Լ������ƣ�����ʱ��͵ص�ȹؼ���Ϣ����
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
	
	public void addStudent(String studentNo,String name,char sex,int age,String subject,String state) {  //���ѧ��
		if(School.studentActNum>=School.stus.length) {
			System.out.println("��������������");
			}
		if(School.sortSudent(studentNo)>=0) {
			System.out.println("ѧ�ų�ͻ�����ʧ�ܣ�����");
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
		System.out.println("��ӳɹ�������");
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
