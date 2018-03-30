package heritance;

import java.util.Random;

class Cell_Phone extends Phone {

	private String provider;
	private String[] r_type;
	private static int count = 0;
	private static final String TYPE = "Phone";

	// Constractor --------------------------------------

	Cell_Phone(String serialNo, double price, String number, String provider, String[] r_type) {
		super(serialNo, price, number);
		setProvider(provider);
		setR_type(r_type);
		count++;
	}
	// Geter & Seter -------------------------------------

	String getProvider() {
		return provider;
	}

	void setProvider(String provider) {
		this.provider = provider;
	}

	String[] getR_type() {
		return r_type;
	}

	void setR_type(String[] r_type) {
		if (r_type == null) {
			this.r_type = new String[] { "TRALI", "DILI DILI", "beseeder beseeder", "kashe li kashe li" };
		} else {
			this.r_type = r_type;
		}
	}

	// Methods ------------------------------------------------

	@Override
	void Display() {
		System.out.print("Cell Phone: ");
		super.Display();
		System.out.println("\t No = " + super.getNumber() + " Provider = " + provider);
		if (r_type.length > 0) {
			System.out.print("\tRings: ");

			for (String r : r_type) {
				System.out.print("\t\t" + r);
			}
		}
		System.out.println();
	}

	@Override
	void Dialling(String destination) {
		Random rand = new Random();
		int n = rand.nextInt(r_type.length - 1);

		System.out.print("Cell Phone: ");
		System.out.println(" No = " + super.getNumber() + " Provider = " + provider + ", RingTone = " + r_type[n]);
		System.out.print("\tRing - ");
		System.out.println("Destination=" + destination);
	}

	static void Count() {
		System.out.println("Cell Phone count = " + count);
	}

	String Type() {
		return TYPE;
	}

}
