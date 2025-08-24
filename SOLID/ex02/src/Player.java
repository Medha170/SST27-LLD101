public class Player {
    private IDecoder decoder;
    private IRenderingUI renderer;
    private ICache cache;

    public Player(IDecoder decoder, IRenderingUI renderer, ICache cache) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.cache = cache;
    }

    public void play(byte[] fileBytes) {
        Frame f = decoder.decode(fileBytes);
        renderer.render(f);
        cache.store(f);
        System.out.println("Cached last frame? " + (cache.getLast() != null));
    }
}