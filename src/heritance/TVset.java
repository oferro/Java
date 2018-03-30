package heritance;

class TVset extends Device {
	private int inch;
	private static int count = 0;
	private static final String TYPE = "TV";

	// Constractor -----------------------------------------------
	TVset(String serialNo, double price, int inch) {
		super(serialNo, price);
		setInch(inch);
		count++;
	}

	// Geter & Seter ----------------------------------------------
	int getInch() {
		return inch;
	}

	void setInch(int inch) {
		this.inch = inch;
	}

	// Methods ---------------------------------------------------
	@Override
	void Display() {
		System.out.print("TVset: ");
		super.Display();
		System.out.print(", Screeen size :"  + inch);
		System.out.println();
	}

	static void Count() {
		System.out.println("TVset count = " + count);
	}

	String Type() {
		return TYPE;
	}

}
