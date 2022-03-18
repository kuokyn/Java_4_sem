package Iterator;

public class ObjectsList implements List<Object>{

    private final Object[] list;
    private int index;
    private int size;

    public ObjectsList() {
        this.index = 0;
        this.size = 0;
        this.list = new Object[100];
    }

    @Override
    public Iterator iterator() {
        return new ObjectsIterator(this);
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(Object obj) {
        list[index++] = obj;
        size++;
    }
}
