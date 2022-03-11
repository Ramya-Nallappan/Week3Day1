package Week3Day1;
public class Assignment5_String_Palindrome {
	public static void main(String[] args) {
	
	String text = "madam";
	String reverse = "";
	int charCount = text.length();
	
	for(int i=(charCount-1); i>=0; i--)
	{
		reverse = reverse + text.charAt(i);
	}
	System.out.println(reverse);

	
	
		if (text.equals(reverse))
		{
			System.out.println("The Given string is Palindrome");

		}
		else
			System.out.println("The Given string is not Palindrome");

		

}
}