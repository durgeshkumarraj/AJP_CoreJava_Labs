import java.util.Scanner;

 class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = scanner.next(); // Taking input as a string
            int number = Integer.parseInt(input); // Converting string to integer
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter a valid integer.");
        }

        scanner.close();
    }
}

//output
//        "C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=55485:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\durge\OneDrive\Desktop\LAB1\lab 2\out\production\lab 2" NumberFormatExceptionExample
//        Enter a number: 4
//        Converted Number: 4
