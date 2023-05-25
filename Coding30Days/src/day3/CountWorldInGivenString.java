package day3;

public class CountWorldInGivenString {
	public static void main(String[] args) {
		String name="i am from kolhapur";
		String s=" ";
		int count=0;
		for (int i = 0; i <name.length(); i++) {
			if (name.charAt(i)==' ') {
				s+=name.charAt(i);
				count++;
			}
		}System.out.println(count+1);
	
	}

}
