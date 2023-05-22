package day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseAnArrayList {

	public static void main(String[] args) {
		List<Integer>sm=new ArrayList<>();
		sm.add(1);
		sm.add(2);
		sm.add(3);
		sm.add(4);
		sm.add(5);
		System.out.println(sm);
		Collections.reverse(sm);
		System.out.println(sm);

	}

}
