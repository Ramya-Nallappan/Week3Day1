//Assignment5 - String - find number of Letters, digits,spaces and special characters in a given String
package Week3Day1;

//using toCharArray() method

public class Assignmnent5_String_FindTypes {

	public static void main(String[] args) {
		String text = "$$ Welcome to 2nd Class of Automation $$ ";
		int letterCount = 0; int digitCount = 0; int spaceCount=0; int specialcharCount=0;
		
		char[] ch = text.toCharArray();
		for (int i=0;i<text.length();i++)
		{
		 
		if (Character.isLetter(ch[i]))
		letterCount=letterCount+1;
		else if
		(Character.isDigit(ch[i]))
		digitCount = digitCount+1;
		
		else if
		(Character.isSpaceChar(ch[i]))
			spaceCount = spaceCount+1;
		else
			specialcharCount = specialcharCount+1;
		}
		System.out.println("letter: " + letterCount);
		System.out.println("space: " + spaceCount);
		System.out.println("number: " + digitCount);
		System.out.println("specialCharacter: " + specialcharCount);
	
	}

}


//using CharAt() method

 
public class Assignmnent5_String_FindTypes {

	public static void main(String[] args) {
		String text = "$$ Welcome to 2nd Class of Automation $$ ";
		int letterCount = 0; int digitCount = 0; int spaceCount=0; int specialcharCount=0;
		for (int i=0;i<text.length();i++)
		{
		char ch =text.charAt(i);
			
		 
		if (Character.isLetter(ch))
		letterCount=letterCount+1;
		else if
		(Character.isDigit(ch))
		digitCount = digitCount+1;
		
		else if
		(Character.isSpaceChar(ch))
			spaceCount = spaceCount+1;
		else
			specialcharCount = specialcharCount+1;
		}
		System.out.println("letter: " + letterCount);
		System.out.println("space: " + spaceCount);
		System.out.println("number: " + digitCount);
		System.out.println("specialCharacter: " + specialcharCount);
	
	}

}

