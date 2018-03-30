package heritance;

abstract class Device {
	private String serialNo;
	private double price;

	// Constractor ----------------------------------------
	Device (String serialNo, double price) {
		super();
		setSerialNo(serialNo);
		setPrice(price);
	}
	
	// Seter & Geter --------------------------------------

	String getSerialNo() {
		return serialNo;
	}
	void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	
	// Methods ---------------------------------------------------
	void Display() {
		System.out.print(
				" SN :" + getSerialNo() + ", Price :" + getPrice());
	}


}
