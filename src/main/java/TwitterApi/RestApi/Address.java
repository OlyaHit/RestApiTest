package TwitterApi.RestApi;

public class Address {
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	
	public Address(String street, String suite, String city, String zipcode) {
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
	}

}
