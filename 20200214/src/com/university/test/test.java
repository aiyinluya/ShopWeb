package com.university.test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.print("请输入星期数：");
		Scanner sca = new Scanner(System.in);
		int week = sca.nextInt();
		switch (week) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期七");
			break;
		default:
			System.out.println("输入错误，程序结束！");
			sca.close();
		}
	}
}
