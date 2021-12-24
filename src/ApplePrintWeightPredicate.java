public class ApplePrintWeightPredicate implements ApplePrintPredicate {
    @Override
    public String print(Apple apple) {
        return "Weight is: " + Double.toString(apple.getWeight());
    }
}
