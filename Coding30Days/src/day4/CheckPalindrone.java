package day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckPalindrone {
	public static void main(String[] args) {
	int no=121;
	int rem,rev=0;
	int temp=no;
	while (no!=0) {
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
		}
	if (temp==rev) {
		System.out.println("no is palindone");
	} else {
		System.out.println(" no is not palindrone");
	}
	
	
	
	
	
	
	}

}
