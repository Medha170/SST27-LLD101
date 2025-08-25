public class Rectangle implements IAreaService, IResizable2D {
    protected int w,h;

    @Override
    public void resize(int h, int w) {
        this.w = w; this.h = h;
    }

    @Override
    public int area() {
        return w*h;
    }
    
}