package MessageDirect;

import java.util.Scanner;

public class MessageController {
   public int i;


    public MessageController(int i) {
        this.i=i;
    }

    private static void setMessageCode(int i) throws IllegalAccessException, InstantiationException {
        int messageCode = MessageSenderMain.getCode(i);
        String mailTempl = MessageType.getMessageTypeByCode(messageCode).getPersonalMailTempl().getMailTempl();
        MessageType typeOfenum = MessageType.getMessageTypeByCode(messageCode);
        System.out.println(MessageType.valueOf(typeOfenum.toString()));
        MessageSenderMain.sendMessage(mailTempl);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.out.println("Insert 0 or 1 to get message\n 0-Personal type message\n1-Business type message");
        Scanner scanner = new Scanner(System.in);

        setMessageCode(scanner.nextInt());
        scanner.close();
    }

}
