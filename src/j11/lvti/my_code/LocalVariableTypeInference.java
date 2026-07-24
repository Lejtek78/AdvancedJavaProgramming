package j11.lvti.my_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalVariableTypeInference {

    static void main() {
        var x = 2;      // int
        var y = 3.2;    // double
        var t = "abc";  // String

        List<String> ls = new ArrayList<>();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.removeIf((var s) -> s.equals("a"));
        System.out.println(ls);
    }

    // init block
    {
        var d = 4.5;
        d = 98.9;
        var i = (String) null;

        var var = 3.1415;
    }

    LocalVariableTypeInference() {
        var i = 9;

        var s = (String) null;
    }

}
