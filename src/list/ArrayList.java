package list;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by a1 on 10.08.16.
 */
public class ArrayList<E> implements List<E> {

    private int DEFAULT_SIZE = 10;
    private Object[] anArray;
    private Object[] newArray;

    private int size = 0;

    public ArrayList() {
        this.anArray = new Object[DEFAULT_SIZE];
    }

    public ArrayList(int capacity) {
        this.anArray = new Object[capacity];
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
        newArray = new Object[this.anArray.length + DEFAULT_SIZE];
        for (int i = 0; i < this.size(); i++) {
            newArray[i] = this.anArray[i];
        }
        this.anArray = newArray;
        this.anArray[size] = value;
        size++;
    }

    @Override
    public E get(int index) {
        if ((this.anArray.length - 1) < index) {
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
            //this.anArray[index] = null;
            int j = 0;
            for (int i = 0; i < this.size; i++) {
                if (i == index) {
                    temp[j] = this.anArray[++i];
                } else {
                    temp[j] = this.anArray[i];
                }
                j++;

                //this.anArray[index] = this.anArray[i + 1];
            }
            this.anArray = temp;
//            this.anArray[] = null;
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

