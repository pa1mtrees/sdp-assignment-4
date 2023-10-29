import java.util.ArrayList;
import java.util.List;

class PublicChatRoom implements ChatRoom {
    private List<User> observers = new ArrayList<>();

    @Override
    public void subscribe(User observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(User observer) {
        observers.remove(observer);
    }

    @Override
    public void send(String message, User sender) {
        System.out.println("Public Chat Room: '" + message + "'");
        notify(message, sender);
    }

    private void notify(String message, User sender) {
        for (User observer : observers) {
            observer.update(message, sender);
        }
    }
}