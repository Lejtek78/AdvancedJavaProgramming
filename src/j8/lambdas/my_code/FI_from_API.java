package j8.lambdas.my_code;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;

public class FI_from_API {

    static void main() {
        FI_from_API fiAPI = new FI_from_API();
//        fiAPI.predicate();
//        fiAPI.supplier();
//        fiAPI.consumer();
//        fiAPI.function();
        fiAPI.unaryBinaryOperator();

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

    public void consumer() {
        Consumer<String> printC = s -> System.out.println(s);
        printC.accept("To be or not to be, that is the question");

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.forEach(printC);

        var mapCapitalCities = new HashMap<String, String>();

        BiConsumer<String, String> biCon = (key,value) -> mapCapitalCities.put(key, value);
        biCon.accept("Dublin", "Ireland");
        biCon.accept("Washington D.C.", "USA");
        System.out.println(mapCapitalCities);

        BiConsumer<String, String> mapPrint = (key, value) -> System.out.println(key + ": " + value);
        mapCapitalCities.forEach(mapPrint);
    }

    public void function() {
        Function<String, Integer> fn2 = s -> s.length();
        System.out.println("Function: " + fn2.apply("Moscow"));

        BiFunction<String, String, Integer> biFn = (s1, s2) -> s1.length() + s2.length();
        System.out.println("BiFunction: " + biFn.apply("William", "Shakespeare"));
        
        BiFunction<String, String, String> biFn2 = (s1, s2) -> s1.concat(s2);
        System.out.println("BiFunction: " + biFn2.apply("William ", "Shakespeare"));
    }

    public void unaryBinaryOperator() {
        UnaryOperator<String> unaryOp = name -> "My name is " + name;
        System.out.println("Unary operator: " + unaryOp.apply("Sean"));

        BinaryOperator<String> binaryOp = (s1, s2) -> s1.concat(s2);
        System.out.println("Binary operator: " + binaryOp.apply("William ", "Shakespeare"));
    }

}
