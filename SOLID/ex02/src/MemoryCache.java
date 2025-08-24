public class MemoryCache implements ICache{
    private Frame last;

    @Override
    public void store(Frame frame) {
        this.last = frame;
    }

    @Override
    public Frame getLast() {
        return last;
    }
    
}
