package day6;

public class RemoveSpaces {
	public static void main(String[] args) {
		String name= "i am full stack java developer";
		String s=" ";
		for (int i = 0; i <name.length(); i++) {
			if (name.charAt(i)!=' ') {
				s+=name.charAt(i);
			}
		}
	System.out.println(s);
	
	}
}

