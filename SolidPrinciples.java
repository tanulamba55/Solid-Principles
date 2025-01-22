import java.util.Scanner;

interface Payment {
    void pay();
}

class WalletPayment implements Payment {
    private String phoneNumber;

    public WalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void pay() {
        System.out.println("Payment made using Wallet linked to phone number: " + phoneNumber);
    }
}

class UPIPayment implements Payment {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay() {
        System.out.println("Payment made using UPI ID: " + upiId);
    }
}

class CardPayment implements Payment {
    private String cardNumber;
    private String expiry;
    private String cvv;

    public CardPayment(String cardNumber, String expiry, String cvv) {
        this.cardNumber = cardNumber;
        this.expiry = expiry;
        this.cvv = cvv;
    }

    public void pay() {
        System.out.println("Payment made using Card ending with: " + cardNumber.substring(cardNumber.length() - 4));
    }
}

class PaymentProcessor {
    public void processPayment(Payment payment) {
        payment.pay();
    }
}

public class SolidPrinciples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to pay: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

       
        System.out.println("Choose payment provider:");
        System.out.println("a. Paytm");
        System.out.println("b. Amazon Pay");
        System.out.println("c. PhonePe");
        String provider = scanner.nextLine();

        System.out.println("Selected Provider: " + provider);

        System.out.println("Choose payment method:");
        System.out.println("a. Wallet");
        System.out.println("b. UPI");
        System.out.println("c. Credit Card");
        System.out.println("d. Debit Card");
        String method = scanner.nextLine();

        Payment payment = null;

        switch (method.toLowerCase()) {
            case "a":
                System.out.print("Enter phone number: ");
                String phoneNumber = scanner.nextLine();
                payment = new WalletPayment(phoneNumber);
                break;

            case "b": 
                System.out.print("Enter UPI ID: ");
                String upiId = scanner.nextLine();
                payment = new UPIPayment(upiId);
                break;

            case "c": // Credit Card
            case "d": // Debit Card
                System.out.print("Enter Card Number: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Enter Expiry Date (MM/YY): ");
                String expiry = scanner.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = scanner.nextLine();
                payment = new CardPayment(cardNumber, expiry, cvv);
                break;

            default:
                System.out.println("Invalid payment method selected.");
                System.exit(0);
        }

        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(payment);

        System.out.println("Payment of Rs. " + amount + " is successful!");

        scanner.close();
    }
}
