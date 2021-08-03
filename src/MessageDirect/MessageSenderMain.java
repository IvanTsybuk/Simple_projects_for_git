package MessageDirect;

public class MessageSenderMain {
    int i;

    public MessageSenderMain(int i) {
        this.i=i;
    }

    public static int getCode(int i) {

        return i;
    }

    public static void sendMessage(String str) {

        System.out.println(str);

    }
}
