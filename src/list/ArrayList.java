package list;


/**
 * Created by a1 on 10.08.16.
 */
public class ArrayList<E> implements List<E> {

    private int DEFAULT_SIZE = 10;
    private E[] anArray;
    private E[] newArray;

    private int size = 0;

    public ArrayList() {
        this.anArray = (E[]) new Object[DEFAULT_SIZE];
    }

    @Override
    public void add(E o) {
        if ((this.anArray.length - 1) == size) {
            complexAdd(o);
            System.out.println("COMPLEX length " + this.anArray.length + " SIZE: " + this.size());

        } else {
            simpleAdd(o);
            System.out.println("SIMPLE length " + this.anArray.length + " SIZE: " + this.size());
        }
    }

    private void simpleAdd(E value) {
        this.anArray[size] = value;
        size++;
    }

    private void complexAdd(E value) {
        newArray = (E[]) new Object[this.anArray.length + DEFAULT_SIZE];
        for (int i = 0; i < this.size(); i++) {
            newArray[i] = this.anArray[i];
        }
        this.anArray = newArray;
        this.anArray[size] = value;
        size++;
    }

    @Override
    public E get(int index) {
        if ((this.size) < index) {
            throw new ArrayIndexOutOfBoundsException("Oooops!");
        } else {
            return (E) this.anArray[index];
        }
    }

    @Override
    public void remove(int index) {
        if ((this.anArray.length - 1) < index) {
            throw new ArrayIndexOutOfBoundsException("Ooops!");
        } else {
            Object[] temp = new Object[this.anArray.length];
            int j = 0;
            for (int i = 0; i < this.size; i++) {
                if (i == index) {
                    temp[j] = this.anArray[++i];
                } else {
                    temp[j] = this.anArray[i];
                }
                j++;
            }
            this.anArray = (E[]) temp;
            size--;

        }
    }

    @Override
    public int size() {
        int length = 0;
        for (int i = 0; i < this.anArray.length - 1; i++) {
            if (this.anArray[i] == null) {
                break;
            } else {
                length++;
            }
        }
        return length;
    }
}

