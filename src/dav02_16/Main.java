package dav02_16;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        /*n1
        System.out.println("Choose length of your string");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Supplier<String> supplier = () -> randStr(n);
        System.out.println(supplier.get());

         */
        /*n2
         Scanner scanner = new Scanner(System.in);
         String a = scanner.nextLine();
        Consumer<String> consumer = input -> inp(a);
        consumer.accept(a);
        
         */
        /*n3
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Function<String,String> stringReverse = a -> reverse(a);
        System.out.println(stringReverse.apply(s));

         */
        /*n4
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Predicate<Integer> primeNum = a -> isPrime(a);
        System.out.println(primeNum.test(n));

         */

        /*n5
        System.out.println(tostring(15));
        System.out.println(isEven(6));

         */

    }

//1
  static String randStr(int n){
        Random rand = new Random();
        String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0 ; i<n;i++){
            int randIndex = rand.nextInt(pool.length());
            stringBuilder.append(pool.charAt(randIndex));
        }
        return stringBuilder.toString();
  }

  //2
  static void inp(String a ){
        if(a.equals("Low Disk Space")){
            System.out.println("Warning");
        }else if (a.equals("Database connected")){
            System.out.println("INFO");

        }else {
            System.out.println("ERROR");
        }
  }

  //3
  static String reverse(String s){
        String fin="";
        for(int i =s.length()-1; i>=0;i--){
            fin+=s.charAt(i);
        }
        return fin;
  }

  //4
  static boolean isPrime(int a){
        int count=0;
        for(int i =  1; i<a+1;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else {
            return false;
        }
  }

  //5
  static String tostring(int a){
        return Integer.toString(a);
  }
  static boolean isEven(int a){
        if(a%2==0){
            return true;
        }else {
            return false;
        }
  }
}

