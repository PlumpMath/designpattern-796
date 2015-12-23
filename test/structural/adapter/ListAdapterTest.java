package structural.adapter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Michael Wong on 2015/12/23.
 */
public class ListAdapterTest {

    @Test
    public void testNextElement() throws Exception {
        int size = 10;
        int maxBound = 100;
        int minBound = 0;
        Random random = new Random();
        List<Integer> list = new ArrayList<>(size);
        for(int i = 0; i < size; i++) {
            list.add(random.nextInt(maxBound) % (maxBound - minBound + 1) + minBound);
        }
        Enumeration<Integer> enumeration = new ListAdapter<Integer>(list);
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}