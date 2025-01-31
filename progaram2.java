 class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            // Attempting to access an index beyond the array size
            System.out.println("Accessing index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }
    }
}
//output

// "C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=55420:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\durge\OneDrive\Desktop\LAB1\lab 2\out\production\lab 2" ArrayIndexOutOfBounds
//         Error: Array index out of bounds.

