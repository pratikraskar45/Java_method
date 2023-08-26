package methods_string_boolean_hash;

import java.util.Objects;

public class Laptop {
	String brand;
	String ram;
	String processor;
	double price;
	
	
	public Laptop(String brand, String ram,String processor,double price) {
		this.brand=brand;
		this.ram=ram;
		this.processor=processor;
		this.price=price;
	}


	@Override
	public String toString() {
		return brand+"is brsnd"+ram+"is ram"+processor+"is a processor"+price+"is price";
	}


	@Override
	public boolean equals(Object obj) {
	 Laptop l=(Laptop)obj;
	 if(this.brand==l.brand && this.ram==l.ram && this.processor==l.processor && this.price==l.price ) {
		 return true;
	 }else {
	return false;
	}
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand,ram,processor,price);

	}
}
