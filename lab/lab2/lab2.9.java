package lab2_9;
import java.util.Scanner;
	
class Address {
	private String street;
    private String city;
    private String zipCode;
    
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    public String getFullAddress() {
        return this.street + ", " + this.city + ", " + this.zipCode;
    }
}
class Student {
	private String name;
	private Address address;
	
	public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
	public void displayProfile() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address.getFullAddress());
	}	
}

public class lab2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    String inputName = input.nextLine();
    String inputStreet = input.nextLine();
    String inputCity = input.nextLine();
    String inputZipCode = input.nextLine();
    input.close();
        
    Address addressObject = new Address(inputStreet, inputCity, inputZipCode);
        Student studentObject = new Student(inputName, addressObject);
       
    studentObject.displayProfile();
	}
}
