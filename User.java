interface User {
    void update(String message, User sender);

    void sendMessage(String message);

    String getName();
}