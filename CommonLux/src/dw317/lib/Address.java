/**
* Defines an Address type.
*/
package dw317.lib;

/**
 * @author Sebastian
 */
public class Address {
	private String city = "";
	private String civicNumber = "";
	private String province = "";
	private String code = "";
	private String streetName = "";

	public Address(String civicNumber, String streetName, String city) {
		this.civicNumber = validateExistence("civic number", civicNumber);
		this.streetName = validateExistence("street name", streetName);
		this.city = validateExistence("city", city);
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return the civicNumber
	 */
	public String getCivicNumber() {
		return civicNumber;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCivicNumber(String civicNumber) {
		this.civicNumber = civicNumber;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/**
	 * @return the formatted address (civicNumber + streetName + city + province + code)
	 */
	@Override
	public String toString() {
		return (civicNumber + "*" + streetName + "*" + city + "*" + province + "*" + code);
	}
	/**
	 * validates if the String fields are not empty or null, throws IAE
	 * @return the trimmedString
	 */
	private String validateExistence(String fieldName, String fieldValue) {
		 if (fieldValue == null)
				throw new IllegalArgumentException("Address Error - " + fieldName
					+ " must exist. Invalid value = " + fieldValue);
		String trimmedString = fieldValue.trim();
		if (trimmedString.trim().isEmpty())
			throw new IllegalArgumentException(
					"Address Error - " + fieldName + " must exist. Invalid value = " + fieldValue);
		return trimmedString;
	}

}