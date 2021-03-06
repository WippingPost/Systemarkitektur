package laboration2_UML_Uppgift1;

public class Client {

	public AbstractFactory getFactory(FactoryType factoryType) {

		switch(factoryType) {
		case FACTORY1:
			return new ConcreteFactory1();
		case FACTORY2:
			return new ConcreteFactory2();
		}

		return null;
	}
}
