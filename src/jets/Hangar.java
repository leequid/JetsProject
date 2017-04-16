package jets;

public class Hangar {
	private Jets[] garage = new Jets[5];
	private static int numJets = 5;
	private Pilot[] pilots = new Pilot [5];
	
	
	{
		garage[0] = new Jets("Boeing 838", 423, 12, 100, 3_000_000_000d, pilots[0]);
		garage[1] = new Jets("Boeing 800", 400, 13, 120, 3_000_000_000d, pilots[1]);
		garage[2] = new Jets("Boeing 892", 500, 23, 130, 3_000_000_000d, pilots[2]);
		garage[3] = new Jets("Boeing 712", 450, 4, 413, 3_000_000_000d, pilots[3]);
		garage[4] = new Jets("Boeing 431", 400, 55, 453, 3_000_000_000d, pilots[4]);
	}

	public void addJets(Jets jet) {
		Jets[] temp = garage;
		numJets++;
		garage = new Jets[numJets];
		for (int i = 0; i < temp.length; i++) {
			garage[i] = temp[i];
		}
		garage[numJets - 1] = jet;
	}

	public Jets[] getGarage() {
		return garage;
	}

	public void setGarage(Jets[] garage) {
		this.garage = garage;
	}

	public static int getNumJets() {
		return numJets;
	}

	public static void setNumJets(int numJets) {
		Hangar.numJets = numJets;
	}

	public void printJetList() {
		for (int i = 0; i < numJets; i++) {
			StringBuilder builder = new StringBuilder();
			builder.append("Jet-Name: ");
			builder.append(garage[i].getName());
			builder.append(", Jet-Speed (Mach): ");
			builder.append( String.format( "%.5f", garage[i].getSpeed()));
			builder.append(", Jet-Range (mile): ");
			builder.append(garage[i].getRange());
			builder.append(", Jet-Capacity (people): ");
			builder.append(garage[i].getCapacity());
			builder.append(", Jet-Price (dollars): ");
			builder.append(String.format("%.2f", garage[i].getPrice()));
			System.out.println(builder);
		}

	}

	public void maxSpeed() {

		Jets tempJet = new Jets("temp", 0, 0, 0, 0, null);

		for (int i = 0; i < garage.length; i++) {
			for (int j = 0; j < garage.length; j++) {

				if (garage[i].getSpeed() > garage[j].getSpeed()) {
					tempJet = garage[i];
					garage[i] = garage[j];
					garage[j] = tempJet;
				}

			}

		}
		System.out.println("The jet " + garage[0].getName() + " is fastest jet that we have and its speed is "
				+ garage[0].getSpeed());

		System.out.println("Following is the organized jet list in decending (speed) order.");
		printJetList();

	}

	public void maxRange() {

		Jets tempJet = new Jets("temp", 0, 0, 0, 0,null);

		for (int i = 0; i < garage.length; i++) {
			for (int j = 0; j < garage.length; j++) {

				if (garage[i].getRange() > garage[j].getRange()) {
					tempJet = garage[i];
					garage[i] = garage[j];
					garage[j] = tempJet;
				}

			}

		}
		System.out.println("The jet " + garage[0].getName() + " is the jet with the longest range that can fly  "
				+ garage[0].getRange());
		System.out.println("Following is the organized jet list in decending (range) order.");
		printJetList();

	}

}
