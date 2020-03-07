package kietdone;

import java.util.Scanner;

public class SinhVien {
	String nameSV;
	int age;
	float pointSV;
	String addressSV;
	String course;
	String id;

	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public String getNameSV() {
		return nameSV;
	}

	public void setNameSV(String nameSV) {
		this.nameSV = nameSV;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getPointSV() {
		return pointSV;
	}

	public void setPointSV(float pointSV) {
		this.pointSV = pointSV;
	}

	public String getAddressSV() {
		return addressSV;
	}

	public void setAddressSV(String addressSV) {
		this.addressSV = addressSV;
	}

	public SinhVien(String nameSV, int age, float pointSV, String addressSV, String course, String id) {
		super();
		this.nameSV = nameSV;
		this.age = age;
		this.pointSV = pointSV;
		this.addressSV = addressSV;
		this.course = course;
		this.id = id;
	}

	public void inputInforSV() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input name ");
		nameSV = input.nextLine();
		System.out.println("Please input tuoi ");
		age = input.nextInt();
		input.nextLine();
		System.out.println("Please input adress ");
		addressSV = input.nextLine();
		System.out.println("Please input ponit ");
		pointSV = input.nextFloat();
		input.nextLine();
		System.out.println("Please input course ");
		course = input.nextLine();
		System.out.println("Please input id ");
		id = input.nextLine();
	}

	public void outputInforSV() {
		System.out.println(" Ten SV : " + nameSV + " Sinh nam : " + age + " dia chi : " + addressSV + " diem : "
				+ pointSV + " course : " + course + " id : " + id);
	}

}
