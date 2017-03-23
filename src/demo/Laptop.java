package demo;

public abstract class Laptop {
	private String brand;
	public Laptop(String str){
		this.brand=str;		
	}
	abstract public String getID();
	public void getDescription(){
		System.out.println("this is a "+brand+"laptop");
	}

}
