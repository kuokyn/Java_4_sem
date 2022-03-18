public class FactoryMethod {
    public static void main(String[] args) {
        Transport car = FactoryTransport.create("car");
        Transport train = FactoryTransport.create("train");
        car.go();
        train.go();
    }
}

interface Transport {
    void go();
}

class Car implements Transport {

    @Override
    public void go() {
        System.out.println("поехал");
    }
}

class Train implements Transport {

    @Override
    public void go() {
        System.out.println("тронулся");
    }
}

class FactoryTransport {
    public static Transport create(String type) {
        return switch (type) {
            case "car" -> new Car();
            case "train" -> new Train();
            default -> null;
        };
    }
}
