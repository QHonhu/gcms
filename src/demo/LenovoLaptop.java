package demo;

public class LenovoLaptop extends Laptop {

	private static final String brand="LENOVO"; 
	protected static int initID;
	public LenovoLaptop(){
		super(brand);
		initID=200;
		
	}
	@Override
	public String getID() {
		
		return "Lenovo****"+(initID++);
	}

}
