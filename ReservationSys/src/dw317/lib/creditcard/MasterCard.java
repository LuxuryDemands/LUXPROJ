/**
 * 
 */
package dw317.lib.creditcard;

/**
 * @author Sebastian
 *
 */
public final class MasterCard extends AbstractCreditCard{
	private static final long serialVersionUID = 42031768871L;

	/**
	 * 
	 */
	public MasterCard(String number) {
		// TODO Auto-generated constructor stub
		super(CardType.MASTERCARD, validateNumber(number));
	}
	
	private static String validateNumber(String number){
		if (checkStartingDigits(number) || number.length()!=16){
			throw new IllegalArgumentException("INVALID NUMBER"); 
		}
		return number;
	}
	private static boolean checkStartingDigits(String number){
		boolean condition = true;
		String firstTwoDigits = number.substring(0, 2);
		switch (firstTwoDigits){
		case "51":
			condition = false;
			break;
		case "52":
			condition = false;
			break;
		case "53":
			condition = false;
			break;
		case "54":
			condition = false;
			break;
		case "55":
			condition = false;
			break;
		default:
			condition = true;
		}
		return condition;
	}
}
