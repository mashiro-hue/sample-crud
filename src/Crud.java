import java.util.*;

public class Crud {
    ArrayList<Student> students = new ArrayList<>();

    public void insertStudent(String name, int id){
        students.add(new Student(name, id));
    }

    public void updateStudent(String name, int id){
        for(Student student: students){
            if(student.id == id){
                student.name = name;
            }
        }
    }

    public void display(){
        for(Student student: students){
            System.out.println(student.name);
            System.out.println(student.id);
        }
    }

    public void deleteStudent(int id){
        students.removeIf(data -> data.id == id);
    }

}
