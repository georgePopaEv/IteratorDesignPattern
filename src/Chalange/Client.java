package Chalange;

public class Client {

    public static void Print(Iterator iterator){
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        System.out.println("*** Iterator Pattern Demo ***\n");
        SubjectInterface Sc_subject = new Science();
        SubjectInterface Ar_subject = new Arts();

        Iterator sc_iterator = Sc_subject.createIterator();
        Iterator Ar_iterator = Ar_subject.createIterator();

        System.out.println("\nScience subjects :");
        Print(sc_iterator);

        System.out.println("\nArts subjects :");
        Print(Ar_iterator);


    }
}
