interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }
}

class PayPal implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
}

class BankTransfer implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer: $" + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentMethod[] methods = {
            new CreditCard(),
            new PayPal(),
            new BankTransfer()
        };

        for (PaymentMethod m : methods) {
            m.processPayment(100.0);
        }
    }
}
