public class Demo02 {
    public static void main(String[] args) {
        ICache cache = new MemoryCache();
        IDecoder decoder = new SimpleDecoder();
        IRenderingUI renderer = new ConsoleRender();

        Player player = new Player(decoder, renderer, cache);
        player.play(new byte[]{1,2,3,4});
    }
}
