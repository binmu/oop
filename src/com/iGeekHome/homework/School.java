package com.iGeekHome.homework;


public class School {

	public static int studentActNum=0; //学生实际人数
	
	public static Student[] stus = new Student[100];
	
	public static StudentClass[] studentClass = new StudentClass[3];
	public School() {
		
		StudentClass classOne = new StudentClass("01","31营","2017/7/11","巨蟹座");
		studentClass[0]=classOne;
		StudentClass classTwo = new StudentClass("02","32营","2017/7/11","巨蟹座");
		studentClass[1]=classTwo;
		StudentClass classThree = new StudentClass("03","33营","2017/7/11","巨蟹座");
		studentClass[2]=classThree;
	}
	
	/**
	 * 转班
	 */
	public void classTransfer(String studentNo,StudentClass stuClass) {
		int index=School.sortSudent(studentNo);
		if(index<0) {
			System.out.println("请输入正确的学生信息PS:学号！！！");
		}else {
			School.stus[index].setStuClass(stuClass);
		}
	}
	
	/**
	 * 查找学生
	 * @param studentNo 学生学号
	 * @return  返回被匹配到的学生学号的下标，如果没查到则返回-1
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
			return "没这个学生!";
		}else {
			stus[index].setState("在校！");
			return "设置成功！";
		}
	}

	public String setStudentXiuXue(String studentNo) {
		int index=School.sortSudent(studentNo);
		if(index<0) {
			return "没这个学生!";
		}else {
			stus[index].setState("休学！");
			return "修改成功！";
		}
	}

	public String setStudentKaiChu(String studentNo) {
		int index=School.sortSudent(studentNo);
		if(index<0) {
			return "没这个学生!";
		}else {
			stus[index].setState("开除！");
			return "修改成功！";
		}
	}
	public static void show(int count) {
		if(count<0) {
			System.out.println("没有该学生！！！");
		}
		System.out.println("=============学生信息表=============");
		System.out.println("姓名："+School.stus[count].getName()+"\t性别："+stus[count].getSex()+"\t年龄："+stus[count].getAge());
		System.out.println("学号："+stus[count].getStudentNo()+"\t班级："+stus[count].stuClass.getStudentClassName()+"\t学科："+stus[count].getSubject());
		System.out.println("籍贯："+stus[count].stuProvince.getAddress()+"\t状态："+stus[count].getState());
		System.out.println("---------------------------------");
	}
}
