package Week3Day1;

import java.lang.reflect.Array;

public class ClassroomAssignmentString1 {

	public static void main(String[] args) {
	String text1 = "TestLeaf is located in Teynambet and above a taccobell";
	//String text2 = text1.toLowerCase();
   String word[] = text1.split(" ");
   
	
   for(int i=0;i<word.length;i++)
	
   if (word[i].equals("TestLeaf") || word[i].equals("Teynambet") || word[i].equals("taccobell"))
	   System.out.println(word[i]);
	}
}
