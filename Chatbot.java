import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chatbot {
    private Map<String, String> responses;

    public Chatbot() {
        responses = new HashMap<>();
        initializeDefaultResponses();
    }

    private void initializeDefaultResponses() {
        responses.put("hello", "Hello! How can I help you today?");
        responses.put("bye", "Goodbye! Have a great day!");
        responses.put("how are you", "I'm just a bot, but I'm doing great! How about you?");
        // Add more default responses as needed
    }

    public String getResponse(String input) {
        for (String key : responses.keySet()) {
            if (input.toLowerCase().contains(key.toLowerCase())) {
                return responses.get(key);
            }
        }
        return "I'm not sure how to respond to that.";
    }

    public void addOrModifyResponse(String keyword, String response) {
        responses.put(keyword.toLowerCase(), response);
    }

    public void deleteResponse(String keyword) {
        responses.remove(keyword.toLowerCase());
    }

    public void startChat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot is online. Type 'exit' to quit.");
        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Bot: " + getResponse(input));
        }
        scanner.close();
        System.out.println("Chatbot has ended.");
    }

    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();
        chatbot.startChat();
    }
}
