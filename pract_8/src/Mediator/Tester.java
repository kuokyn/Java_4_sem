package Mediator;

public class Tester {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        PowerSupplier powerSupplier = new PowerSupplier();
        mediator.setPowerSupplier(powerSupplier);
        HairDryer hairDryer = new HairDryer(powerSupplier, false);
        mediator.setHairDryer(hairDryer);
        hairDryer.setMediator(mediator);
        Button button = new Button(hairDryer);
        mediator.setButton(button);
        isOn(hairDryer);
        mediator.start(); // включаем электричество
        isOn(hairDryer);  // фен пока не работает
        mediator.press(); // включаем фен
        isOn(hairDryer);  // фен работает
        mediator.press(); // выключаем фен
        isOn(hairDryer);  // фен не работает
        mediator.press(); // включаем фен
        mediator.stop();  // выключаем электричество
        isOn(hairDryer);  // фен без электричества работать не будет
        mediator.press(); // даже если нажать на кнопку фена
        isOn(hairDryer);  // при отключенном электричестве, он не включится
    }

    public static void isOn (HairDryer hairDryer){
        if (hairDryer.isOn())
            System.out.println("hair dryer is on");
        else
            System.out.println("hair dryer is turned off");
    }
}
