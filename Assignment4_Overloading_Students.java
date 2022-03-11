package Week3Day1;

public class Assignment4_Overloading_Students {

void getStudentInfo(int StudentId){
	System.out.println("The Student ID is " +StudentId);
		
	}
void getStudentInfo(int StudentId ,String name){
	System.out.println("The Student ID is " + StudentId +" and Student Name is " +name);
	
		
	}
void getStudentInfo(String email, long phoneNo){
	System.out.println("The Student EmailId is " + email +" and Phone Number is " + phoneNo);
	
}
	
	public static void main(String[] args)
	{
		Assignment4_Overloading_Students obj = new Assignment4_Overloading_Students();
		obj.getStudentInfo(5456);
		obj.getStudentInfo(8899, "Ramya");
		obj.getStudentInfo("ramya@gmail.com", 9741156741L);
		

	}

}
