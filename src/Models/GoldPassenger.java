package Models;

public class GoldPassenger extends Passenger {

    public GoldPassenger(String name, Integer number, Double balance) {
        super(name, number, balance);
        signUp = new GoldSignUp();
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean calculate(Double cost) {
        signUp.price(cost);
        return updateBalance(getBalance(), cost);
    }

}
