package StringPrograms;

public class Palindrome {
	public static void main(String[] args) {
		String str = "naman";
		String reverse = "";
		
		for (int i = str.length()-1; i >=0 ; i--) {
			reverse = reverse+str.charAt(i);
		}
		if (reverse.equalsIgnoreCase(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");

		}
	}

}
