/**
 * 
 */
package dw317.lib;

/**
 * @author Sebastian
 *
 */
public class Person {
	protected Name name;
	protected Address address;

	/**
	 * @param name
	 * @param address
	 */
	public Person(String firstName, String lastName) {
		this.name.firstName = firstName;
		this.name.lastName = lastName;
		this.address = new Address();
	}

	/**
	 * @param name
	 * @param address
	 */
	public Person(String firstName, String lastName, Address address) {
		this.name.firstName = firstName;
		this.name.lastName = lastName;
		this.address = address;
	}

	/**
	 * @return the name
	 */
	public Name getName() {
		Name nameToReturn = this.name;
		return nameToReturn;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		Address addressToReturn = this.address;
		return addressToReturn;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String firstName, String lastName) {
		this.name.firstName = firstName;
		this.name.lastName = lastName;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return name.toString() + "*" + (address == null ? "" : address.toString());
	}

}
