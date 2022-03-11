package Week3Day1;

public class Assignment5_String_ReverseEvenWords {

	public static void main(String[] args) {
		String text1 = "I am a software tester";
		String word[] = text1.split(" ");
		System.out.println("The given String is: " + text1);
		System.out.print("The reversed String is: ");
		for(int i=0;i<word.length;i++)
		{	
			if (i%2==0) 
			{
			System.out.print(word[i]+" ");
			}
			else
		{
		char[] charArray = word[i].toCharArray();		
		for (int j=(charArray.length-1);j>=0;j--)
		{
			
			System.out.print(charArray[j]);
			
		}
		System.out.print(" ");
		}
		
		
		}
	}

}

	