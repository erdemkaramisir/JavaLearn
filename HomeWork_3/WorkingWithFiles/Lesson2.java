
// public class Lesson2 {

// import java.io.File;
// import java.io.IOException;

// public class Main {
//     public static void main(String[] args) {

//         createFile();
//         getFileInfo();
//     }

//     public static void createFile() {

//         File file = new File("C:\\1\\files\\students.html");

//         try {
//             if (file.createNewFile()) {
//                 System.out.println(" Dosya Oluşturuldu ");
//             } else {
//                 System.out.println(" Dosya zaten mevcut ");
//             }

//         } catch (IOException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }

//     }

//     public static void getFileInfo() {
//         File file = new File("c:\\1\\files\\students.html");
//         if (file.exists()) {
//             System.out.println(" Dosya adı  " + file.getName());
//             System.out.println(" Dosya yolu  :" + file.getAbsolutePath());
//             System.out.println(" Dosya yazılabilir mi :" + file.canWrite());
//             System.out.println(" Dosya okunabilir  mi :" + file.canRead());
//             System.out.println(" Dosya boyutu ne kadar :" + file.length());
//         }
//     }

// }
// }
