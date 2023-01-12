
//Q6.Write a java program to create a Test.txt" file and write your Roll,
//Name into the file. Again display the information from that file.

import java.io.FileWriter;   // Import the FileWriter class
 import java.io.IOException;


 
 public class Q6 {
 
    public static void main(String[] args){ try {
         FileWriter WriteFile= new FileWriter("Test.txt");
         WriteFile.write("Name:Ashikur Rahman"+" " );
         WriteFile.write("R0ll:200607");
         WriteFile.close();
                System.out.println("Successfully wrote to the file.");
                System.out.println();
              }
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();

            }
    }
 }


// import java.io.FileWriter;   // Import the FileWriter class
// import java.io.IOException;  // Import the IOException class to handle errors

// public class Q6 {
//   public static void main(String[] args) {
//     try {
//       FileWriter myWriter = new FileWriter("filename.txt");
//       myWriter.write("Name:Md.Ashikur Rahman");
//       System.out.println();
//       myWriter.write("Roll: 200607");
//       myWriter.close();
//       System.out.println("Successfully wrote to the file.");
//     }
//      catch (IOException e) {
//       System.out.println("An error occurred.");
//       e.printStackTrace();
//     }

//   }
// }