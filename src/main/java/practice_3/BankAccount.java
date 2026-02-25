package practice_3;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Error");
        }
    }

    public void withdraw(int amount) {
        if(amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Error");
        }
    }
    public void printBalance() {
        System.out.println(getBalance());
    }
}
