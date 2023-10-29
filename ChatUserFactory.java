class ChatUserFactory implements UserFactory {
    @Override
    public User createUser(String name, ChatRoom chatRoom) {
        return new ChatUser(name, chatRoom);
    }
}