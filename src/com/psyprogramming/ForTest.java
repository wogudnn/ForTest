package com.psyprogramming;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		
	System.out.println("구구단을 시작합니다.");
	System.out.println("원하시는 단을 입력하세요");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	MultiplicationTable multiplicationTable = new  MultiplicationTable();
	multiplicationTable.multiplicationTable(number);
	
		
	}
	
}
