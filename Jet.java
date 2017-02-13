package jets;

public class Jet {

	protected String model;
	protected float speed;
	protected float range;
	protected int price;

	public Jet(String model, float speed, float range, int price) {
        this.model = model;
        this.speed = speed;
        this.range = range;
        this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		this.range = range;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

    public String toString() {
        return  " Model: " + model + 
                "\n Speed:  " + speed + "  mach" +
                "\n Range:  " + range + "  miles" +
                "\n Price:  " + "$" + price +
                "\n\n";
    }
	
}
