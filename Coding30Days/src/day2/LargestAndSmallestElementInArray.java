package day2;

import java.util.Iterator;

public class LargestAndSmallestElementInArray {
		public static void main(String[] args) {
	int a[]= {32,44,23,56,32,53,64,43};
	int max=a[0];
	int min=a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]>max) {
			max=a[i];
		}
		if (a[i]< min) {
			min=a[i];
		}
		
	}System.out.println("maximum no is ="+max);
	System.out.println("minimum no is ="+min);
}
}
