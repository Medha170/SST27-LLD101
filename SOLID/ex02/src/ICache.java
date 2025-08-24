public interface ICache {
    void store(Frame frame);

    Frame getLast();
}
