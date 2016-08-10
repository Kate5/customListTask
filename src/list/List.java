package list;

/**
 * Created by a1 on 10.08.16.
 */
public interface List<E> {

    public void add(E e);

    public E get(int index);

    public void remove(int index);

    public int size();

}