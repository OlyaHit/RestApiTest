package TwitterApi.RestApi;

public class Person {

	public Person(String id, String name, String username, Address[] address) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.address = address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	private String id;
	private String name;
	private String username;
	private Address [] address;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	public Address[] getAddress() {
		return address;
	}
}
