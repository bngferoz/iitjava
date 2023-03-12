package hello;

public class ClassWithMainMethod {
	public static void main(String[] args) {
		
//		Soldier soldier = new AgreesiveSoldier();
//		start(soldier);
		
		IMouse mouseObj = new NormalMouse();
		testMouse(mouseObj);
		
		
	}
	public static void start(Soldier obj){
		obj.play();
	}
	
	public static void testMouse(IMouse mouse){
		mouse.singleClick();
		mouse.doubleClick();
	}
}
