import java.util.*;
interface MealPlan {
    String getMealType();
    List<String> getMeals();
}
class VegetarianMeal implements MealPlan {
    private List<String> meals;
    public VegetarianMeal() {
        this.meals = new ArrayList<>();
        meals.add("Dum aloo");
        meals.add("Paneer Tikka");
        meals.add("Paneer Butter Masala");
    }

    @Override
    public String getMealType() {
        return "Veg";
    }

    @Override
    public List<String> getMeals() {
        return meals;
    }
}
class VeganMeal implements MealPlan {
    private List<String> meals;
    public VeganMeal() {
        this.meals = new ArrayList<>();
        meals.add("Salad");
        meals.add("Fry");
        meals.add("Quinoa Bowl");
    }

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public List<String> getMeals() {
        return meals;
    }
}
class KetoMeal implements MealPlan {
    private List<String> meals;
    public KetoMeal() {
        this.meals = new ArrayList<>();
        meals.add("Avocado");
        meals.add("Omelette");
        meals.add("Rice ");
    }

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public List<String> getMeals() {
        return meals;
    }
}

class HighProteinMeal implements MealPlan {
    private List<String> meals;

    public HighProteinMeal() {
        this.meals = new ArrayList<>();
        meals.add("Salmon");
        meals.add("Spinach");
        meals.add("Quinoa");
    }

    @Override
    public String getMealType() {
        return "low-Protein";
    }

    @Override
    public List<String> getMeals() {
        return meals;
    }
}
class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }
    public void displayMealPlan() {
        System.out.println("Meal Type: " + mealPlan.getMealType());
        System.out.println("Meals: " + mealPlan.getMeals());
    }
}
class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        System.out.println("Generating meal plan for: " + mealPlan.getMealType());
        return new Meal<>(mealPlan);
    }
}
public class P4_MealPlanGenerator{
	public static void main(String args[]){
		Meal<VegetarianMeal> veg = MealPlanGenerator.generateMealPlan(new VegetarianMeal());
        veg.displayMealPlan();

        Meal<VeganMeal> vm = MealPlanGenerator.generateMealPlan(new VeganMeal());
        vm.displayMealPlan();

        Meal<KetoMeal> km = MealPlanGenerator.generateMealPlan(new KetoMeal());
        km.displayMealPlan();

        Meal<HighProteinMeal> hm = MealPlanGenerator.generateMealPlan(new HighProteinMeal());
        hm.displayMealPlan();
	}
}