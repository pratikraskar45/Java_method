package methods_string_boolean_hash;

import java.util.Objects;

public class Car {
	String brand;
	String name;
	double price;
	String color;
	
	public Car(String brand,String name,double price,String color) {
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.color=color;
		
	}

	@Override
	public String toString() {
		return "["+brand+","+name+","+price+","+color+"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, name, price,color);
	}


}
