package HomeWork.Lesson_5;

import java.util.*;

// My methods without "@Override"
public class MyArrayList<T> implements List<T> {
    private Object[] list;
    private int size;

    public MyArrayList() {
        this.list = new Object[10];
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("Cannot construct MyArrayList with negativ capacity");
        this.list = new Object[capacity];
    }

    public boolean add(T value) {
        ensureCapacity(size + 1);
        this.list[size] = value;
        size++;
        return true;
    }

    public void add(int index, T value) {
        ensureCapacity(size + 1);
        Object[] tempList = new Object[list.length];

        for (int x = 0; x < index; x++) {
            tempList[x] = list[x];
        }

        tempList[index] = value;
        for (int x = index + 1; x < size + 1; x++) {
            tempList[x] = list[x];
        }

        list = tempList;
        size++;
    }

    public void ensureCapacity(int capacity) {
        if (capacity > list.length) {
            Object[] tempList = new Object[list.length * 2];
            for (int x = 0; x < list.length; x++) {
                tempList[x] = list[x];
            }
            list = tempList;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    public boolean contains(Object value) {
        for (Object val : list)
            if (val != null && value.hashCode() == val.hashCode())
                if (value.equals(val))
                    return true;
        return false;
    }

    public T get(int index) {
        return (T) list[index];
    }

    public T remove(int index) {
        T result = (T) list[index];
        Object[] tempList = new Object[list.length];

        for (int x = 0; x < list.length; x++) {
            if (x > index) {
                tempList[x - 1] = list[x];
            } else {
                tempList[x] = list[x];
            }
        }
        list = tempList;
        size--;
        return result;
    }

    public void clear() {
        for (int x = 0; x < list.length; x++)
            list[x] = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public T set(int index, T element) {
        Object result = list[index];
        list[index] = element;
        return (T) result;
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
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}