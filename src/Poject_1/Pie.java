package Poject_1;

public class Pie extends Food {

	public void consume() {
		System.out.print(this + " съеден");
	}
	
	private String taste;
	private Double calories = null;
	
	public String getTaste() {
		return taste;
		}
	public void setTaste(String taste) {
		this.taste = taste;
		}
	public double calculateCalories()
    {
        if(taste.equals("apple"))
        {
            calories = 370.0;
        }
        else if(taste.equals("cherry"))
        {
        	calories = 400.0;
        }
        else if(taste.equals("strawberry"))
        {
        	calories = 430.0;
        }
        return calories;
    }
	public Pie (String taste) {
		super("пирог");
		this.taste = taste;
		}
	public String toString() {
		return taste.toUpperCase() + " " + super.toString();
		}
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
		if (!(arg0 instanceof Pie)) return false;
		return taste.equals(((Pie)arg0).taste);
		} else
		return false;
		}
}
