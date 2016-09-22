package dw317.lib.creditcard;

public class Email implements Serializable Comparable<Email> {

	private final String  serialVersionUID = "42031868871L";
	private final String address;
	
	
	public Email (String address) {
		this.address = address;
			
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getUserId()
	{
		return userId;
	}
	
	public String getHost()
	{
		return host;
	}
	
	
	//@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || this.getClass() != obj.getClass())
			return false;
			Email other = (Email) obj;
		if (!this.getAddress().equalsIgnoreCase(other.getAddress()))
				return false;
		return true;
	}
	
	public String getNumber()
	{
		
	}
	
	public Scheme getType()
	{
		
	}
	
	public String toString()
	{
		return address;
	}
	
	private String validateEmail(String email) throws IllegalArgumentException
	{
		
	}




}

