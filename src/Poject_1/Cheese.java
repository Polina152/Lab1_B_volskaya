package Poject_1;

public class Cheese extends Food {

	private Double calories = null;
	
	public Cheese() {
		super("ׁûנ");
		}
	public double calculateCalories()
    {
		calories = 40.0;
		return calories;
    }
	public void consume() {
		System.out.print(this + " סתוהום");
		}

}
