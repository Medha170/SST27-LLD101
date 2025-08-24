public class SMSClient extends Client {

    SMSClient(String idString) {
        super(idString);
    }

    @Override
    void send(String body) {
        System.out.println("[SMS to=" + this.idString + "] " + body);
    }
    
}
