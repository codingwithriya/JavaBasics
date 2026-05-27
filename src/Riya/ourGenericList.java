package Riya;

import java.util.Iterator;

public class ourGenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public ourGenericList(){
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item){
        items[size++]= item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }
    public class OurGenericListIterator implements Iterator<T>{
        private ourGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(ourGenericList<T> list){
            this.list=list;

        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
