package dav12_11;
import java.util.Scanner;

class saxeli extends Exception {
    public saxeli(String a) {
        super(a);
    }
}

class gvari extends Exception {
    public gvari(String a) {
        super(a);
    }
}

class weli extends Exception {
    public weli(String a) {
        super(a);
    }
}

class tve extends Exception {
    public tve(String a) {
        super(a);
    }
}

class dge extends Exception {
    public dge(String a) {
        super(a);
    }
}

class user extends Exception {
        public user(String a) {
        super(a);
    }
}

class paroli extends Exception {
    public paroli(String a) {
        super(a);
    }
}

class id extends Exception {
    public id(String a) {
        super(a);
    }
}


class Pers {
     String saxeli1;
     String gvari1;
     int weli1;
     int tve1;
     int dge1;
     String user1;
     String paroli1;
     String id1;

    public Pers(String saxeli1, String gvari1, int weli1, int tve1, int dge1,
                String user1, String paroli1, String id1) throws saxeli, gvari, weli,
            tve, dge, user,
            paroli, id {

        setSaxeli1(saxeli1);
        setGvari1(gvari1);
        setWeli1(weli1);
        setTve1(tve1);
        setDge1(dge1);
        setUser1(user1);
        setParoli1(paroli1);
        setId1(id1);
    }

    public void setSaxeli1(String saxeli1) throws saxeli {
        if (saxeli1.length() < 2) {
            throw new saxeli("2 aso minimum");
        }
        this.saxeli1 = saxeli1;
    }

    public void setGvari1(String lastName) throws gvari {
        if (lastName.length() < 3) {
            throw new gvari("3 aso minimum");
        }
        this.gvari1 = gvari1;
    }

    public void setWeli1(int weli1) throws weli {
        int exla = 2024;
        if (weli1 > exla) {
            throw new weli("ar und aghematebodes dghevandel wels");
        }
        this.weli1 = weli1;
    }

    public void setTve1(int tve1) throws tve {
        if (tve1 < 1 || tve1 > 12) {
            throw new tve("tve unda ikos 1 da 12 shoris");
        }
        this.tve1 = tve1;
    }

    public void setDge1(int dge1) throws dge {
        if (dge1 < 1 || dge1 > 31) {
            throw new dge("ricxvi unda ikos 1 da 31 shoris");
        }
        this.dge1 = dge1;
    }

    public void setUser1(String user1) throws user {
        if (user1.length() < 4) {
            throw new user("momxmareblis saxeli unda sheicavdes minimum 4 asos");
        }
        this.user1 = user1;
    }

    public void setParoli1(String paroli1) throws paroli {
        if (paroli1.length() < 8 || paroli1.length() > 15) {
            throw new paroli("paroli unda ikos 8 da 15 simbolos shoris");
        }
        this.paroli1 = paroli1;
    }

    public void setId1(String id1) throws id {
        if (id1.length() != 11) {
            throw new id("unda sheicavdes 11 cifrs ");
        }
        this.id1 = id1;
    }


}

public class Main {
    public static void main(String[] args){
    /*n1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String saxeli = scanner.nextLine();
            String gvari = scanner.nextLine();
            int weli = scanner.nextInt();
            int tve = scanner.nextInt();
            int dge = scanner.nextInt();
            scanner.nextLine();
            String user = scanner.nextLine();
            String paroli = scanner.nextLine();
            String id = scanner.nextLine();
            Pers pers = new Pers(saxeli, gvari, weli, tve, dge, user, paroli, id);

        } catch (Exception e) {
            System.out.println("napovnia shecdoma: " + e.getMessage());
        }

     */
/*1
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {2, 8, 5, 20, 45};
        for(int i = 0; i < arr1.length; i++) {
           try {
                double f = arr1[i] / arr2[i];
                System.out.println(f);
            } catch(ArithmeticException e) {
               System.out.println("0ze gakofa ar sheizleba");
           }


 */

/*n1
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
       try{
            System.out.print("Enter num: ");
            int x = scanner.nextInt();
           if (x < 0 || x >= arr.length) {
               throw new ArrayIndexOutOfBoundsException();
            }
            for(int i=x;i< arr.length;i++){
                sum+=arr[i];
            }
            System.out.println(sum);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Indexi gadacda sazghvrebs");
       }

 */

    }
    }





