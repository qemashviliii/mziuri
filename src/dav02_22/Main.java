package src.dav02_22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*n1
        List<Integer> list = List.of(3, 4);
        System.out.println(list.stream().mapToInt( x -> x*x).sum());

         */

        List<String> strings = List.of("a","aseb","bb112","Bel","uiol","Bamb","bawea","aeaxe","BEBBEREAF");
        strings.stream().filter(Main::flt).collect(Collectors.toList()).forEach(System.out::println);

    }

    public static boolean flt(String a){
        if(a.charAt(0)=='B'){
            return true;
        }else{
            return false;
        }
    }

}
