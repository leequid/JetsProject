package jets;

import java.lang.Math;

public class Barracks {
	
	private static int numPilot = 5;
	private Pilot[] pilots = new Pilot[5];
	{
		pilots[0] = new Pilot("Jhon", "Male", 29, 1);
		pilots[1] = new Pilot("Mary", "Girl", 31, 2);
		pilots[2] = new Pilot("Lina", "Girl", 26, 3);
		pilots[3] = new Pilot("Eric", "Male", 29, 4);
		pilots[4] = new Pilot("Sam", "Male", 30, 5);
	}

	public void shufflePilot() {
		Pilot[] temp = pilots;
		for (int j = 0; j <pilots.length; j++) {
			pilots [j] = null;
		}
		for (int i = 0; i < pilots.length; i++) {

			int randomnum;
			do {
				randomnum = (int) (Math.random() * numPilot);
			} while (temp[randomnum] == null);
			
			pilots [i] = temp[randomnum];
			
		}
	}
	
	public void addPilot(Pilot p) {
		Pilot[] temp = pilots;
		numPilot++;
		pilots = new Pilot[numPilot];
		for (int i = 0; i < temp.length; i++) {
			pilots[i] = temp[i];
		}
		pilots[numPilot - 1] = p;
	}

	public static int getNumPilot() {
		return numPilot;
	}

	public static void setNumPilot(int numPilot) {
		Barracks.numPilot = numPilot;
	}

	public Pilot[] getPilots() {
		return pilots;
	}

	public void setPilots(Pilot[] pilots) {
		this.pilots = pilots;
	}
	

}
