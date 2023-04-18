import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private int size;
    private Object[] arr;


    public MyArrayList() {
        arr = new Object[10];
        size = 0;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public void add(T item) {
        int minLength = size + 1;
        if (minLength > arr.length) {
            int newCapacity = arr.length * 2;
            if (newCapacity < minLength) {
                newCapacity = minLength;
            }
            arr = Arrays.copyOf(arr, newCapacity);
        }
        arr[size++] = item;
    }

    @Override
    public void add(T item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        int minLength = size + 1;
        if (minLength > arr.length) {
            int newCapacity = arr.length * 2;
            if (newCapacity < minLength) {
                newCapacity = minLength;
            }
            arr = Arrays.copyOf(arr, newCapacity);
        }
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = item;
        size++;
    }

    @Override
    public boolean remove(T item) {
        for (int i = 0; i < size; i++) {
            if (item.equals(arr[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }


    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        T item = get(index);
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null;
        return item;
    }


    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}