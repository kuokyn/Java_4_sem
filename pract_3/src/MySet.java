import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<String>{

    private final Set<String> set = new HashSet<String>();

    @Override
    synchronized public int size() {
        return set.size();
    }

    @Override
    synchronized public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    synchronized public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    synchronized public Iterator<String> iterator() {
        return set.iterator();
    }

    @Override
    synchronized public Object[] toArray() {
        return set.toArray();
    }

    @Override
    synchronized public <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    synchronized public boolean add(String s) {
        return set.add(s);
    }

    @Override
    synchronized public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    synchronized public boolean containsAll(Collection<?> c) {
        return set.containsAll(c);
    }

    @Override
    synchronized public boolean addAll(Collection<? extends String> c) {
        return set.addAll(c);
    }

    @Override
    synchronized public boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    synchronized public boolean removeAll(Collection<?> c) {
        return set.removeAll(c);
    }

    @Override
    synchronized public void clear() {
        set.clear();
    }
}
