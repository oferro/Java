package heritance;

public class Main {

	public static void main(String[] args) {
		// 1B
		System.out.println("\t 1B --------------------------------------------------------------");

		Public_Phone p1 = new Public_Phone("SNp1", 2.58, "081234567", "RingRing", "Beer Sheva");
		Public_Phone p2 = new Public_Phone("SNp2", 1.00, "039876543", "KingRing", "Tel Aviv");

		Cell_Phone c1 = new Cell_Phone("SNc1", 890.50, "0542555300", "Partner", new String[] { "r1", "r2" });
		Cell_Phone c2 = new Cell_Phone("SNc2", 1000.00, "0528885544", "Cellcom", new String[] { "r3", "r4" });
		p1.Display();
		p2.Display();
		
		System.out.println("p1 dilling to p2:");
		p1.Dialling(c2.getNumber());
		c1.Dialling(p2.getNumber());

		System.out.println("\t Count------------------------------------------------------------");
		Cell_Phone.Count();
		Public_Phone.Count();

		// 1C
		System.out.println("\t 1C --------------------------------------------------------------");

		Device[] devices = new Device[5];

		devices[0] = new TVset("SNtv1", 100.0, 55);
		devices[1] = new Public_Phone("SNp1", 2.58, "081234567", "RingRing", "Beer Sheva");
		devices[2] = new Public_Phone("SNp2", 1.00, "039876543", "KingRing", "Tel Aviv");
		devices[3] = new Cell_Phone("SNc1", 890.50, "0542555300", "Partner", null);
		devices[4] = new Cell_Phone("SNc2", 1000.00, "0528885544", "Cellcom", new String[] { "r1", "r2", "r3", "r4" });

		Device prevD = null;
		for (Device d : devices) {
			d.Display();
			if (d instanceof Phone) {
				if (prevD != null) {
					((Phone) d).Dialling(((Phone) prevD).getNumber());
				}
				prevD = d;
			}
		}
		System.out.println();
		System.out.println("\t Total Count-----------------------------------------------------");
		Cell_Phone.Count();
		Public_Phone.Count();


	}
}
