package Laboration2_UML;

public class Main {

	public static void main(String[] args) {

		AbstractFactory factory1 = new Client().getFactory(FactoryType.FACTORY1);
		AbstractFactory factory2 = new Client().getFactory(FactoryType.FACTORY2);

		if (factory1 != null || factory2 != null) {
			factory1.createProductA();
			factory1.createProductB();
			factory2.createProductA();
			factory2.createProductB();
		} else {
			System.out.println("Ogiltig inparameter!");
		}
	}

}
