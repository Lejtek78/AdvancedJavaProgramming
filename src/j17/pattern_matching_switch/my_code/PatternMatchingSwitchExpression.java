package j17.pattern_matching_switch.my_code;

sealed abstract class Vehicle permits Car, Boat, Train {}

final class Car extends Vehicle {
    // custom Car method
    public String onRoad(){
        return "I can move on the road";
    }
}

final class Boat extends Vehicle {}

final class Train extends Vehicle {}

public class PatternMatchingSwitchExpression {

    public static void ifStatements(Vehicle v) {
        if (v instanceof Car c) {
            System.out.println("It's a Car: " + c.onRoad());
        } else if (v instanceof Boat) {
            System.out.println("It's a Boat");
        } else if (v instanceof Train) {
            System.out.println("It's a Train");
        } else {
            throw new IllegalArgumentException("Invalid Type");
        }
    }

    public static void patternMatchingSwitch(Vehicle v) {
        switch(v) {
            case Car c -> {
                System.out.println("It's a Car");
                System.out.println("It's a Car: " + c.onRoad());
            }
            case Boat b -> System.out.println("It's a Boat");
            case Train t -> System.out.println("It's a Train");
            default -> throw new IllegalArgumentException("Invalid Type");
        }
    }

    static void main() {
        ifStatements(new Car());
        ifStatements(new Boat());
        ifStatements(new Train());

        patternMatchingSwitch(new Car());
        patternMatchingSwitch(new Boat());
        patternMatchingSwitch(new Train());
    }

}
