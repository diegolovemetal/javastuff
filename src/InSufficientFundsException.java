import java.io.*;
public class InSufficientFundsException extends Exception {
    private double amount;

    public  InSufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
// 文件：InsufficientFundsException.java
//import java.io.*;
//
//public class InSufficientFundsException extends Exception {
//    private double amount;
//
//    public InSufficientFundsException(double amount) {
//        this.amount = amount;
//    }
//
//    public double getAmount() {
//        return amount;
//    }
//}

