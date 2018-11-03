package javagenerics.services.implementations;

import java.util.ArrayList;
import java.util.Iterator;


public class BagOfItems<T> implements Iterable<T> {

    private ArrayList<T> list = new ArrayList<>();
    private Integer limitElements = 10;

    public void addElement(T t){
        if (list.size() < limitElements){
            list.add(t);
        }else{
            throw new RuntimeException("There isnt space");
        }
    }


    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

}
