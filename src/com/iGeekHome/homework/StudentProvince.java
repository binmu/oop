package com.iGeekHome.homework;

public class StudentProvince {

	
	private String province;  //ѧ������ʡ��
	private String city;      //��������
	private String address;   //��ͥסַ
	
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
}