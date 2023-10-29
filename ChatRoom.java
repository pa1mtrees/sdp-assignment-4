interface ChatRoom {
    void subscribe(User observer);

    void unsubscribe(User observer);

    void send(String message, User sender);
}
