public class SimpleDecoder implements IDecoder{

    @Override
    public Frame decode(byte[] fileBytes) {
        return new Frame(fileBytes);
    }
    
}
