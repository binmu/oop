package com.iGeekHome.homework;


public class School {

	public int studentActNum=0; //学生实际人数
	
	public Student[] stus = new Student[100];
	
	public School() {
		
	}
//	/**
//	 * 查找学生
//	 * @param studentNo
//	 * @return  返回被匹配到的学生学号的下标，如果没查到则返回-1
//	 */
//	public int sortSudent(int studentNo) {  
//		for(int count=0;count<this.stus.length;count++) {
//			if(this.stus[count].getStudentNo()==studentNo) {
//				return count;
//			}
//		}
//		return -1;
//	}
	
	public String addStudent(String studentNo) {  //添加学生
		if(this.studentActNum>=this.stus.length) {
			return "人数已满！！！";
			}
		for(int count=0;count<this.stus.length;count++) {
			if(stus[count].getStudentNo().equals(studentNo)) {
				return "学号冲突，添加失败！！！";
			}
		}
		Student stu = new Student();
		stu.setStudentNo(studentNo);
		this.studentActNum++;
		this.stus[this.studentActNum -1] =stu;
		return "添加成功！！！";
	}
	
	public String setStudentZaiXiao(String studentNo) {
		for(int count=0;count<this.stus.length;count++) {
			if(stus[count].getStudentNo().equals(studentNo)) {
				stus[count].setState("在校！");
				return "设置成功！";
			}
		}
		return "没这个学生!";
	}

	public String setStudentXiuXue(String studentNo) {
		for (int count = 0; count < studentActNum; count++) {
			if (stus[count].getStudentNo().equals(studentNo)) {
				stus[count].setState("休学！");
				return "修改成功";
			}
		}
		return "没这个学生";
	}

	public String setStudentKaiChu(String studentNo) {
		for (int count = 0; count < studentActNum; count++) {
			if (stus[count].getStudentNo().equals(studentNo)) {
				stus[count].setState("开除！");
				return "修改成功";
			}
		}
		return "没这个学生";
	}
	public void show(String studentNo) {
		for (int count = 0; count < studentActNum; count++) {
			if (stus[count].getStudentNo().equals(studentNo)) {
				System.out.println("=======学生信息表=======");
				System.out.println("姓名："+stus[count].getName()+"\t性别："+stus[count].getSex()+"\t年龄："+stus[count].getAge());
				System.out.println("学号："+stus[count].getStudentNo()+"\t班级："+stus[count].stuClass.getStudentClassName()+"\t学科："+stus[count].getSubject());
				System.out.println("籍贯："+stus[count].stuProvince.getAddress()+"\t状态："+stus[count].getState());
			}
		}
	}
}
