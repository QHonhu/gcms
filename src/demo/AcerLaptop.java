package demo;

public class AcerLaptop extends Laptop {
	private static final String brand="ACER"; 
	protected static int initID;
	public AcerLaptop() {
		super(brand);
		initID=100;
		
	}

	@Override
	public String getID() {
		return "Acer****"+(initID++);
	}

}
