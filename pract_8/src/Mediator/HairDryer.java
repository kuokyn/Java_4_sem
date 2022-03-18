package Mediator;

public class HairDryer {

    private final PowerSupplier powerSupplier;
    private boolean isOn = false;
    private Mediator mediator;

    public HairDryer(PowerSupplier powerSupplier, boolean isOn) {
        this.powerSupplier = powerSupplier;
        this.isOn = isOn;
    }

    public PowerSupplier getPowerSupplier() {
        return powerSupplier;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }
}
