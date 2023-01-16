package Chalange;

import java.util.LinkedList;

public interface Iterator {
    void first();           // reset to first Element
    String next();          // get next element
    boolean isDone();       // end of collection check
    String currentItem();   // retrieve current item
}


// We have Arts and Science, constructors will take an array for Arts and a linked list for Science
class ArtsIterator implements Iterator{
    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects[position++];
    }

    @Override
    public boolean isDone() {
        return position >= subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[position];
    }
}

class SienceIterator implements Iterator{
    private LinkedList<String> subjects;
    private int position;

    public SienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        position = 0;
    }



    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects.get(position++);
    }

    @Override
    public boolean isDone() {
        return position >= subjects.size();
    }

    @Override
    public String currentItem() {
        return subjects.get(position);
    }
}