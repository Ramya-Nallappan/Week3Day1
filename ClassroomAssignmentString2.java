//To find vowels in the string "Assignment"
package Week3Day1;

public class ClassroomAssignmentString2 {

	public static void main(String[] args) {
		String text = "Education";
		String text2 = text.toLowerCase();
		int length = text2.length();
		int count =0;
		System.out.println("The Vowels in the word education are : ");
	for (int i=0;i<length;i++)
	{
		char ch = text2.charAt(i);
	if (ch=='a' ||ch=='e' ||ch =='i'|| ch=='o' || ch=='u')
		{
		count=count+1;
	
	System.out.println(ch);
		}
	
	}
	System.out.println("The number of Vowels are " +count);
	}

}
