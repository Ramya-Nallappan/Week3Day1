//Assignment5 - String - Check number of occurrences of a char (eg 'e') in a String
package Week3Day1;

public class Assignment5_String_CharOccurance {

	public static void main(String[] args) {
		String text = "welcome to chennai";
		int count =0;
		char[] ch = text.toCharArray();

		for(int i=0;i<text.length();i++)
		{
			if (ch[i]=='e')
				count = count+1;
					
		}
		System.out.println("The number of occurrences of char e is "+ count );
	}

}
