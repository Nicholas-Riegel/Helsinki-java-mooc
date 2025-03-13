import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messageList;

    public MessagingService(){
        messageList = new ArrayList<>();
    }

    //  - adds a message passed as a parameter to the messaging service as long as the message content is at most 280 characters long.
    public void add(Message message){
        if (message.getContent().length() < 281){
            messageList.add(message);
        }
    }

    // - returns the messages added to the messaging service.
    public ArrayList<Message> getMessages(){
        return messageList;
    } 
}
