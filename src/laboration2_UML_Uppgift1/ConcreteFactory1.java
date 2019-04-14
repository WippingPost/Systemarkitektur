package laboration2_UML_Uppgift1;

public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public ProductA1 createProductA() {
		return new ProductA1();
	}

	@Override
	public ProductB1 createProductB() {
		return new ProductB1();
	}
}
