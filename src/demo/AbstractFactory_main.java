package demo;

public class AbstractFactory_main {
	public static void main(String[] args){
		AbstractFactory A=new AcerFactory();
		Laptop x=A.getLaptop();
		x.getDescription();
		System.out.println(x.getID());
		MobilePhone y=A.getMobilePhone();
		y.activate();
		
		
		AbstractFactory B=new AcerFactory();
		Laptop z=B.getLaptop();
		z.getDescription();
		System.out.println(z.getID());
		MobilePhone q=B.getMobilePhone();
		q.activate();
	}

}
