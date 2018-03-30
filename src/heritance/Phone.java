package heritance;

class Phone extends Device {

	private String number;

	// Constractor --------------------------------------
		
	Phone(String serialNo, double price, String number) {
		super(serialNo, price);
		setNumber(number);
	}

	// Geter & Seter -------------------------------------

	String getNumber() {
		return number;
	}

	void setNumber(String number) {
		this.number = number;
	}

	// Methods ------------------------------------------------
//	@Override
//	void Display() {
//	}
	
	void Dialling(String s){
	}
	
}
