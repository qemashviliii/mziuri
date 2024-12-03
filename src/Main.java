import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = "";
        for(int i = str.length();i>=0;i++){
            str1+=i;
        }
        if(str.equals(str1)){
            System.out.println("palindromia");
        }else{
            System.out.println("araa palindromi");
        }
    }
    }
