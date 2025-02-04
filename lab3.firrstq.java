// Using Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

// Using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

 class ThreadExample {
    public static void main(String[] args) {
        // Creating thread using Thread class
        MyThread thread1 = new MyThread();
        thread1.setName("Thread-1");

        // Creating thread using Runnable interface
        Thread thread2 = new Thread(new MyRunnable(), "Thread-2");

        // Starting threads
        thread1.start();
        thread2.start();
    }
}
//"C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=55807:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\durge\OneDrive\Desktop\LAB1\out\production\LAB1 ThreadExample
//        Thread-1
//        Thread-1
//        Thread-1
//        Thread-1
//        Thread-1
//        Thread-2
//        Thread-2
//        Thread-2
//        Thread-2
//        Thread-2
