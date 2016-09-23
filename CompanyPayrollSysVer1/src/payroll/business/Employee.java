/**
 * 
 */
package payroll.business;

import dw317.lib.Person;
import dw317.lib.Address;

/**
 * @author C. Legendre
 * @version 3.0, 2013/08/28
 *
 */
public abstract class Employee extends Person
{
	
	private String number;
	private String department;
	
	public Employee(String number, String firstName, 
					String lastName, String department, Address address)
	{
		super(firstName, lastName, address);
		this.number = number;
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
		
	public abstract double getWeeklyGrossPay();
}
