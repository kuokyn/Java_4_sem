public class AbstractFactory {
    public static void main(String[] args) {
        CarFactory freightFactory = new AbstractCarFactory().createCarFactory("freight");
        CarFactory passengerFactory = new AbstractCarFactory().createCarFactory("passenger");
        FreightCar kamaz = freightFactory.createFreightCar("kamaz");
        FreightCar ural = freightFactory.createFreightCar("ural");
        PassengerCar toyota = passengerFactory.createPassengerCar("toyota");
        PassengerCar kia = passengerFactory.createPassengerCar("kia");

        kamaz.getFreight();
        ural.getFreight();
        toyota.getPassenger();
        kia.getPassenger();
    }
}

interface FreightCar {
    void getFreight();
}

class Kamaz implements FreightCar {

    @Override
    public void getFreight() {
        System.out.println("got freight");
    }
}

class Ural implements FreightCar {

    @Override
    public void getFreight() {
        System.out.println("got freight");
    }
}

class FactoryFreightCar implements CarFactory{
    public FreightCar createFreightCar(String type) {
        return switch (type) {
            case "kamaz" -> new Kamaz();
            case "ural" -> new Ural();
            default -> null;
        };
    }

    @Override
    public PassengerCar createPassengerCar(String type) {
        return null;
    }
}

interface PassengerCar {
    void getPassenger();
}

class Kia implements PassengerCar {

    @Override
    public void getPassenger() {
        System.out.println("got passenger");
    }
}

class Toyota implements PassengerCar {

    @Override
    public void getPassenger() {
        System.out.println("got passenger");
    }
}

class FactoryPassengerCar implements CarFactory{

    @Override
    public FreightCar createFreightCar(String type) {
        return null;
    }

    public PassengerCar createPassengerCar(String type) {
        return switch (type) {
            case "kia" -> new Kia();
            case "toyota" -> new Toyota();
            default -> null;
        };
    }
}

interface CarFactory {
    FreightCar createFreightCar(String type);
    PassengerCar createPassengerCar(String type);
}

class AbstractCarFactory {
    CarFactory createCarFactory(String typeOfFactory) {
        return switch (typeOfFactory) {
            case "freight" -> new FactoryFreightCar();
            case "passenger" -> new FactoryPassengerCar();
            default -> null;
        };
    }
}
