package com.iGeekHome.homework;

/**
 * OOP��ϰ����һ����ѧ��ѧ������ϵͳ����һ��ѧУ��Ϊ����
 * ���Խ�����ѧѧ������ѧѧ��������ѧ�����鿴ѧ����Ϣ�Ȳ�����
 * ��ѧ����Ϊ������Ψһ���ݡ�ѧ����Ϣ���������˵���Ϣ֮�⣬
 * ��Ӧ��ӵ��ѧ�š�ѧ�ơ�����ʡ�ݡ��������С����ڼ�ͥ��ַ��
 * ��ѧУһ��ֻ����ס100��ѧ�������ʵ��ļ����������
 * 1.���Ӻ���Ĺ��캯�������Է�װ������
 * 2.����ʡ�ݲ�ѯ����ʡ��Ϊ�����г���ʡ�ڵ�����ѧ����
 * 3.���ӳ��в�ѯ���Գ���Ϊ�����г��ó����ڵ�����ѧ��
 * 4.���Ӱ༶���֣�ѧ����ѧʱ�ͽ���ÿ���༶���༶ӵ���Լ������ƣ�����ʱ��͵ص�ȹؼ���Ϣ����
 * 5.���Խ���ת�����
 * @author ����
 *
 */
/**
 * @author student
 *
 */
public class Student {

	private String name; //����
	private char sex;    //�Ա�
	private int age;     //����
	
	private String studentNo;    //ѧ��
	private String subject;   //ѧ��
	
	private String state;    //ѧ��Ŀǰ��״̬���Ƿ񿪳����Ƿ���ѧ��
	
	public StudentProvince stuProvince;
	
	public StudentClass stuClass;
	
	public Student() {
		
	}
	
//	public Student(StudentClass stuClass) {
//		//StudentClass studentClass = new StudentClass();
//		this.stuClass.setStudentClassName("32Ӫ");
//		this.stuClass.setStuClassOpenTime("2017��7��11��");
//		this.stuClass.setStuClassAdress("��з��");
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
