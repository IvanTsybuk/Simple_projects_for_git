package MessageDirect;

public enum MessageType {
    PERSONAL(0, PersonalMessage.class), BUSINESS(1, BusinessMessage.class);
    private int code;
    private  Class<? extends MailTempl> mailTemp;

    MessageType(int code, Class<? extends MailTempl> mailTemp) {
        this.code = code;
        this.mailTemp = mailTemp;
    }

    public static MessageType getMessageTypeByCode(int code){
        for (MessageType messageType: MessageType.values()){
            if(messageType.code==code)return messageType;}
        throw new RuntimeException();
    }

    public MailTempl getPersonalMailTempl() throws InstantiationException, IllegalAccessException {
        return mailTemp.newInstance();
    }
}
