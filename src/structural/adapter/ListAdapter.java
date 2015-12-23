package structural.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Michael Wong on 2015/12/23.
 */
public class ListAdapter<E> implements Enumeration<E> {

    private List<E> list;

    private Iterator<E> iterator;

    public ListAdapter(List<E> list) {
        this.list = list;
        this.iterator = list.iterator();
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public E nextElement() {
        return iterator.next();
    }
}
