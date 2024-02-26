import java.util.Scanner;
// ATM project where he can manage his bank account.
public class ATMProject {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("bootcamp")) {
                System.out.println("Hello, Welcome The Patika Bank.");
                do {
                    System.out.println("\n1-Deposit Money\n" + "2-Withdraw Money\n" + "3-Check Balance\n" + "4-Exit");
                    System.out.print("\nPlease select the operation you want to perform: ");
                    select = input.nextInt();
                    // Transactions
                    switch (select) {
                        case 1:
                            System.out.print("Amount of money: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Amount of money : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance : " + balance);
                            break;
                        case 4:
                            System.out.println("See you again.");
                            break;
                        default:
                            System.out.println("Invalid process selection.");
                    }
                } while (select != 4);
                break;
            } else {
                // Incorrect entry
                right--;
                System.out.println("Incorrect username or password. Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your remaining entitlement: " + right);
                }
            }
        }
    }
}

