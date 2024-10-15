import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Crud{
    ArrayList<Student> students = new ArrayList<>();
    private String filename = "data.txt";

    public Crud() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            students = (ArrayList<Student>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertStudent(String name, int id){
        students.add(new Student(name, id));
        saveData();
    }

    public void updateStudent(String name, int id){
        students.forEach(data -> {
            if(data.id == id) {
                data.name = name;
                saveData();
                return;
            }

        });
    }

    public void display(){
        if(students.isEmpty()) {
            System.out.println("Empty!");
        }
        students.forEach(data -> {
            System.out.println("Name: " + data.name);
            System.out.println("ID: " + data.id);
        });
    }

    public void deleteStudent(int id){
        boolean removed = students.removeIf(data -> data.id == id);
        if(removed) {
            saveData();
            System.out.println("Student with id " + id + "has been deleted!");
        }else {
            System.out.println("Delete Unsuccessful!");
        }
    }

    private void saveData() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(students);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
