import java.io.*;

public class Student implements Serializable{
    String name;
    int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
}
