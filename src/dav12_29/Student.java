package dav12_29;

public class Student {
    private String name;
    private String lastName;
    private int score;
    Student(String name, String lastName,int score){
        this.name=name;
        this.lastName=lastName;
        this.score=score;

    }
    int getScore(){
        return  score;
    }

    @Override
    public String toString() {
        return this.name+" "+lastName+" "+score;
    }
}
