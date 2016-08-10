package list;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by a1 on 10.08.16.
 */
public class ArrayList implements List {

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
    public void add(Object o) {
        if ((this.anArray.length - 1) == size) {
            //System.out.println("ERROR!");
            complexAdd(o);
            System.out.println("COMPLEX length " + this.anArray.length + " SIZE: " + this.size());

        } else {
            simpleAdd(o);
            System.out.println("SIMPLE length " + this.anArray.length + " SIZE: " + this.size());
        }
    }

    private void simpleAdd(Object value) {
        this.anArray[size] = value;
        size++;
    }

    private void complexAdd(Object value) {
        newArray = new Object[this.anArray.length + DEFAULT_SIZE];
        for (int i = 0; i < this.size(); i++) {
            newArray[i] = this.anArray[i];
        }
        this.anArray = newArray;
        this.anArray[size] = value;
        size++;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

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

