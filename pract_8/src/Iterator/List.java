package Iterator;

public interface List<Object> {
    Iterator iterator();
    Object get(int index);
    int size();
    void add(Object obj);
}
