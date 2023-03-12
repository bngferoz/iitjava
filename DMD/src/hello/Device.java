package hello;

public class Device implements IDevice, IMouse{

	public void singleClick() {
		System.out.println("Device single click");
		
	}

	public void doubleClick() {
		System.out.println("Device double click");
		
	}

	public void shape() {
		System.out.println("Device shape");
		
	}

}
