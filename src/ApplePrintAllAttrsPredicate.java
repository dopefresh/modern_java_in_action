public class ApplePrintAllAttrsPredicate implements ApplePrintPredicate {
    @Override
    public String print(Apple apple) {
        return "Weight is " + apple.getWeight() + "\t Color is "
                + apple.getColor() + "\t is heavy?: "
                + Boolean.toString(apple.getWeight() > 150);
    }
}
