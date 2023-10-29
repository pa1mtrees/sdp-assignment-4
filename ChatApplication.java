import java.util.Scanner;

public class ChatApplication {
    public static void main(String[] args) {
        ChatApplicationFactory chatAppFactory = new ChatApplicationFactory();

        // Create chat room and users using the Factory pattern
        ChatRoom publicChatRoom = chatAppFactory.createPublicChatRoom().createChatRoom();
        User user1 = chatAppFactory.createChatUser().createUser("Alice", publicChatRoom);
        User user2 = chatAppFactory.createChatUser().createUser("Bob", publicChatRoom);

        // Get user input for messages
        Scanner scanner = new Scanner(System.in);
        System.out.print(user1.getName() + ", enter your message: ");
        String message1 = scanner.nextLine();
        user1.sendMessage(message1);

        System.out.print(user2.getName() + ", enter your message: ");
        String message2 = scanner.nextLine();
        user2.sendMessage(message2);
    }
}