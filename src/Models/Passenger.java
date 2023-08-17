package Models;

public abstract class Passenger {
    private String name;
    private Integer number;
    private Double balance;

    SignUpBehaviour signUp;

    public Passenger(String name, Integer number, Double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public boolean updateBalance(Double balance, Double cost) {
        if (balance >= cost) {
            setBalance(balance - cost);
            return true;
        }
        return false;
    }

    public abstract boolean calculate(Double cost);

    @Override
    public String toString() {
        return "Passenger [name=" + name + ", number=" + number + ", balance=" + balance + "]";
    }

}
