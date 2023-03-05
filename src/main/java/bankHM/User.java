package bankHM;

import java.util.UUID;

public class User {

    public final UUID accountNumber;
    public double balance;
    public String name;
    public String lastName;
    public char gender;


    public User(UUID accountNumber, double balance, String name, String lastName, char gender) {
        this.accountNumber = UUID.randomUUID();
        this.balance = balance;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}

