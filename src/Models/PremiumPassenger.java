package Models;

public class PremiumPassenger extends Passenger {

    public PremiumPassenger(String name, Integer number, Double balance) {
        super(name, number, balance);
        signUp = new PremiumSignUp();
    }

    @Override
    public boolean calculate(Double cost) {
        signUp.price(cost);
        return updateBalance(getBalance(), cost);
    }

}
