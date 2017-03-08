package list;

/**
 * Created by a1 on 10.08.16.
 */
public class LinkedList<E> implements List<E> {

    public LinkedList() {
    }

    private int size = 0;

    @Override
    public void add(E e) {
        if (size==0) {
            Entry<E> entry = new Entry<E>(e, null, null);
        } else {
        }
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
