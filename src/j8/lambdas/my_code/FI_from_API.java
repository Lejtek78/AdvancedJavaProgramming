package j8.lambdas.my_code;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FI_from_API {

    static void main() {
        FI_from_API fiAPI = new FI_from_API();
        fiAPI.predicate();
    }

    public void predicate() {
        Predicate<String> pStr = s -> s.contains("City");
        System.out.println(pStr.test("Vatican City"));

        BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
        System.out.println(checkLength.test("Marco", 5));
    }

}
