import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt"); // File that does not exist
            Scanner fileReader = new Scanner(file); // Attempting to read the file

            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}

//output
//"C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=49727:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\durge\OneDrive\Desktop\LAB1\lab 2\out\production\lab 2" FileNotFoundExceptionExample
//        Error: File not found.