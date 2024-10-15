import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Crud crud = new Crud();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Choose an Option:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Student");
            System.out.println("3. Update Student Data");
            System.out.println("4. Delete Student Data");
            System.out.println("5. Exit");
            int option = sc.nextInt();
            sc.nextLine();

            switch(option){
                case 1:
                    System.out.println("Name: ");
                    String name = sc.nextLine();

                    System.out.println("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    crud.insertStudent(name, id);
                    break;
                case 2:
                    crud.display();
                    break;
                case 3:
                    System.out.println("Id to update:");
                    int idUpdate = sc.nextInt();
                    sc.nextLine();

                    System.out.println("New name:");
                    String newName = sc.nextLine();

                    crud.updateStudent(newName, idUpdate);
                    break;
                case 4:
                    System.out.println("Enter id to delete:");
                    int idDelete = sc.nextInt();

                    crud.deleteStudent(idDelete);
                    break;
                case 5:
                    sc.close();
                    System.out.println("Exit");
                    return;
            }
        }
    }
}
