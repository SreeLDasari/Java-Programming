
public class Person {
	private int age;
	private String firstName,lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public void setAge(int age) {
		this.age=age;
		if(age<0 || age>100) {
			age=0;
		}
	}
	
	public boolean isTeen() {
		if(age>12 && age<20) {
			return true;
		}
		return false;
	}
	public String getFullName() {
		String empty="";
		if(firstName=="" && lastName=="") {
			return empty;
		}
		else if(lastName=="") {
			return firstName;
		}else if(firstName=="") {
			return lastName;
		}
		return firstName+" "+lastName;
	}
	
	
	

	public static void main(String[] args) {

		Person person = new Person();
		person.setFirstName("");   // firstName is set to empty string
		person.setLastName("");    // lastName is set to empty string
		person.setAge(10);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John");    // firstName is set to John
		person.setAge(18);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setLastName("Smith");    // lastName is set to Smith
		System.out.println("fullName= " + person.getFullName());
	}

}
