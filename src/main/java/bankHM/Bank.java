package bankHM;

public class Bank {

    private User user;

    public void addUser(User user) {
        this.user = user;
    }

    public void debit(double amount) {
        user.setBalance(user.getBalance() - amount);
    }

    public void credit(double amount) {
        user.setBalance(user.getBalance() + amount);
    }

    public double getBalance() {
        return user.getBalance();
    }

}
