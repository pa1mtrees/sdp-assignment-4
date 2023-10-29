class ChatUser implements User {
    private String name;
    private ChatRoom chatRoom;

    public ChatUser(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
        chatRoom.subscribe(this);
    }

    @Override
    public void update(String message, User sender) {
        if (!this.equals(sender)) {
            System.out.println(name + " received message: " + message);
        }
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chatRoom.send(message, this);
    }
}