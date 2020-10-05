package Poject_1;

public class Apple extends Food {

	private String size;
	private Double calories = null;
	
	public Apple(String size) {
		super("Яблоко");
		this.size = size;
		}
	public double calculateCalories()
    {
        if(size.equals("small"))
        {
        	calories = 50.0;
        }
        else if(size.equals("medium"))
        {
        	calories = 70.0;
        }
        else if(size.equals("big"))
        {
        	calories = 90.0;
        }
        return calories;
    }
	public void consume() {
		System.out.print(this + " съедено");
		}
	public String getSize() {
		return size;
		}
	public void setSize(String size) {
		this.size = size;
		}
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
		if (!(arg0 instanceof Apple)) return false;
		return size.equals(((Apple)arg0).size);
		} else
		return false;
		}
	public String toString() {
		return super.toString() + " размера " + size.toUpperCase();
		}

}
