public abstract class Client {
    String idString;

    Client(String idString){
        this.idString = idString;
    }

    abstract void send(String body);
}
