package kietdone;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {

	ArrayList<SinhVien> arrSV = new ArrayList<>();

	public void dockingDsSV(ArrayList<SinhVien> arrSV) {
		for (int i = 0; i < arrSV.size(); i++) {
			for (int j = 0; j < arrSV.size(); j++) {
				if (arrSV.get(i).getPointSV() < arrSV.get(j).getPointSV()) {
					SinhVien sv = new SinhVien();
					sv = arrSV.get(i);
					arrSV.set(i, arrSV.get(j));
					arrSV.set(j, sv);
				}
			}
		}
	}

	public void showListSV(ArrayList<SinhVien> arr) {
		for (int i = 0; i < arr.size(); i++) {
			arr.get(i).outputInforSV();
		}
	}

	public void inputListSV(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.println("Please input data student   " + (i + 1));
			SinhVien sv = new SinhVien();
			sv.inputInforSV();
			arrSV.add(sv);
		}
	}

	public void sertSV(ArrayList<SinhVien> arr, String name) {
		int j = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getId().lastIndexOf(name) >= 0) {
				arr.get(i).outputInforSV();
				j = 1;
			}
		}
		if (j == 0) {
			System.out.println("No data  ");
		}

	}

	public void sertcourseSV(ArrayList<SinhVien> arr, String name) {
		int j = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getCourse().lastIndexOf(name) >= 0) {
				arr.get(i).outputInforSV();
				j = 1;
			}
		}
		if (j == 0) {
			System.out.println("No data  ");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLySinhVien q = new QuanLySinhVien();
		int choice, i = 0;

		while (i == 0) {

			System.out.println("\n\t+-------------- QUAN LY SINH VIEN   ");
			System.out.println("\t+------------ 1. Nhap Sinh Vien tu dau   ");
			System.out.println("\t+------------ 2. Hien thi DSSV                 ");
			System.out.println("\t+------------ 3. Sap xep danh sach sv    ");
			System.out.println("\t+------------ 4. tim kiem danh sach theo  course   ");
			System.out.println("\t+------------ 5. tim kiem  sv for id   ");
			System.out.println("\t+------------ 0. Thoat        ");
			System.out.println("\t#Chon:1,2,3,4 or 0 : ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Please number student ");
				int n = sc.nextInt();
				q.inputListSV(n);
				break;
			case 2:
				q.showListSV(q.arrSV);
				break;
			case 3:
				q.dockingDsSV(q.arrSV);
				q.showListSV(q.arrSV);
				break;
			case 4:
				sc.nextLine();
				System.out.println("Please ipnut course to serach list student ");
				String a1 = sc.nextLine();
				q.sertcourseSV(q.arrSV, a1);
				break;
			case 5:
				sc.nextLine();
				System.out.println("Please ipnut id to serach course ");
				String a = sc.nextLine();
				q.sertSV(q.arrSV, a);
				break;

			case 0:
				i = 1;
				System.out.println("PP");
				break;
			}
		}
	}

}
