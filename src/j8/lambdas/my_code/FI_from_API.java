package j8.lambdas.my_code;

import java.time.LocalTime;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FI_from_API {

    static void main() {
        FI_from_API fiAPI = new FI_from_API();
//        fiAPI.predicate();
        fiAPI.supplier();

    }

    public void predicate() {
        Predicate<String> pStr = s -> s.contains("City");
        System.out.println(pStr.test("Vatican City"));

        BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
        System.out.println(checkLength.test("Marco", 5));
    }

    public void supplier() {
        Supplier<StringBuilder> supSB = () -> new StringBuilder();
        System.out.println("Supplier SB: " + supSB.get().append("SK"));

        Supplier<LocalTime> supTime = () -> LocalTime.now();
        System.out.println("Supplier time: " + supTime.get());

        Supplier<Double> sRandom = () -> Math.random();
        System.out.println(sRandom.get());
    }

}
