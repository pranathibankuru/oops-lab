import java.util.Scanner;

class BankAccount {
    String name;
    int AccountNum;
    float currentAmount;

    public BankAccount(String name, int AccountNum, float currentAmount) {
        this.name = name;
        this.AccountNum = AccountNum;
        this.currentAmount = currentAmount;
    }

    public void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to be Deposited: ");
        float deposit = input.nextFloat();
        currentAmount += deposit;
        System.out.print("Existing Balance now is: " + currentAmount);
    }

    public void withdrawal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to be withdrawn: ");
        float withdrawal = input.nextFloat();

        if (currentAmount < withdrawal) {
            System.out.println("Insufficient Funds in account");
        } else {
            currentAmount -= withdrawal;
            System.out.println("Remaining Balance: " + currentAmount);
        }
    }

    public static void main(String[] args) {
        BankAccount BA = new BankAccount("Jahnavi", 758932,(float)150000.5);
BA.withdrawal();
 BankAccount BA1=new BankAccount("Pranthi",892347,(float)250000.8);
BA1.deposit();
       
    }
    
}





       

