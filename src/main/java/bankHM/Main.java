package bankHM;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        User user1 = new User(UUID.randomUUID(), 56, "John", "Smith", 'M');
        bank.addUser(user1);


        bank.credit(300);
        System.out.println(bank.getBalance());
        bank.debit(500);
        System.out.println(bank.getBalance());


    }
}
