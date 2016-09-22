/**
 * 
 */
package dw317.lib.creditcard;

/**
 * @author Sebastian
 *
 */
public final class Visa extends AbstractCreditCard{
	private static final long serialVersionUID = 42031768871L;

	/**
	 * 
	 */
	public Visa(String number) {
		// TODO Auto-generated constructor stub
		super(CardType.VISA, validateNumber(number));
	}
	
	private static String validateNumber(String number){
		if (number.substring(0, 1)!="4" || number.length()!=16){
			throw new IllegalArgumentException("INVALID NUMBER"); 
		}
		return number;
	}
}