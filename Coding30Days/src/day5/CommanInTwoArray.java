package day5;

import java.util.HashSet;
import java.util.Set;

public class CommanInTwoArray {
	public static void main(String[] args) {
		int a[]= {12,34,53,21,32,45,2,33,23,44};
		int b[]= {454,77,43,57,21,2,54,44,23};
		Set<Integer>sm=new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					sm.add(a[i]);
				}
			}
		}for (Integer ts : sm) {
			System.out.println(ts);
		}
		
		
		
	
	}

}
