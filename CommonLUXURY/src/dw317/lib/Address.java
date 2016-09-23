/**
 * Defines an Address type
 */
package dw317.lib;

import java.util.Optional;

/**
 * @author Juan Sebastian Ramirez
 *
 */
public class Address {
	private String city;
	private String civicNumber;
	private String streetName;
	private String province = "";
	private String code = "";

	public Address() {

	}

	public Address(String civicNumber, String streetName, String city) {
		this.civicNumber = validateExistence("civic number", civicNumber);
		this.streetName = validateExistence("street name", streetName);
		this.city = validateExistence("city", city);
	}
	public Address(String civicNumber, String streetName, String city, Optional<String> province, Optional<String> code) {
		this.civicNumber = validateExistence("civic number", civicNumber);
		this.streetName = validateExistence("street name", streetName);
		this.city = validateExistence("city", city);
		this.province = province.orElse("");
		this.code = code.orElse("");
	}

	/**
	 * Returns a String representation of the address.
	 * 
	 * @return address a formatted address.
	 */
	public String getAddress() {
		String address = civicNumber + " " + streetName + "\n" + city;
		address += (province.equals("") ? "" : (", " + province)) + (code.equals("") ? "" : ("\n" + code));

		return address;
	}

	/**
	 * Returns the city
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Returns the civicNumber
	 * @return the civicNumber
	 */
	public String getCivicNumber() {
		return civicNumber;
	}

	/**
	 * Returns the streetName
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Returns the province
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * Returns the code
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the city to a new value
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Sets the civicNumber to a new value
	 * @param civicNumber
	 *            the civicNumber to set
	 */
	public void setCivicNumber(String civicNumber) {
		this.civicNumber = civicNumber;
	}

	/**
	 * Sets the streetName to a new value
	 * @param streetName
	 *            the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * Sets the province to a new value
	 * @param province
	 *            the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * Sets the code to a new value
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return (civicNumber + "*" + streetName + "*" + city + "*" + province + "*" + code);
	}
	/**
	 * Validates
	 * @param fieldName
	 * @param fieldValue
	 * @return trimmedString;
	 */
	private String validateExistence(String fieldName, String fieldValue) {
		if (fieldValue == null)
			throw new IllegalArgumentException("Address Error - " + fieldName + " must exist. Invalid value = " + fieldValue);
		String trimmedString = fieldValue.trim();
		if (trimmedString.trim().isEmpty())
			throw new IllegalArgumentException(
					"Address Error - " + fieldName + " must exist. Invalid value = " + fieldValue);
		return trimmedString;
	}
}
