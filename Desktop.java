package week3.day3;

public class Desktop implements HardWare,Software {

	public void softwareResources() {
		System.out.println("windows 11");
		
	}

	public void hardwareResources() {
		System.out.println("intel core i7");
		
	}
	public void DesktopModel() {
		System.out.println("hp 14 inch");

	}
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.softwareResources();
		obj.hardwareResources();
		obj.DesktopModel();
		
	}

}
