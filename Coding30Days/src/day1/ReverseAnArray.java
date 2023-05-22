package day1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number of values...");
		int num=sc.nextInt();
		int sm[]=new int[num];
		System.out.println("Enter a value");
		for (int i = 0; i < sm.length; i++) {
			sm[i]=sc.nextInt();
		
		int a=0;
		int j=sm.length-1;
		int temp;
		while(a<j) {
			temp=sm[a];
			sm[a]=sm[j];
			sm[j]=temp;
			a++;
			j--;
		}
	}
		for (int k = 0; k < sm.length; k++) {
			System.out.print(sm[k]+ "  ");
		}
		
		
//		int sm[]= {7,8,9,10,11,12,13,14};
//		int i=0;
//		int j=sm.length-1;
//		int temp;
//		while(i<j) {
//			temp=sm[i];
//			sm[i]=sm[j];
//			sm[j]=temp;
//			i++;
//			j--;
//		}
//		for (int k = 0; k < sm.length; k++) {
//			System.out.print(sm[k]+" ");
//		}
//		
//		
		
		
		
		
		
	}

}
