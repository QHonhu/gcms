package demo;

public class AcerFactory implements AbstractFactory {

	@Override
	public MobilePhone getMobilePhone() {
		
		return new AcerPhone();
	}

	@Override
	public Laptop getLaptop() {
		
		return new AcerLaptop();
	}

}
