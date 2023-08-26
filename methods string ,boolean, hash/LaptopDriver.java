package methods_string_boolean_hash;

public class LaptopDriver {

	public static void main(String[] args) {
		Laptop l1= new Laptop("HP","8GB","RYZEN",45900);
		Laptop l2= new Laptop("HP","8GB","RYZEN",45900);		
		
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
		System.out.println(l1.equals(l2));
	}

}
