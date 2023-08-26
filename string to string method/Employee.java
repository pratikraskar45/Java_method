package string_to_string_runtime_polymerphism;

public class Employee {
	int id;
	String name;
	String email;
	
	//constructor calling
	
	public Employee (int id, String name, String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}

//	@Override
//	public String toString() {
//		return super.toString();
//	}
//	
	
	public String toString() {
		return id+" is emp id "+name+" is a name "+email+" is email";
		
	}

}
