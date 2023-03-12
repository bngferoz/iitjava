package five;

import hello.AgreesiveSoldier;

public class fiveMain {
	public static void main(String[] args) {
		
		//Encapsulation start
		Encapsulation encapsulationObj = new Encapsulation();
		encapsulationObj.setId(5);
		System.out.println(encapsulationObj.getId());
		//Encapsulation end
		
		//Inheritance start
		InheritanceChildClass childObj = new InheritanceChildClass();
		childObj.parentMethod();
		//Inheritance end
		
		//Polymorphism start
		Soldier soldierObj = new DeffensiveSoldier();
		soldierObj.play();
		//Polymorphism end
		
		//abstract class start
		ASoldier abstractTest = new ConcreteClass();
		abstractTest.play();
		//abstract class end
		
		//Interface start
		ISoldier interfaceTest = new DeffenseSoldier();
		//ISoldier interfaceTest = new AgreesiveSoldier();
		interfaceTest.play();
		//Interface end
	}
}
