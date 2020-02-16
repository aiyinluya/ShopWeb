package com.university.test;

import java.util.Arrays;
import java.util.Scanner;

public class Teacher {

	/**
	 * 数组
	 */
	public static void main(String[] args) {
		// 数组
		// 一堆数据类型放在一块
		int[] nums = {
				1,2,3,4,5
		};
		//System.out.println(nums[5]);   // 数组越界异常  运行时错误
		
		
		int[] nums2 = new int[4];
		int[] nums3 = new int[] {
				100,55,99,55,11
		};
		
		
		// "零"值包括：0(整型)、0.0(浮点型)、 \u0000(char)、false(boolean)、null(引用类型)
		char c = '\u0000'; 
		System.out.println(c);
		// 长度固定 下标从0开始 连续 类型唯一
		
		System.out.println(nums3[2]);
		
		// 循环
		// ArrayIndexOutOfBoundsException数组下标越界异常
		// System.out.println(nums3.length);
		// 字面量 = 具体值
//		for(int i=0;i<nums3.length;i++) {
//			System.out.print(nums3[i]);
//		}
		
		
		
		// 创建数组
//		int[] arrays = {
//				999,888,777,666,555
//		};
//		int[] arrays2 = arrays;
//		// 问题来了
//		arrays[4] = 1000;
//		for(int i=0;i<arrays2.length;i++) {
//			System.out.println(arrays2[i]);
//		}
		// 解决
		int[] arrays = {
				999,888,777,666,555
		};
		int[] arrays2 = new int[arrays.length];
		for(int i=0;i<arrays.length;i++) {
			arrays2[i] = arrays[i];
		}
	    // 输出arrays2的元素内容
		// 原来的arrays 和arrays2 的元素内容
		System.out.println("arrays1"+Arrays.toString(arrays));
		System.out.println("arrays2"+Arrays.toString(arrays2));
		
		arrays[0] = 1000;
		System.out.println("修改后的两个数组的内容");
		System.out.println("arrays1"+Arrays.toString(arrays));
		System.out.println("arrays2"+Arrays.toString(arrays2));
		
		// 练习 2：统计一个字符在字符数组中的所有位置
		char[] charArrays = {
				'我','爱','中','国','中','国','爱','我'
		};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请需要查找的字符:");
		String str = scanner.next();
		for(int i=0;i<charArrays.length;i++) {
			if(str.charAt(0) == charArrays[i]) {
				System.out.println(str+"出现在"+i+"位置上");
			}
		}
		
		
		
		// charAt() jdk的一个方法
//		String str2 = "helloworld";
//		char charAt = str2.charAt(0);
//		System.out.println(charAt);
		
		
		
		// int[] nums = {1,2,3,4,5,6}
		// 如上数组,加一个元素怎么办?
		// 手动实现数组扩容
//		int[] numss = {1,2,3,4,5,6};
//		int[] newArray = new int[numss.length+1];
//		for(int i=0;i<numss.length;i++) {
//			newArray[i] = numss[i];
//		}
//		newArray[newArray.length-1] = 100;
//		System.out.println(Arrays.toString(newArray));
//		
		
		// 第一种数组复制API
		int[] numss = {1,2,3,4,5,6};
		int[] destArray = new int[numss.length];
//		System.arraycopy(numss, 0, destArray, 0, numss.length);
//		System.out.println(Arrays.toString(destArray));
		// 第二种
		int[] copyOf = Arrays.copyOf(numss, numss.length);
		System.out.println(Arrays.toString(copyOf));
		// 接下来我讲的可选择性懂
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}