package Chalange;

import java.util.LinkedList;

interface SubjectInterface {
    public Iterator createIterator();
}

class Arts implements SubjectInterface {
    private String[] subjects;

    public Arts(String[] subjects) {
        this.subjects = subjects;
    }

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}

class Science implements SubjectInterface{
    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<String>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }

    @Override
    public Iterator createIterator() {
        return new SienceIterator(subjects);
    }
}