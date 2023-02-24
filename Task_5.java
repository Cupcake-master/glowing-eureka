public class Task_5 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0, 123);
        try {
            bankAccount.deposit(Integer.parseInt(args[0]));
            bankAccount.withdraw(Integer.parseInt(args[1]));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public static class BankAccount {
        private double balance;
        private int accountNumber;

        public BankAccount(double balance, int accountNumber) {
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) throws Exception {
            if (amount > balance) {
                throw new Exception("Недостаточно средств на счете.");
            }else{
                System.out.println("Транзакцию можно выполнить.");
            }
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }
    }
}
