package com.iGeekHome.homework;


/**
 * OOP��ϰ����һ����ѧ��ѧ������ϵͳ����һ��ѧУ��Ϊ����
 * ���Խ�����ѧѧ������ѧѧ��������ѧ�����鿴ѧ����Ϣ�Ȳ�����
 * ��ѧ����Ϊ������Ψһ���ݡ�ѧ����Ϣ���������˵���Ϣ֮�⣬
 * ��Ӧ��ӵ��ѧ�š�ѧ�ơ�����ʡ�ݡ��������С����ڼ�ͥ��ַ��
 * ��ѧУһ��ֻ����ס100��ѧ�������ʵ��ļ����������
 * @author ����
 *
 */

public class SchoolStudentSys {
	
	public static void main(String[] args) {
		//school.addStudent(  Student());
//		StudentClass studentClass = new StudentClass();
//		studentClass.setStudentClassName("32Ӫ");
//		studentClass.setStuClassOpenTime("2017��7��11��");
//		studentClass.setStuClassAdress("��з��");
		
		Student stu = new Student();
		
		School school = new School();
		school.addStudent("2014143136");
		school.show("2014143136");
	}

}
