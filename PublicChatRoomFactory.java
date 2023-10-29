public class PublicChatRoomFactory implements ChatRoomFactory {
    @Override
    public ChatRoom createChatRoom() {
        return new PublicChatRoom();
    }
}
