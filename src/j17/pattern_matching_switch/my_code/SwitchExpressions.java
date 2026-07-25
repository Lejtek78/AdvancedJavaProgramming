package j17.pattern_matching_switch.my_code;

public class SwitchExpressions {

    enum Direction {NORTH, SOUTH, EAST, WEST}

    static void main() {
        Direction d = Direction.NORTH;

        int numLetters = 0;

        switch (d) {
            case NORTH:
            case SOUTH:
                numLetters = 5;
                break;
            case EAST:
            case WEST:
                numLetters = 4;
                break;
        }

        System.out.println(numLetters);


        switch (d) {
            case NORTH, SOUTH -> numLetters = 5;
            default -> numLetters = 4;
        }

        System.out.println(numLetters);

        System.out.println(
                switch (d) {
                    case NORTH, SOUTH -> 5;
                    default -> 4;
                }
        );

        System.out.println(
                switch (d) {
                    case NORTH, SOUTH:
                        yield 5;    // 'yield' came in Java 13
                    default:
                        yield 4;
                }
        );

    }

}
