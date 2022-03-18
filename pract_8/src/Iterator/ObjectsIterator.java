package Iterator;

public class ObjectsIterator implements Iterator{
    private final List<Object> list;
    private int index;

    public ObjectsIterator(List<Object> list) {
        this.index = 0;
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}
