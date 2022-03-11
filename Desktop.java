package org.system;

public class Desktop extends Computer {

	
	void DesktopSize ()
	{
		System.out.println("This is Child Class");
	}
	
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.DesktopSize();
	}
}
