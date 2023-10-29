class ChatApplicationFactory {
    public ChatRoomFactory createPublicChatRoom() {
        return new PublicChatRoomFactory();
    }

    public UserFactory createChatUser() {
        return new ChatUserFactory();
    }
}
