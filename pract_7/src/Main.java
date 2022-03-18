public class Main {

    public static void main(String[] args) {
        Component me = new Me("uk");
        me.operation();
        ConcreteDecorator newMe = new ConcreteDecorator(me, "поспал");
        newMe.addedBehaviour();
        System.out.println(newMe.getAddedState());
    }
}

class Decorator extends Component{

    public Decorator(String name) {
        super(name);
    }

    @Override
    public void operation() {

    }

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getChild(int i) {
        throw new UnsupportedOperationException();
    }
}

class Me extends Component{

    public Me(String name) {
        super(name);
    }
    public Me() {
        super();
    }

    @Override
    public void operation() {
        System.out.println("кушать");
    }

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getChild(int i) {
        throw new UnsupportedOperationException();
    }
}

class ConcreteDecorator extends Component{

    private final String addedState;
    private final Component name;

    public ConcreteDecorator(Component name, String addedState) {
        this.name = name;
        this.addedState = addedState;
    }

    @Override
    public void operation() {

    }

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getAddedState() {
        return addedState;
    }

    public void addedBehaviour(){
        System.out.println("спать");
    }
}