package Week3Day1;

public class Assignment3_Overriding_AxisBank extends Assignment3_Overriding_BankInfo{

	 void deposit()
	{
		//super.deposit();- This will call deposit account in super class
		System.out.println("This is Deposi account in Child Class ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3_Overriding_AxisBank obj = new Assignment3_Overriding_AxisBank();
		obj.deposit();

	}

}
