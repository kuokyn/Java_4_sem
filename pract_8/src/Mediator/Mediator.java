package Mediator;

import javax.print.attribute.standard.Media;

public class Mediator {
    private Button button;
    private HairDryer hairDryer;
    private PowerSupplier powerSupplier;

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public HairDryer getHairDryer() {
        return hairDryer;
    }

    public void setHairDryer(HairDryer hairDryer) {
        this.hairDryer = hairDryer;
    }

    public PowerSupplier getPowerSupplier() {
        return powerSupplier;
    }

    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    public Mediator(Button button, HairDryer hairDryer, PowerSupplier powerSupplier) {
        this.button = button;
        this.hairDryer = hairDryer;
        this.powerSupplier = powerSupplier;
    }

    public Mediator(){}

    public void press() {
        if (powerSupplier.isOn()){
            if (hairDryer.isOn()) {
                hairDryer.turnOff();
            } else {
                hairDryer.turnOn();
            }
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}
