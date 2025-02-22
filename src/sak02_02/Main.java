package sak02_02;
import java.beans.ConstructorProperties;
import java.lang.reflect.Constructor;
import java.util.*;

public class Main {
    /* 1
    public static void sort(ArrayList<Student> s) {
        int n = s.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (s.get(j).compareTo(s.get(j+1)) > 0) {
                    Student temp = s.get(j);
                    s.set(j,s.get(j+1));
                    s.set(j+1,temp);
                }
            }
        }
    }

     */
    public static void main(String[] args) {

/*1
ArrayList<Student> s = new ArrayList<>();
s.add(new Student("a",4));
        s.add(new Student("b",15));
        s.add(new Student("c",9));
     sort(s);
     for (Student a : s ){
         System.out.println(a);
     }

 */

/*n2
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("a",4));
        s.add(new Student("b",15));
        s.add(new Student("c",9));
        s.sort(new NameComparator());
        for(Student a: s){
            System.out.println(a);
        }


 */
        /*n3
        ArrayList<Book> b = new ArrayList<>();
        b.add(new Book("asdba","ase",7));
        b.add(new Book("asdm","qqq",15));
        b.add(new Book("wes","sdm",3));
        b.sort(new NameComparator());
        for ( Book x: b){
            System.out.println(x);
        }
        System.out.println("\n");
        b.sort(new AgeComparator());
        for ( Book x: b){
            System.out.println(x);
        }

         */
    }
}
//1
/*
class Student implements Comparable<Student>{
String name;
int age;
Student(String name,int age){
    this.name=name;
    this.age=age;
}
    @Override
    public int compareTo(Student s){
    return Integer.compare(this.age,s.age);
    }
    @Override
    public String toString(){
        return new StringJoiner(", ", Student.class.getSimpleName() +
                "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }
}

 */
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age    ;
    }
    @Override
    public String toString(){
        return new StringJoiner(", ", Student.class.getSimpleName() +
                "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }
}
/*n2
class NameComparator implements  Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getAge(), s1.getAge());
    }
}

 */

class Book{
    String title;
    String author;
    int price;
    Book(String title, String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    String getTitle(){
        return title;
    }
    int getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return new StringJoiner(", ", Student.class.getSimpleName() +
                "[", "]")
                .add("title='" + title + "'")
                .add("author=" + author+"'")
                .add("price=" + price)
                .toString();
    }
}
class NameComparator implements  Comparator<Book>{
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
class AgeComparator implements  Comparator<Book>{
    @Override
    public int compare(Book b1, Book b2) {
        return Integer.compare(b1.getPrice(), b2.getPrice());
    }
}


