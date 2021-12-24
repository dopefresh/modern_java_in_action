import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(Color.GREEN, 180.6));
        apples.add(new Apple(Color.RED, 94.3));
        apples.add(new Apple(Color.GREEN, 80.5));
        apples.add(new Apple(Color.GREEN, 200));
        apples.add(new Apple(Color.RED, 110.6));
//        Apple.prettyPrintApple(apples, new ApplePrintAllAttrsPredicate());

//        List<Apple> result = Apple.filterApples(apples, new AppleHeavyWeightPredicate());
//        System.out.println(result.toString());

//        List<Apple> redApples = Apple.filterApples(apples, new ApplePredicate() {
//            public boolean test(Apple apple){
//                return Color.RED.equals(apple.getColor());
//            }
//        });

//        List<Apple> result =
//                Apple.filterApples(apples, (Apple apple) -> Color.RED.equals(apple.getColor()));
//        System.out.println(result.toString());
        apples.sort((Apple a1, Apple a2) -> Double.compare(a2.getWeight(), a1.getWeight()));
        Apple.prettyPrintApple(apples, new ApplePrintAllAttrsPredicate());
        Thread t = new Thread(() -> System.out.println("Hello world"));
        t.run();

        Runnable x = () -> {
            System.out.println(5);
        };
        x.run();
    }
}
