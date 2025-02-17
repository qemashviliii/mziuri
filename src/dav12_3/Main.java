package dav12_3;

import java.lang.String;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        /*n1
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count=0;
        for(int i =0;i<str.length();i++){
            if (str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'||str.charAt(i)=='0'){
                count++;
            }
        }
        System.out.println(count);

         */
        /*n2
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count=0;
        for(int i =0;i<str.length();i++){
            if (str.charAt(i)=='!'||str.charAt(i)=='?'||str.charAt(i)=='.'||str.charAt(i)==';'){
                count++;
            }
        }
        System.out.println(count);

         */
/*n3
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String str1 = "";
    for(int i = str.length()-1;i>=0;i--){
        str1+=str.charAt(i);
    }
    if(str.equals(str1)){
        System.out.println("palindromia");
    }else{
        System.out.println("araa palindromi");
    }

 */
        /*n4
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String str1 = scanner.nextLine();
        if(str.contains(str1)){
            System.out.println("kve strikonia");
        }else{
            System.out.println("ar aris");
        }


         */

    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    int index = str.length()-1;
    if(str.charAt(index)=='a'||str.charAt(index)=='e'||str.charAt(index)=='i'||str.charAt(index)=='o'||str.charAt(index)=='u'){
        System.out.println("mtavrdeba xmovanze");
    }else if((str.charAt(index)>='a'&&str.charAt(index)<='z')||(str.charAt(index)>='A'&&str.charAt(index)<='Z')){
        System.out.println("Mtavrdeba tanxmovanze");
    }else{
        System.out.println("Arc xmovania arc tanxmovani");
    }


/*
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String a = scanner.nextLine();
            char aso = a.charAt(0);
            boolean chasma = false;

            for (int j = 0; j < stringBuilder.length(); j++) {
                if (aso == stringBuilder.charAt(j)) {
                    stringBuilder.insert(j, aso);
                    chasma = true;
                    break;
                }
            }

            if (!chasma) {
                System.out.println("vervipovet es aso");
            }

            System.out.println(stringBuilder);
        }



*/
    }




    }
