package day1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int array=sc.nextInt();
		
		int s[]= {1,2,3,4,5};
		int i=0;
		int j=s.length-1;
		
		int temp;
		while(i<j) {
			temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
		for (int k = 0; k < s.length; k++) {
			System.out.print(s[k]+ "  ");
		}
	}

}
