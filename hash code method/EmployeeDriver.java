package hash_code_method;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1= new Employee(1024,"xyz","xyz@gmail.com");
		Employee e2= new Employee(1024,"xyz","xyz@gmail.com");
		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.equals(e2));
	}

}
