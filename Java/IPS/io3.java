import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.out);
        for(int i = 0; i < 3; i++) {
            String ISBN = scanner.nextLine();
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            addBookDetails(ISBN, title, author);
        }
        displayBookDetails();
    }
    public static void addBookDetails(String ISBN, String title, String author) {
        try {
            FileWriter fw = new FileWriter("Books_Data.txt");
            if(!fw.exists()) {
                fw.createNewFile();
            }
            fw.write(ISBN + "\n");
            fw.write(title + "\n");
            fw.write(author + "\n");
            fw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static void displayBookDetails() {
        try {
            FileReader fr = new FileReader("Books_Data.txt");
            int i;
            while((i = fr.read()) != -1) {
                System.out.println((char) i)
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}