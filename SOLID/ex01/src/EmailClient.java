public class EmailClient extends Client {

    EmailClient(String idString){
        super(idString);
    }

    public void send(String body) {
        System.out.println("[EMAIL to=" + this.idString + "] " + body);
    }
}