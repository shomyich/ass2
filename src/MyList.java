import java.util.Collection;

public interface MyList<T> {
    int size();
    boolean contains(Object o);
    boolean add(T item);

    void addAll(Collection<? extends T> collection);

    void add(T item, int index);
    boolean remove(T item);
    T remove(int index);
    void clear();
    T get(int index);
    int indexOf(Object o);
    int lastIndexOf(Object o);
    void sort();
    void reverse();
    void shuffle();
}