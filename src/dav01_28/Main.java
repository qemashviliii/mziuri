package dav01_28;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
        ArrayList<Basketball> baller = new ArrayList<Basketball>();
        baller.add(new Basketball("a", "b", 3, 4, 9, 10));
        baller.add(new Basketball("c", "d", 12, 7, 11, 1));
        baller.add(new Basketball("e", "f", 6, 4, 3, 4));
        Basketball a = null;
        for (int i = 0; i < baller.size() - 1; i++) {
            if (baller.get(i).countRating() > baller.get(i + 1).countRating()) {
                a = baller.get(i + 1);
                baller.set(i + 1,baller.get(i));
                baller.set(i,a);
            }
        }
        for (int i = 0; i < baller.size(); i++) {
            System.out.println(baller.get(i).toString());
        }
        System.out.println("\n");
        for (int i = baller.size()-1; i >= 0; i--) {
            System.out.println(baller.get(i).toString());
        }

     */

        /*n2
ArrayList<Student> students = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(5);
        a.add(4);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(2);
        b.add(4);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(7);
        c.add(7);
        c.add(10);
        ArrayList<Integer> d = new ArrayList<>();
        d.add(6);
        d.add(8);
        d.add(8);

        students.add(new Student("asdas", "eqwrf","13/01/2001" , a));
        students.add(new Student("qweqew", "hete","27/08/2002", b));
        students.add(new Student("aeqeb", "jegfdg","19/03/2000" , c));
        students.add(new Student("asdas", "djdf", "26/06/2002", d));
        // 1)
        for (Student student : students) {
            System.out.println(student);
        }
        //3)
        Student stu = null;
        for (int i = 0; i < students.size(); i++) {
            for(int j = 0 ;j<students.size();j++){
            if (students.get(i).score() > students.get(j).score()) {
                stu = students.get(j);
                students.set(j, students.get(i));
                students.set(i, stu);
            }
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }



         */
  ArrayList<Car> cars = new ArrayList<>();
  cars.add(new Car("asd","asd",2001,85,new Engine("asd",4,5.0)));
        cars.add(new Car("afasfa","qwegq",2022,120,new Engine("asemqw",7,10.0)));
        cars.add(new Car("gqwf","aywysd",2017,100,new Engine("ewmqmeqw",4,8.0)));
        for (Car car : cars){
            System.out.println(car);
        }
        Car a = null;
        for (int i = 0; i < cars.size(); i++) {
            for(int j = 0 ;j<cars.size();j++){
                if (cars.get(i).getRelease() > cars  .get(j).getRelease()) {
                    a = cars.get(j);
                    cars.set(j, cars.get(i));
                    cars.set(i, a);
                }
            }
        }

        System.out.println("\n");
        for (Car car : cars){
            System.out.println(car);
        }


        for (int i = 0; i < cars.size(); i++) {
            for(int j = 0 ;j<cars.size();j++){
                if (cars.get(i).getMileAge() > cars  .get(j).getMileAge()) {
                    a = cars.get(j);
                    cars.set(j, cars.get(i));
                    cars.set(i, a);
                }
            }
        }
        System.out.println("\n");
        for (Car car : cars){
            System.out.println(car);
        }


        for (int i = 0; i < cars.size(); i++) {
            for(int j = 0 ;j<cars.size();j++){
                if (cars.get(i).getEngine().getVolume() > cars  .get(j).getEngine().getVolume()) {
                    a = cars.get(j);
                    cars.set(j, cars.get(i));
                    cars.set(i, a);
                }
            }
        }
        System.out.println("\n");
        for (Car car : cars){
            System.out.println(car);
        }
    }

}