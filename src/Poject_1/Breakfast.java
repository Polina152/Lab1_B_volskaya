package Poject_1;

import java.lang.reflect.Constructor;
import java.util.*;

public class Breakfast
{
	@SuppressWarnings("unchecked")

	public static void main(String[] args)
	{
		Food[] breakfast = new Food[20];
		int itemsSoFar = 0;
		boolean cals, sort;
		cals = sort = false;
		
		for (String arg: args) {
			String[] parts = arg.split("/");
			if (parts[0].equals("Cheese")) {
				breakfast[itemsSoFar] = new Cheese();
			} else
				if (parts[0].equals("Apple")) {
					breakfast[itemsSoFar] = new Apple(parts[1]);
				}
			if (parts[0].equals("Pie")) {
				breakfast[itemsSoFar] = new Pie(parts[1]);
			}
			itemsSoFar++;
			switch (parts[0]) {
            case "-sort":
                sort = true;
                break;
            case "-calories":
                cals = true;
                break;
			}
		}
		if (sort) {
            Arrays.sort(breakfast, new Comparator() {
                public int compare(Object o1, Object o2)
                {
                	if (o1 == null || ((Food)o2).calculateCalories() < ((Food)o1).calculateCalories())
                    {
                        return -1;
                    }

                    if (o2 == null || ((Food)o2).calculateCalories() > ((Food)o1).calculateCalories())
                    {
                        return 1;
                    }
                    else return 0;
                }
            });
            System.out.println("Завтрак (отсортированный):");
            for (Food item : breakfast)
            {
                if (item != null)
                {
                    if (item.calculateCalories()==0.0)
                        continue;
                    item.consume();
                    System.out.println(" " + item.calculateCalories());
                }
            }
		}
		if (!sort)
		{
			System.out.println("Завтрак: ");
	        for (Food item : breakfast) {
	            if (item != null)
	            {
	                item.consume();
	                System.out.println(" " + item.calculateCalories());
	            }
	        }
		}
		if (cals)
        {
            double AllCalories = 0.0;
            for (Food item : breakfast)
            {
                if (item != null)
                    AllCalories += item.calculateCalories();
            }
            System.out.println("Общее количество калорий: " + AllCalories);
        }
		
		System.out.println("Всего хорошего!");

	}

}
