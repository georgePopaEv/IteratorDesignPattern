package Ecample;

public class NotificationIterator implements Iterator{
    Notification[] notificationList;
    int pos = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        if (pos>= notificationList.length || notificationList[pos] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        Notification notification = notificationList[pos];
        pos +=1;
        return notification;
    }
}
