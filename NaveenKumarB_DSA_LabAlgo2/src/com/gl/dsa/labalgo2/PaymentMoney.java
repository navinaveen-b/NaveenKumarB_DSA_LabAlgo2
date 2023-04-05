package com.gl.dsa.labalgo2;

import java.util.Scanner;

public class PaymentMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Currency tarnsactions");
		int size = s.nextInt();
		int curArr[] = new int[size];
		System.out.println("Enter the currency denomination values");
		for(int i = 0; i < size; i++)
			curArr[i] = s.nextInt();
		System.out.println("Enter the amount you want to pay");
		int amtToPay = s.nextInt();
		for(int i = 0; i < size-1;i++) {
			for(int j = 0; j < size -1-i;j++) {
				if(curArr[j] < curArr[j+1]) {
					int temp = curArr[j+1];
					curArr[j+1] = curArr[j];
					curArr[j] = temp;
				}
			}
		}
		/*for(int i = 0; i< size; i++) {
			System.out.println("The elemnt of array at" +i +curArr[i]);
		}*/
		System.out.println("Tour apayment approach in order to give min no of notes will be");
		for(int i = 0; i < size; i++) {
			int quot;
			quot=amtToPay/curArr[i];
			while(amtToPay > 0) {
				if(amtToPay < curArr[i]) {
					break;
				}
				amtToPay = amtToPay%curArr[i];
			}
			System.out.println(curArr[i] + ":" +quot);
			
		}
		
	}

}
