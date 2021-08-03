package MessageDirect;

public class PersonalMessage implements MailTempl{

    @Override
    public String getMailTempl() {
        return "Hi!";
    }
}
