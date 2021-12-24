import java.util.ArrayList;
import java.util.List;

public class Apple {
    private Color color;
    private double weight;

    public Apple(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (Color.GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static List<Apple> filterApples(List<Apple> inventory,
                                           ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, ApplePrintPredicate applePrintPredicate) {
        for (Apple apple : inventory) {
            String output = applePrintPredicate.print(apple);
            System.out.println(output);
        }
    }
}
