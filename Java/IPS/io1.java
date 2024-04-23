import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++) {
            String studentID = scanner.nextLine();
            String name = scanner.nextLine();
            String programme = scanner.nextLine();
            addStudentDetails(studentID, name, programme);
        }
        
    }
    
    public static void addStudentDetails(String studentID, String name, String programme) {
        try {
            FileWriter fw = new FileWriter("Student_Data.txt");
            if(!fw.exists()) {
                fw.createNewFile();
            }
            fw.write(studentID + name + programme);
            fw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void displayStudentDetails() {
        try {
            FileReader fr = new FileReader("Student_Data.txt");
            int i;
            while((i = read()) != -1) {
                System.out.println((char)i);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
