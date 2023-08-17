package Models;

public class StandardSignUp implements SignUpBehaviour {

    @Override
    public Double price(Double cost) {
        return cost;
    }

}
