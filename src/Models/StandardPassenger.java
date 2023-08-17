package Models;

public class StandardPassenger extends Passenger {

    public StandardPassenger(String name, Integer number, Double balance) {
        super(name, number, balance);
        signUp = new StandardSignUp();
    }

    @Override
    public boolean calculate(Double cost) {

        signUp.price(cost);
        return updateBalance(getBalance(), cost);

    }

}
