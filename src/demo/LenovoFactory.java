package demo;

public class LenovoFactory implements AbstractFactory {

	@Override
	public MobilePhone getMobilePhone() {
		
		return new LenovoPhone();
	}

	@Override
	public Laptop getLaptop() {
		
		return new LenovoLaptop();
	}

}
