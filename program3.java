 class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null; // Assigning null to a string
            System.out.println("String length: " + str.length());

        } catch (NullPointerException e) {
            System.out.println("Error: Null Pointer Exception occurred.");
        }
    }
}
//output
//        "C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=55445:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\durge\OneDrive\Desktop\LAB1\lab 2\out\production\lab 2" NullPointerExceptionExample
//        Error: Null Pointer Exception occurred.
