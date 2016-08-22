package com.psyprogramming;

public class MultiplicationTable {

	public void multiplicationTable(int number) {
		if(number>=2&&number<=9){
			for(int i = 1;i<10;i++){
				
				System.out.printf("%d*%d = %d입니다.\n",number,i,i*number);
			
			}
			
		}
		else {
			System.out.println("잘 못 입력 하셨습니다.");
		
		}
	}
}
