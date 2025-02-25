package dav02_26;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        /*n1
        List<Worker> workers = List.of(new Worker("a", "ee", 600),
                new Worker("b", "eax", 150),
                new Worker("c", "asdl", 1100),
                new Worker("d", "askx", 100),
                new Worker("e", "eq", 400),
                new Worker("f", "1amls", 750),
                new Worker("g", "fqwf", 300));

        List<String> topWorkers = workers.stream()
                .filter(worker -> worker.getSalary() > 500)
                .sorted((w1, w2) -> Double.compare(w2.getSalary(), w1.getSalary()))
                .map(Worker::getName)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(topWorkers);
        */


        /*n2
  List<Integer> nums = List.of(1,5,14,13,18,4,8);
  Integer max = nums.stream()
          .filter(n -> n%2==0 )
          .map(n -> n*3)
          .skip(2)
          .reduce(Integer::max)
          .orElse(Integer.MIN_VALUE);

        System.out.println(max);
*/
/*
        List<Product>products = List.of(new Product("Cheese",5),
                new Product("Bread",3),
                new Product("Pork",21),
                new Product("Beef",35)

        );
        int sum = products.stream()
                .filter(product -> product.getPrice() >  20)
                .map(Product::getPrice)
                .reduce(0,Integer::sum);

        System.out.println(sum);

 */
        List<Student> stu= List.of(new Student("a",100),
                new Student  ("b",100),
                new Student("c",50),
                new Student("d",30),
                new Student("e",80)

        );
  stu.stream()
                .filter(student -> student.getGrade() > 70)
                .collect(Collectors.toMap(i -> i.name,i->i.grade));
  stu.stream()
                .sorted(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return Integer.compare(o1.getGrade(),o2.getGrade());
                    }
                })
                .forEach(System.out::println);



    }






}

 class Worker{
 public String name;
 public String department;
 public int salary;

     public Worker(String name, String department, int salary) {
         this.name = name;
         this.department = department;
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public String getDepartment() {
         return department;
     }

     public int getSalary() {
         return salary;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setDepartment(String deprtament) {
         this.department = department;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }
 }
 class Product{
    public String name;
    public int price;

     public Product(String name, int price) {
         this.name = name;
         this.price = price;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }
 }

 class Student{
    public String name;
    public int grade;

     public Student(String name, int grade) {
         this.name = name;
         this.grade = grade;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getGrade() {
         return grade;
     }

     public void setGrade(int grade) {
         this.grade = grade;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", grade=" + grade +
                 '}';
     }
 }