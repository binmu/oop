package com.iGeekHome.homework;


public class School {

	public static int studentActNum=0; //ѧ��ʵ������
	
	public static Student[] stus = new Student[100];
	
	public static StudentClass[] studentClass = new StudentClass[3];
	public School() {
		
		StudentClass classOne = new StudentClass("01","31Ӫ","2017/7/11","��з��");
		studentClass[0]=classOne;
		StudentClass classTwo = new StudentClass("02","32Ӫ","2017/7/11","��з��");
		studentClass[1]=classTwo;
		StudentClass classThree = new StudentClass("03","33Ӫ","2017/7/11","��з��");
		studentClass[2]=classThree;
	}
	
	/**
	 * ת��
	 */
	public void classTransfer(String studentNo,StudentClass stuClass) {
		int index=School.sortSudent(studentNo);
		if(index<0) {
			System.out.println("��������ȷ��ѧ����ϢPS:ѧ�ţ�����");
		}else {
			School.stus[index].setStuClass(stuClass);
		}
	}
	
	/**
	 * ����ѧ��
	 * @param studentNo ѧ��ѧ��
	 * @return  ���ر�ƥ�䵽��ѧ��ѧ�ŵ��±꣬���û�鵽�򷵻�-1
	 */
	public static int sortSudent(String studentNo) {  
		for(int count=0;count<School.studentActNum;count++) {
			if(School.stus[count].getStudentNo().equals(studentNo)) {
				return count;
			}
		}
		return -1;
	}
	
	public static void findSudent(String studentNo) {  
		School.show(School.sortSudent(studentNo));
	}
	
	public String setStudentZaiXiao(String studentNo) {
		int index=School.sortSudent(studentNo);
		if(index<0) {
			return "û���ѧ��!";
		}else {
			stus[index].setState("��У��");
			return "���óɹ���";
		}
	}

	public String setStudentXiuXue(String studentNo) {
		int index=School.sortSudent(studentNo);
		if(index<0) {
			return "û���ѧ��!";
		}else {
			stus[index].setState("��ѧ��");
			return "�޸ĳɹ���";
		}
	}

	public String setStudentKaiChu(String studentNo) {
		int index=School.sortSudent(studentNo);
		if(index<0) {
			return "û���ѧ��!";
		}else {
			stus[index].setState("������");
			return "�޸ĳɹ���";
		}
	}
	public static void show(int count) {
		if(count<0) {
			System.out.println("û�и�ѧ��������");
		}
		System.out.println("=============ѧ����Ϣ��=============");
		System.out.println("������"+School.stus[count].getName()+"\t�Ա�"+stus[count].getSex()+"\t���䣺"+stus[count].getAge());
		System.out.println("ѧ�ţ�"+stus[count].getStudentNo()+"\t�༶��"+stus[count].stuClass.getStudentClassName()+"\tѧ�ƣ�"+stus[count].getSubject());
		System.out.println("���᣺"+stus[count].stuProvince.getAddress()+"\t״̬��"+stus[count].getState());
		System.out.println("---------------------------------");
	}
}
