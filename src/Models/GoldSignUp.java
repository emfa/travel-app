package Models;

public class GoldSignUp implements SignUpBehaviour {

    @Override
    public Double price(Double cost) {
        return cost * 0.9;
    }

}
