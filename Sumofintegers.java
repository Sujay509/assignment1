package com.bridgelabz;
import java.util.Scanner;
public class Sumofintegers {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter number for elements");
		int count=n.nextInt();
		System.out.println("Enter elements");
		int[] arr=new int[count];
		for (int i = 0; i < count; i++) {
			arr[i]=n.nextInt();
		}
	
		
		n.close();


	}

}
