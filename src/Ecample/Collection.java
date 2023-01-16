package Ecample;

public interface Collection {
    public Iterator createIterator();
}

class NotificationCollection implements Collection {
      static final int MAX_ITEMS = 6;
      int numberOfItems = 0;
      Notification [] notificationList;

    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];

        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    private void addItem(String s) {
        Notification notification = new Notification(s);

        if(numberOfItems >= MAX_ITEMS){
            System.out.println("Full");
        }
        else{
            notificationList[numberOfItems] = notification;
            numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new NotificationIterator(notificationList);
    }
}
