package dav12_22;
import java.io.*;

class Student implements Serializable{
    String id;
    String name;
    int age;
    Student(String id,String name,int age){
        this.age = age;
        this.name = name;
        this.id = id;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        //1
        Student[] students = data();
        FileOutputStream fileOutputStream = new FileOutputStream("out.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);

        objectOutputStream.close();
        fileOutputStream.close();
        //2
        /*
        FileInputStream fileInputStream = new FileInputStream("out.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student deserialization = (Student) objectInputStream.readObject();
        fileOutputStream.close();
        objectInputStream.close();

         */



    }
    public static Student[] data() {
        return new Student[] {
                new Student("34", "a", 93),
                new Student("456", "b", 1),
                new Student("4", "c", 37),
                new Student("987", "d", 100),
                new Student("412", "e", 45)
        };
    }
}

