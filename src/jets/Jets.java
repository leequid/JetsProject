package jets;

public class Jets {
	private String name;
	private double speed;
	private double range;
	private double price;
	private int capacity;
	private Pilot pilot;
		
	public Jets(String name, double speed, double range, int capacity, double price, Pilot pilot) {
		super();
		this.name = name;
		this.speed = MphToMach(speed);
		this.range = range;
		this.capacity = capacity;
		this.price = price;
		this.pilot = pilot;
	}
	
	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public double MphToMach(double Mphspd){
		return Mphspd*(1/761.21d);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
