package MessageDirect;

public class BusinessMessage implements MailTempl {
    @Override
    public String getMailTempl() {
        return "Hello";
    }
}
