package boolean_equals_method;

public class Employee {
	int id;
	String name;
	String email;
	
	
	public Employee(  int id,String name, String email) {
		this.id=id;
		this.email=email;
		this.email=email;
	}


	@Override
	public String toString() {
		return id+"is emp id"+name+"is name"+email+"is a email";
	}


	@Override
	public boolean equals(Object obj) {
	 Employee e=(Employee)obj;
	 if(this.id==e.id && this.name==e.name && this.email==e.email ) {
		 return true;
	 }else {
	return false;
	
	}
	
	}
}
