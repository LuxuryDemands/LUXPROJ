package dw317.lib;

import static java.lang.System.out;

public class AddressTest {

	public static void main(String[] args) {
		testTheThreeParameterConstructor();
	}

	public static void testTheThreeParameterConstructor() {
		out.println("\nTesting the three parameter constructor.");
		testTheThreeParameterConstructor("Case 1 - Valid data (3040 Sherbrooke Westmount)", "3040", "Sherbrooke",
				"Westmount", true);
		/*testTheThreeParameterConstructor("Case 2 - Invalid data – empty civicNumber ( Sherbrooke Westmount)", "",
				"Sherbrooke", "Westmount", false);*/
	}

	private static void testTheThreeParameterConstructor(String testCase, String civicNumber, String streetName,
			String city, boolean expectValid) {

		out.println("   " + testCase);

		Address theAddress = new Address(civicNumber, streetName, city);
		out.print("\tThe Address instance was created: " + theAddress);

		if (!expectValid)
			out.print("  Error! Expected Invalid. ==== FAILED TEST ====");

		out.println("\n");
	}
}
