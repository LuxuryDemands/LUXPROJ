/**
 * 
 */
package dw317.lib.creditcard;
/**
 * @author Sebastian
 *
 */
public final class Amex extends AbstractCreditCard{
	private static final long serialVersionUID = 42031768871L;

	/**
	 * 
	 */
	public Amex(String number) {
		// TODO Auto-generated constructor stub
		super(CardType.AMEX, validateNumber(number));
	}
	
	private static String validateNumber(String number){
		if (checkStartingDigits(number) || number.length()!=15){
			throw new IllegalArgumentException("INVALID NUMBER"); 
		}
		return number;
	}
	private static boolean checkStartingDigits(String number){
		boolean condition = true;
		String firstTwoDigits = number.substring(0, 2);
		switch (firstTwoDigits){
		case "34":
			condition = false;
			break;
		case "37":
			condition = false;
			break;
		default:
			condition = true;
		}
		return condition;
	}
}