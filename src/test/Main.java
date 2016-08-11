package test;

import list.ArrayList;
import list.List;

import java.util.Objects;


/**
 * Created by a1 on 10.08.16.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();


        for (int i = 0; i < 10; i++) {
            list.add( i);
            System.out.println(i);
        }

//        list.remove(9);
//        list.remove(10);

//        list.add(3232);
//        list.add(2121);
//        list.add(333);

        System.out.println( "sd");
        list.remove( 100 );

    }
}
