//Assignment 5 : String - to find given strings or not
package Week3Day1;

import java.util.Arrays;

//Approach 1 using for loop

public class Assignment5_String_Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int count = 0;
 if (text1.length()!=text2.length())
 {
	 System.out.println(" the given word is not anagram:"); 
 }
 else
 {
	 char[] ch1 =text1.toCharArray();
	 char[] ch2 =text2.toCharArray();
	 Arrays.sort(ch1);
	 Arrays.sort(ch2);
	 System.out.println(ch1);
	 System.out.println(ch2);
	 
	 
	 for (int i=0;i<ch1.length;i++)
	 {	 
	 if (ch1[i]==ch2[i])
	 {
		 count= count+1;
	 }
	       
	 
 }
	 if (count==ch1.length)
		 System.out.println("Anagram");
	 else
		 System.out.println("not Anagram");
}
}
}


//Approach 2 using Arrays.equals method
/*
public class Assignment5_String_Anagram {

	public static void main(String[] args) {
		String text1 = "dear";
		String text2 = "read"; 
if (text1.length()!=text2.length())
{
	 System.out.println(" the given word is not anagram as length doesnt match"); 
}
else
{
	 char[] ch1 =text1.toCharArray();
	 char[] ch2 =text2.toCharArray();
	 Arrays.sort(ch1);
	 Arrays.sort(ch2);
	 System.out.println(ch1);
	 System.out.println(ch2);
	 if (Arrays.equals(ch1,ch2))
		 System.out.println("The given word is anagram");
	 else
		 System.out.println("The given word is not anagram");
		 
} 
}
}
*/
