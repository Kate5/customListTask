package test;

import list.ArrayList;
import list.List;

import java.util.Objects;


/**
 * Created by a1 on 10.08.16.
 */
public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 0; i < 100; i++) {
            list.add("test" + i);
        }


    }
}