import java.util.Scanner;

class InnerBankManagement {
    private String accountName;
    private double balance ;

    public InnerBankManagement(String accountName) {
        this.accountName = accountName;
        this.balance = 0.0;
    }

    public void deposite(double amount){
        if (amount > 0){
            balance = balance + amount;
            System.out.println("Successfully Deposite :" + amount);
        }
        else{
            System.out.println("Please enter the amount greater than 0");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Debited succesfully : " + amount);
        }
        else{
            System.out.println("Low balance");
        }
    }

    public double CheckBalance(){
        return balance;
    }
    
    
}

public class BankManagement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Bank portal");
        System.out.println("Enter account name");
        String accountName1 = scan.nextLine();

        InnerBankManagement bank = new InnerBankManagement(accountName1);

        int option;
        do { 
            System.out.println("\n1. Deposite");
            System.out.println("2. withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            option = scan.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Enter a amount to Deposite");
                    double depositAmount = scan.nextInt();
                    bank.deposite(depositAmount);
                    break;
                
                case 2:
                    System.out.println("Enter a amount to withdraw");
                    double withdrawAmount = scan.nextInt();
                    bank.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current balance is :" + bank.CheckBalance());
                    break;

                case 4:
                    System.out.println("Exiting");
                    break;
            }

        } while (option != 4);
    }
}
