package day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseAnArrayList {

	public static void main(String[] args) {
//		List<Integer>sm=new ArrayList<>();
//		sm.add(1);
//		sm.add(2);
//		sm.add(3);
//		sm.add(4);
//		sm.add(5);
//		System.out.println(sm);
//		for (Integer s : sm) {
//			System.out.println(s);
//			
//		}
//	
	
	int a[]= {3,42,55,65,21};
	for (int i = 0;  i< a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
			
		}for (int j2 = 0; j2 < a.length; j2++) {
			System.out.print(a[j2]+" ");
	}
	
	
	
	
	
	}

}
