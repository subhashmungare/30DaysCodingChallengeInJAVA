package day3;

public class CountVowels {
	public static void main(String[] args) {
		String name="kolhapur";
		int count=0;
		for (int i = 0; i < name.length(); i++) {
			char c=name.charAt(i);
			if (c=='a'|| c=='e'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}System.out.println(count);
	
	}

}
