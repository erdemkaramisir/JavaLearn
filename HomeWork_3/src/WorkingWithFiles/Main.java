package WorkingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {

        File file = new File("C:\\1\\files\\students.html");

        try {
            if (file.createNewFile()) {
                System.out.println(" Dosya Oluşturuldu ");
            } else {
                System.out.println(" Dosya zaten mevcut ");
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void getFileInfo() {
        File file = new File("c:\\1\\files\\students.html");
        if (file.exists()) {
            System.out.println(" Dosya adı  " + file.getName());
            System.out.println(" Dosya yolu  :" + file.getAbsolutePath());
            System.out.println(" Dosya yazılabilir mi :" + file.canWrite());
            System.out.println(" Dosya okunabilir  mi :" + file.canRead());
            System.out.println(" Dosya boyutu ne kadar :" + file.length());
        }
    }

    public static void readFile() {
        File file = new File("c:\\1\\files\\students.txt");
        
        try (Scanner reader = new Scanner(file)) {
           
            while( reader.hasNextLine()) {
                String line=reader.nextLine();
                System.out.println(line);
           }
           reader.close();

        } catch (FileNotFoundException e) {
           
            e.printStackTrace();
        
        }
    }
   
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\1\\files\\students.txt",true));
            writer.newLine();
            writer.write(" Erdem");
            System.out.println(" Dosyaya yazıldı ");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}