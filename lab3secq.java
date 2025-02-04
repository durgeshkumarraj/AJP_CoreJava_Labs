// Thread to print numbers from 1 to 10
class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Adding delay to better observe thread execution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Thread to print letters from A to J
class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.println("Alphabet: " + c);
            try {
                Thread.sleep(500); // Adding delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 class MultiTaskExample {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        AlphabetThread alphabetThread = new AlphabetThread();

        numberThread.start();
        alphabetThread.start();
    }
}

//output
//"C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=55856:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\durge\OneDrive\Desktop\LAB1\out\production\LAB1 MultiTaskExample
//        Alphabet: A
//        Number: 1
//        Alphabet: B
//        Number: 2
//        Number: 3
//        Alphabet: C
//        Alphabet: D
//        Number: 4
//        Number: 5
//        Alphabet: E
//        Number: 6
//        Alphabet: F
//        Number: 7
//        Alphabet: G
//        Number: 8
//        Alphabet: H
//        Alphabet: I
//        Number: 9
//        Alphabet: J
//        Number: 10

