package list;

/**
 * Created by a1 on 10.08.16.
 */
public class LinkedList<E> implements List<E> {

    @Override
    public void add(E e) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return 0;
    }

    private static class Entry<E> {

        E entry;
        Entry<E> next;
        Entry<E> prev;

        public Entry(E entry, Entry<E> next, Entry<E> prev) {
            this.entry = entry;
            this.next = next;
            this.prev = prev;
        }
    }
}
