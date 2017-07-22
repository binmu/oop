package com.iGeekHome.homework;

public class StudentProvince {

	
	private String province;  //学生所属省份
	private String city;      //所属城市
	private String address;   //家庭住址
	
	public StudentProvince() {
		
	}
	
	public StudentProvince(String province,String city,String address) {
		this.province = province;
		this.city = city;
		this.address = address;
	}
	
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void provinceSort(String province) {
		for(int count=0;count<School.studentActNum;count++) {
			if(School.stus[count].stuProvince.getProvince().equals(province)) {
				School.show(count);
			}else {
				School.show(-1);
			}
		}
	}
	
	public static void citySort(String city) {
		for(int count=0;count<School.studentActNum;count++) {
			if(School.stus[count].stuProvince.getProvince().equals(city)) {
				School.show(count);
			}else {
				School.show(-1);
			}
		}
	}
}
