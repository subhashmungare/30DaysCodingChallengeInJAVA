package day7;

public class CountWorlds {
	public static void main(String[] args) {
		String name="i am compeleted my course in kiran academy";
		int count=0;
		for (int i = 0; i <name.length(); i++) {
			if (name.charAt(i)==' ') {
				count++;
			}
		}System.out.println(count+1);
	}

}
