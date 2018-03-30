package heritance;

class Public_Phone extends Phone {
	private String r_type;
	private String location;
	private static int count = 0;
	private static final String TYPE = "Phone";
	
	
	// Constractor --------------------------------------

	Public_Phone(String serialNo, double price, String number, String r_type, String location) {
		super(serialNo, price, number);
		setR_type(r_type);
		setLocation(location);
		count++;
	}

	@Override
	public void finalize() {
		if (count > 1)
		{
			count--;
		}
	}
	
	// Geter & Seter -------------------------------------
	
	void setR_type(String r_type) {
		if (r_type == null)
		{
			this.r_type = "default ring";
		}
		else
		{
			this.r_type = r_type;
		}
	}

	String getLocation() {
		return location;
	}
	void setLocation(String location) {
		this.location = location;
	}

	// Methods ------------------------------------------------
	
	@Override
	void Display () {
		System.out.println("Public Phone: \t");
		super.Display();
		System.out.println(" Number=" + getNumber() + " Ring type=" + r_type + " Location=" + location);
	}
	
	
	void Dialling (String destinantion) {
		
		Display();
		System.out.print("\tRing - ");
		System.out.println("Destination=" + destinantion);
	}

	static void Count(){
		System.out.println("Public Phone count = " + count);
	}

	String Type(){
		return TYPE;
	}
	
}
