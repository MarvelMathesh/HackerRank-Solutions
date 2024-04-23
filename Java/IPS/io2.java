import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(system.out);
        for(int i = 0; i < 3; i++) {
            String id = scanner.nextLine();
            String name = scanner.nextLine();
            String branch = scanner.nextLine();
            writeFile(id, name, branch);
        }
        readFile();
   }
   public static void writeFile(int id, String name, String branch) {
       try {
           FileWriter fw = new FileWriter("test.txt");
           if (!fw.exists()) {
               file.createNewFile();
           }
           fw.write(id + name + branch);
           fw.close();
        } catch (IOException e) {
            e.printStackTrace();
       }
   }
   public static void readFile() {
       try {
           FileReader fr = new FileReader("test.txt") 
               int i;
               while((i = fr.read()) != -1) {
                   System.out.println((char)i);
               }
               fr.close();
           } catch(IOException e) {
               e.printStackTrace();
           }
       }
   }
}