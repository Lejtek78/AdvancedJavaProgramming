package j8.lambdas.my_code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


public class LambdaEffectivelyFinal {
    String name = "";

    static void main() {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("John");

        int x = 12;

//        x++;

        Predicate<String> lambda = s -> {
            new LambdaEffectivelyFinal().name = "Kennedy";
            System.out.println("x == " + x);
            return s.isEmpty() && x % 2 == 0;
        };

//        x++;
        filterData(a1, lambda);
        System.out.println(a1);

        new LambdaEffectivelyFinal().name = "Sean";

        filterData(a1, lambda);


    }

    public static void filterData(List<String> list, Predicate<String> lambda) {
        Iterator<String> i = list.iterator();

        while (i.hasNext()) {
            if (lambda.test(i.next())) {
                i.remove();
            }
        }
    }
}
