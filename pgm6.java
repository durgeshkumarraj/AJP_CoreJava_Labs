import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

 class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }

            System.out.println("Valid age entered.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

//output
//"C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=49703:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\durge\OneDrive\Desktop\LAB1\lab 2\out\production\lab 2" CustomExceptionExample
//        Enter your age: 28
//        Valid age entered