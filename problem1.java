class Bank {
    private double amount;


    public Bank(double amount) {
        this.amount = amount;
    }


    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }


    public void deposit(double depositAmount) {
        amount += depositAmount;
    }


    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        Bank myAccount = new Bank(10000);
        myAccount.withdraw(3000); // Withdraw 3000
        myAccount.deposit(5000); // Deposit 5000
        myAccount.displayBalance(); // Display total balance
    }
}

//output
//"C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=64189:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\durge\OneDrive\Desktop\LAB1\out\production\LAB1 Bank
//        Withdrawal successful
//        Total balance: 12000.0
//
//        Process finished with exit code 0