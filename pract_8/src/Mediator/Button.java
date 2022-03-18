package Mediator;

public class Button {
    private HairDryer hairDryer;
    private Mediator mediator;

    public Button(HairDryer hairDryer) {
        this.hairDryer = hairDryer;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }

    public HairDryer getHairDryer() {
        return hairDryer;
    }

    public void setHairDryer(HairDryer hairDryer) {
        this.hairDryer = hairDryer;
    }
}
