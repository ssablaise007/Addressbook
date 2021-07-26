package ContactAddreesBook;
import java.util.Scanner;
		
		class Contact{
		public final String firstname, lastname;
	    public final String address, city, state;
	    public final String zip;
	    public final String phoneNumber;
	    public final String email;

	    public Contact(String firstname, String lastname, String address, String city, String state, String zip, String phonenumber, String email) {
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.zip = zip;
	        this.phoneNumber = phonenumber;
	        this.email = email;
	    }
	    public void printContactDetails() {
	    System.out.println("Firstname : " + firstname);
	    System.out.println("Lastname : " + lastname);
	    System.out.println("Address : " + address);
	    System.out.println("City : " + city);
	    System.out.println("State : " + state);
	    System.out.println("Zip : " + zip);
	    System.out.println("PhoneNumber : " + phoneNumber);
	    System.out.println("Email : " + email);
	    }
	}
	public class UC_1 {
	 public static void main(String args[]) {
	        Contact contact = new Contact ("Shoyab", "Blaise", "rangastreet", "ukd", "AndhraPradesh", "515812", "987654322", "ssablaise007@gmail.com");
	        contact.printContactDetails();
	        }
	
}
