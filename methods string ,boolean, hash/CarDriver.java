package methods_string_boolean_hash;

public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car("BMW","A7",657500,"black");
		System.out.println(c1);
		
		Car c2=new Car("BMW","A7",657500,"black");
		
		System.out.println(c1.equals(c2));
		
		System.out.println("===========================");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
	}

}
