package com.iGeekHome.homework;


public class School {

	public int studentActNum=0; //ѧ��ʵ������
	
	public Student[] stus = new Student[100];
	
	public School() {
		
	}
//	/**
//	 * ����ѧ��
//	 * @param studentNo
//	 * @return  ���ر�ƥ�䵽��ѧ��ѧ�ŵ��±꣬���û�鵽�򷵻�-1
//	 */
//	public int sortSudent(int studentNo) {  
//		for(int count=0;count<this.stus.length;count++) {
//			if(this.stus[count].getStudentNo()==studentNo) {
//				return count;
//			}
//		}
//		return -1;
//	}
	
	public String addStudent(String studentNo) {  //���ѧ��
		if(this.studentActNum>=this.stus.length) {
			return "��������������";
			}
		for(int count=0;count<this.stus.length;count++) {
			if(stus[count].getStudentNo().equals(studentNo)) {
				return "ѧ�ų�ͻ�����ʧ�ܣ�����";
			}
		}
		Student stu = new Student();
		stu.setStudentNo(studentNo);
		this.studentActNum++;
		this.stus[this.studentActNum -1] =stu;
		return "��ӳɹ�������";
	}
	
	public String setStudentZaiXiao(String studentNo) {
		for(int count=0;count<this.stus.length;count++) {
			if(stus[count].getStudentNo().equals(studentNo)) {
				stus[count].setState("��У��");
				return "���óɹ���";
			}
		}
		return "û���ѧ��!";
	}

	public String setStudentXiuXue(String studentNo) {
		for (int count = 0; count < studentActNum; count++) {
			if (stus[count].getStudentNo().equals(studentNo)) {
				stus[count].setState("��ѧ��");
				return "�޸ĳɹ�";
			}
		}
		return "û���ѧ��";
	}

	public String setStudentKaiChu(String studentNo) {
		for (int count = 0; count < studentActNum; count++) {
			if (stus[count].getStudentNo().equals(studentNo)) {
				stus[count].setState("������");
				return "�޸ĳɹ�";
			}
		}
		return "û���ѧ��";
	}
	public void show(String studentNo) {
		for (int count = 0; count < studentActNum; count++) {
			if (stus[count].getStudentNo().equals(studentNo)) {
				System.out.println("=======ѧ����Ϣ��=======");
				System.out.println("������"+stus[count].getName()+"\t�Ա�"+stus[count].getSex()+"\t���䣺"+stus[count].getAge());
				System.out.println("ѧ�ţ�"+stus[count].getStudentNo()+"\t�༶��"+stus[count].stuClass.getStudentClassName()+"\tѧ�ƣ�"+stus[count].getSubject());
				System.out.println("���᣺"+stus[count].stuProvince.getAddress()+"\t״̬��"+stus[count].getState());
			}
		}
	}
}
